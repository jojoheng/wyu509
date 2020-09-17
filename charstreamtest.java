package ibm.com.testdemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class charstreamtest {
	public static void main(String[] args) throws IOException {
		File filetest = new File("D:\\demo" + File.separator + "test.txt");
		filetest.createNewFile();
		Writer wr = null;
		wr = new FileWriter(filetest, true);
		String connectString = "jmpx509";
		wr.write(connectString);
		wr.close();
		wr = new FileWriter(filetest, true);
		connectString = "ljinheng";
		wr.write(connectString);
		wr.close();

		Reader rd = new FileReader(filetest);
		char[] rdcontext = new char[512];
		int len = rd.read(rdcontext);
		System.out.println(new String(rdcontext, 0, len));
	}
}
