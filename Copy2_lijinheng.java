package day4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy2_lijinheng {
	public static void main(String[] args) throws IOException {

		FileInputStream first = new FileInputStream("D:\\test\\myfile.txt");
		BufferedInputStream bi = new BufferedInputStream(first);
		FileOutputStream second = new FileOutputStream("D:\\test2\\myfile_cp2.txt");
		BufferedOutputStream bo = new BufferedOutputStream(second);

		int length = -1;

		while ((length = bi.read()) != -1) {
			bo.write(length);
		}
		System.out.println("¸´ÖÆÍê³É");
		bi.close();
		bo.close();

	}
}
