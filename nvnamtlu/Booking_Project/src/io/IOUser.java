package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import model.User;

public class IOUser {
	public static boolean saveFile(ArrayList<User> listUser, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			for (User user : listUser) {
				String line = user.getUsername() + ";" + user.getPassword();
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

	public static ArrayList<User> readFile(String path) {
		ArrayList<User> listUser = new ArrayList<User>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while (line != null) {
				String[] arr = line.split(";");
				if (arr.length == 2) {
					User user = new User();
					user.setUsername(arr[0]);
					user.setPassword(arr[1]);

					listUser.add(user);
				}
				line = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listUser;
	}
}
