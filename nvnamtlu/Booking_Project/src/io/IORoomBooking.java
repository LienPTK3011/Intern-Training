package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import model.ConferenceBooking;
import util.DateConverter;
import util.TimeConverter;

public class IORoomBooking {
	public static boolean saveFile(ArrayList<ConferenceBooking> listRoomBooking, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			for (ConferenceBooking roomBooking : listRoomBooking) {
				String line = roomBooking.getId() + ";" + roomBooking.getRoomCode() + ";" + roomBooking.getPrice() + ";"
						+ DateConverter.dateToString(roomBooking.getDay()) + ";"
						+ TimeConverter.timeToString(roomBooking.getStartTime()) + ";"
						+ TimeConverter.timeToString(roomBooking.getEndTime()) + ";" + roomBooking.calculatePrice();
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static ArrayList<ConferenceBooking> readFile(String path) {
		ArrayList<ConferenceBooking> listRoomBooking = new ArrayList<ConferenceBooking>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while (line != null) {
				String[] arr = line.split(";");
				if (arr.length == 7) {
					ConferenceBooking roomBooking = new ConferenceBooking();
					roomBooking.setId(Integer.parseInt(arr[0]));
					roomBooking.setRoomCode(arr[1]);
					roomBooking.setPrice(Double.parseDouble(arr[2]));
					roomBooking.setDay(DateConverter.stringToDate(arr[3]));
					roomBooking.setStartTime(TimeConverter.stringToTime(arr[4]));
					roomBooking.setEndTime(TimeConverter.stringToTime(arr[5]));

					listRoomBooking.add(roomBooking);
				}
				line = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listRoomBooking;
	}
}
