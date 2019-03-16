package util;

import java.io.*;

public class ReadAndWriteFile {


	public static void main(String args[]) throws IOException {
//		copyFile();

		writeFile("hhh.txt","hello");


	}


	//read and write binary file;
	public static void copyFile() throws IOException {

		FileInputStream readFile = new FileInputStream(new File("D:\\1.jpg"));

		FileOutputStream writeFile = new FileOutputStream(new File("D:\\2.jpg"));

		int b;

		while((b = readFile.read()) != -1){

			writeFile.write(b);
		}
	}




	/**
	 * 读入TXT文件
	 */
	public static StringBuffer readFile(String pathname) {
		StringBuffer content = new StringBuffer();

		//String pathname = "input.txt"; // 绝对路径或相对路径都可以，写入文件时演示相对路径,读取以上路径的input.txt文件

		//防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw;
		//不关闭文件会导致资源的泄露，读写文件都同理
		//Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
		try (FileReader reader = new FileReader(pathname);
			 BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
		) {
			String line;
			//网友推荐更加简洁的写法
			while ((line = br.readLine()) != null) {
				// 一次读入一行数据
				content.append(line);
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return content;
	}

	/**
	 * 写入TXT文件
	 */
	public static void writeFile(String pathname, String content) throws IOException {
		FileWriter writer = new FileWriter(new File(SysInfo.getInitFolder()+pathname));

		writer.write(content);

		writer.flush();
	}

}
