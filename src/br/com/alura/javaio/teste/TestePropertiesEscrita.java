package br.com.alura.javaio.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestePropertiesEscrita {

	public static void main(String[] args) throws IOException {
		
		Properties props = new Properties();
		props.setProperty("login", "alura");
		props.setProperty("senha", "123123123");
		props.setProperty("endereco", "www.alura.com.br");
		props.store(new FileWriter("conf.properties"), "algum comentário");
		
		
		
	}

}
