package booking_project;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class IoUser {
	public static ArrayList<User> readFile(String path) {
		ArrayList<User> listUser = new ArrayList<User>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while(line!=null) {
				String[] arr = line.split(";");
				if(arr.length==2) {
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
