package br.edu.infnet.appsdim.aula01;

import java.util.ArrayList;
import java.util.List;

public class ExemploTeste {
	
	public static void main(String[] args) {
		
		// Entrada dos dados
		String[] nomes = {"Wang", "Maria", "José"};
	
		String[] emails = {"wang@gmail.com", "maria@gmail.com", "jose@gmail.com"};
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		//Criando Objetos : populando a coleção
		for(int i = 0; i < nomes.length; i++){
			Aluno aluno = new Aluno();
			aluno.setId(i+1);
			aluno.setNome(nomes[i]);
			aluno.setEmail(emails[i]);
			alunos.add(aluno);
		
		}
		
		//Leitura da coleção
		for(Aluno item : alunos) {
			System.out.println(item);
		}
	}

}
