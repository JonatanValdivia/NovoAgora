package br.senai.sp.jandira;

import java.time.LocalDate;

import br.senai.sp.jandira.model.Aluno;

public class Academia {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alice");
		aluno1.setSexo('F');
		System.out.println(aluno1.getSexo()); 
		aluno1.setPeso(130);
		aluno1.setAltura(1.80);
		System.out.println(aluno1.getImc());
		System.out.println(aluno1.getStatus());
		LocalDate localDate = LocalDate.now();
		aluno1.setDataNacimento(localDate.of(2003, 11, 3));
		System.out.println(aluno1.getIdade());
		//System.out.println("Ano: " + localDate.getYear());
		
		
	}

}
