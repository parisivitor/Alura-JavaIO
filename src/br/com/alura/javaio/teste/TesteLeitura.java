package br.com.alura.javaio.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha); //pegar item por item da linha sepador por "," 
			linhaScanner.useLocale(Locale.US);		//tipo de formatacao para casa decimais se é por , ou por .
			linhaScanner.useDelimiter(",");			// deletimar o separador de cada item da linha
				
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
//			String linhaFormatada = String.format(" %s -> %04d:%08d - %20s - Saldo: R$ %08.3f ", tipoConta, agencia, numero, titular, saldo);
//			System.out.println(linhaFormatada);
//			os dois jeitos dao certo
			System.out.format(" %s -> %04d:%08d - %20s - Saldo: R$ %08.3f %n", tipoConta, agencia, numero, titular, saldo);
		
			linhaScanner.close();
		}
		
		scanner.close();
	}

}
