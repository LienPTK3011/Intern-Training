/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl01;

import btl01.name.Seat;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Seatio {
	public static boolean save(ArrayList<Seat> listSeat, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			for (Seat seat : listSeat) {
				String line = seat.getId() + ";" + seat.getSetcode() + ";" + seat.getPriceperhour() + ";"
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

	public static ArrayList<Seat> read(String path) {
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
					seat.setId(arr[0]);
					seat.setSetcode(arr[1]);
					seat.setPriceperhour(arr[2]);
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
