package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import model.SeatBooking;
import util.DateConverter;
import util.TimeConverter;

public class IOSeatBooking {
	public static boolean saveFile(ArrayList<SeatBooking> listSeatBooking, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			for (SeatBooking seatBooking : listSeatBooking) {
				String line = seatBooking.getId() + ";" + seatBooking.getSeatCode() + ";" + seatBooking.getPrice() + ";"
						+ DateConverter.dateToString(seatBooking.getDay()) + ";"
						+ TimeConverter.timeToString(seatBooking.getStartTime()) + ";"
						+ TimeConverter.timeToString(seatBooking.getEndTime()) + ";" + seatBooking.calculatePrice();
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

	public static ArrayList<SeatBooking> readFile(String path) {
		ArrayList<SeatBooking> listSeatBooking = new ArrayList<SeatBooking>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while (line != null) {
				String[] arr = line.split(";");
				if (arr.length == 7) {
					SeatBooking roomBooking = new SeatBooking();
					roomBooking.setId(Integer.parseInt(arr[0]));
					roomBooking.setSeatCode(arr[1]);
					roomBooking.setPrice(Double.parseDouble(arr[2]));
					roomBooking.setDay(DateConverter.stringToDate(arr[3]));
					roomBooking.setStartTime(TimeConverter.stringToTime(arr[4]));
					roomBooking.setEndTime(TimeConverter.stringToTime(arr[5]));

					listSeatBooking.add(roomBooking);
				}
				line = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listSeatBooking;
	}
}
