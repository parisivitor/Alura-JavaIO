package br.com.alura.javaio.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestePrintStreamWrite {
	public static void main(String[] args) throws IOException {

//		FileWriter fw = new FileWriter("lorem2.txt");
//		
//		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
////        fw.newLine(); nao tem o newLine() no FileWrite
//		fw.write(System.lineSeparator());
//        fw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
//        
//        fw.close();
		
//		adicionando BufeeredWrite para encapsular o FileWrite
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
//		mesma coisa
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine(); 
//		bw.write(System.lineSeparator());
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
        
        bw.close();
		
	}
}
