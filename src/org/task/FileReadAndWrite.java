package org.task;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadAndWrite {
	private static void FileWrite() throws IOException {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\test.txt");
		DataOutputStream dout = new DataOutputStream(fout);

		String s = "Betty Botter bought some butter\r\n" + "But she said the butter bitter\r\n"
				+ "If I put it in my batter, it will make my batter bitter\r\n"
				+ "But a bit of better butter will make my batter better\r\n"
				+ "So was better Betty Botter bought a bit of better butter";
		dout.write(s.getBytes());

	}

	private static void FileRead() throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\test.txt");
		DataInputStream din = new DataInputStream(fin);

		int re = fin.available();
		byte arr[] = new byte[re];
		din.read(arr);
		for (byte i : arr) {
			char c = (char) i;
			System.out.print(c);
		}
	}

	public static void main(String[] args) throws IOException {
		FileWrite();
		FileRead();
	}

}
