package br.com.alura.javaio.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteFileWrite {
	public static void main(String[] args) throws IOException {

PrintWriter pw = new PrintWriter("lorem2.txt");
		
		pw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//        pw.newLine(); 
		pw.write(System.lineSeparator());
		pw.println("Testasndo o println no pw");
        pw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
        
        
        pw.close();
        
//        PrintStream nao tem o metodo write, nem o newline
        PrintStream ps = new PrintStream("lorem3.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//		ps.println(System.lineSeparator());  //funciona tbm, porem o println ja escreve e pula linha
        ps.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
        
        pw.close();
		
	}
}
