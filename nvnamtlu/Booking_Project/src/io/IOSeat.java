package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import model.Seat;

public class IOSeat {
	public static boolean saveFile(ArrayList<Seat> listSeat, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			for (Seat seat : listSeat) {
				String line = seat.getId() + ";" + seat.getSeatCode() + ";" + seat.getPricePerHour() + ";"
						+ seat.getNote();
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

	public static ArrayList<Seat> readFile(String path) {
		ArrayList<Seat> listSeat = new ArrayList<Seat>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while (line != null) {
				String[] arr = line.split(";");
				if (arr.length == 4) {
					Seat seat = new Seat();
					seat.setId(Integer.parseInt(arr[0]));
					seat.setSeatCode(arr[1]);
					seat.setPricePerHour(Double.parseDouble(arr[2]));
					seat.setNote(arr[3]);

					listSeat.add(seat);
				}
				line = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listSeat;
	}
}
