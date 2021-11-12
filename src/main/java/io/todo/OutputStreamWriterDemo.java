package io.todo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterDemo {
	public static void main(String[] args) {
		try {
		File f = new File("d:" + File.separator + "test.txt");
		// 利用转换流，将字节输出流变成字符输出流，并用字符接收
		Writer writer = new OutputStreamWriter(new FileOutputStream(f));
		writer.write("hello world");
		writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
