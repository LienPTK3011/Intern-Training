/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl01.file;

import btl01.name.ConferenceRoom;
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
public class Roomio {
    public static boolean save(ArrayList<ConferenceRoom> listRoom, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			for (ConferenceRoom room : listRoom) {
				String line = room.getId() + ";" + room.getRoomcode() + ";" + room.getPriceperhour() + ";"
						+ room.getNote();
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

	public static ArrayList<ConferenceRoom> readFile(String path) {
		ArrayList<ConferenceRoom> listRoom = new ArrayList<ConferenceRoom>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while (line != null) {
				String[] arr = line.split(";");
				if (arr.length == 4) {
					ConferenceRoom room = new ConferenceRoom();
					room.setId(arr[0]);
					room.setRoomcode(arr[1]);
					room.setPriceperhour(Double.parseDouble(arr[2]));
					room.setNote(arr[3]);

					listRoom.add(room);
				}
				line = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listRoom;
	}
}
