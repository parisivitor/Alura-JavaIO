package br.com.alura.javaio.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;



public class TesteIO {

	public static void main(String[] args) throws IOException{
		
/**
 * no javaIO existe 3 tipos de comunicaçao
 * arquivo \			/ arquivo
 * rede  --- Aplicacao  --rede
 * console /			\console
 * com isso pode entra arquivo sair em console
 * entrar rede e sair arquivo, e por assim vai;
 * 
 * 
 */
		
//		leitura de arquivo;
		InputStream fis = System.in; 						 //Entrada por console	
//		InputStream fis = new FileInputStream("lorem.txt");  //Entrada por arquivo
		Reader isr = new InputStreamReader(fis , "UTF-8");
		BufferedReader br = new BufferedReader(isr);
//		os 2 jeitos são identicos 
		BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream("lorem.txt"))); 
		
//		gravar em um arquivo, sobrescrita;			
//		OutputStream fos = System.out; 							//Saida no console	
		OutputStream fos = new FileOutputStream("lorem2.txt");  //Saida no arquivo
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
//		os 2 jeitos sao identicos		
		BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("lorem2.txt")));
		
		
		String linha = br.readLine();
		int i=1;
//		!linha.isEmpty()  diferente de vazio
		while( linha != null && !linha.isEmpty()) {
			bw.write("Linha " +  i + ": " + linha);//print line
			bw.newLine();// pula linha
			bw.flush();  //sem o bw.flush por ser um Buffered o codigo so vai para o console ou txt no fim do laco, com o flush ele vai a cada passagem do while;
//			System.out.println(linha);
			linha = br.readLine(); //move para proxima linha
			i++;
		}
		
		
		br.close();
		bw.close();
	}

}
