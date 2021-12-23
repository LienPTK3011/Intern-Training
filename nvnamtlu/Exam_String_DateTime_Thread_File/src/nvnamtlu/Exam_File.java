package nvnamtlu;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Exam_File {
	
	//a.Tạo phương thức append nội dung 2 file vào với nhau thành 1 file duy nhất
	public static void append2File(Path f1, Path f2) throws IOException {
		String str = "";
		//Lấy nội dung file1 vào str
		BufferedReader br1 = null;
		try {
			br1 = new BufferedReader(Files.newBufferedReader(f1));
			String line1 = null;
			int i=0;
			while((line1 = br1.readLine()) != null) {
				str+=line1+"\n";
			}
		} finally {
			if(br1!=null) {
				br1.close();
			}
		}
		
		//Lấy nội dung file2 vào str2
		BufferedReader br2 = null;
		try {
			br2 = new BufferedReader(Files.newBufferedReader(f2));
			String line2 = null;
			int i=0;
			while((line2 = br2.readLine()) != null) {
				str+=line2+"\n";
			}
		} finally {
			if(br2!=null) {
				br2.close();
			}
		}
		
		//Ghi str vào file mới
		Path fileTong = Paths.get("G:/data/fileTong.txt");
		byte[] data = str.getBytes();
		OutputStream os = null;
		try {
			os = new BufferedOutputStream(Files.newOutputStream(fileTong
					, StandardOpenOption.CREATE, StandardOpenOption.APPEND));
			os.write(data, 0, data.length);
		} finally {
			if(os!=null) {
				os.close();
			}
		}
	}
	
	//b.Tạo phương thức đọc 3 dòng đầu tiên của file
	public static void read3LineFirst(Path f) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(Files.newBufferedReader(f));
			String line = null;
			int i=0;
			while((line = br.readLine()) != null) {
				System.out.println(line);
				i++;
				if(i==3) {
					break;
				}
			}
		} finally {
			if(br!=null) {
				br.close();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		//a.append nội dung 2 file vào với nhau thành 1 file duy nhất
		Path file1 = Paths.get("G:/data/file1.txt");
		Path file2 = Paths.get("G:/data/file2.txt");
		append2File(file1, file2);
		
		//b.đọc 3 dòng đầu tiên của file text.txt
		Path file = Paths.get("G:/data/text.txt");
		read3LineFirst(file); //
	}
}
