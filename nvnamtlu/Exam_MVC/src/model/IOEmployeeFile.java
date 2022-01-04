package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class IOEmployeeFile {
	public static boolean saveFile(ArrayList<Employee> listEmps, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			for (Employee emp : listEmps) {
				String line = emp.getId() + ";" + emp.getName() + ";" + emp.getDepartment() + ";"
						+ emp.getSkill();
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

	public static ArrayList<Employee> readFile(String path) {
		ArrayList<Employee> listEmps = new ArrayList<Employee>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while (line != null) {
				String[] arr = line.split(";");
				if (arr.length == 4) {
					Employee emp = new Employee();
					emp.setId(Integer.parseInt(arr[0]));
					emp.setName(arr[1]);
					emp.setDepartment(arr[2]);;
					emp.setSkill(arr[3]);;

					listEmps.add(emp);
				}
				line = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listEmps;
	}
}
