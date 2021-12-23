package nvnamtlu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class io {
	public static boolean saveFile(HashMap<Integer, Student> csdl, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(csdl);
			oos.close();
			fos.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	public static HashMap<Integer, Student> readFile(String path) {
		HashMap<Integer, Student> csdl = new HashMap<>();
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			ois.close();
			fis.close();
			csdl = (HashMap<Integer, Student>) data;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return csdl;
	}
}