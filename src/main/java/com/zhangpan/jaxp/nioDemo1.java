package com.zhangpan.jaxp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class nioDemo1 {
	public static void main(String[] args) throws FileNotFoundException {
		String infile = "d:\\Javastudy/mina.txt";
		String outfile = "e:\\a.txt";
		//获取目标文件夹
		FileInputStream fin = new FileInputStream(infile);
		FileOutputStream fout = new FileOutputStream(outfile);
		//获取输入输出通道
		FileChannel fcin = fin.getChannel();
		FileChannel fcout = fout.getChannel();
	}
}
