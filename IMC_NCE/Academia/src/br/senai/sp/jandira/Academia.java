package br.senai.sp.jandira;

import java.time.LocalDate;

import br.senai.sp.jandira.gui.FrameAcademia;
import br.senai.sp.jandira.model.Pessoa;

public class Academia {

	public static void main(String[] args) {
		FrameAcademia tela = new FrameAcademia();
		tela.criarTela();
		/*Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Joaquin");
		System.out.println("Nome: " + pessoa1.getNome());
		pessoa1.setSexo('M');
		System.out.println("Sexo: " + pessoa1.getSexo());
		LocalDate localDate = LocalDate.now();
		pessoa1.setDataNacimento(localDate.of(2003, 11, 3));
		System.out.println("Idade: " + pessoa1.getIdade());
		pessoa1.setPeso(120);
		System.out.printf("Peso: %.2f\n" , pessoa1.getPeso());
		pessoa1.setAltura(1.80);
		System.out.printf("Altura: %.2f\n" , pessoa1.getAltura());
		System.out.printf("IMC: %.2f\n", pessoa1.getImc());
		System.out.println(pessoa1.getStatusImc());
		pessoa1.setNivelDeAtividade("NENHUMA");
		System.out.println("N�vel de atividade: " + pessoa1.getNivelDeAtividade());
		System.out.printf("De acordo com sua atividade, seu gasto cal�rico �: %.2f\n", pessoa1.getStatusNivelDeAtividade());
		//System.out.println("Ano: " + localDate.getYear());*/
		
		
	}

}
