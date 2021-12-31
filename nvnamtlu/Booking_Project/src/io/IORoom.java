package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import model.ConferenceRoom;

public class IORoom {
	public static boolean saveFile(ArrayList<ConferenceRoom> listRoom, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			for (ConferenceRoom room : listRoom) {
				String line = room.getId() + ";" + room.getRoomCode() + ";" + room.getPricePerHour() + ";"
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
					room.setId(Integer.parseInt(arr[0]));
					room.setRoomCode(arr[1]);
					room.setPricePerHour(Double.parseDouble(arr[2]));
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
