package br.senai.sp.jandira.model;
import java.time.LocalDate;
import java.time.Period;

public class Aluno {
	private String nome;
	private LocalDate dataNascimento;
	private double peso;
	private double altura;
	private char sexo;
	private String status;
	private String statusAluno;
	
	LocalDate localDate = LocalDate.now();
	
	public double getImc() {
		return this.getPeso()/(this.getAltura() * this.getAltura());
		
	}
	
	private void setStatus(String status) {
		this.status = status;
		
	}
	
	public String getStatus(){
		
		if(this.getImc() <= 18.5) { 
			return "Você está abaixo do peso!";
		} else if(this.getImc() > 18.5 && this.getImc() <= 24.9){
			return "Peso ideal!";
		} else if(this.getImc() > 24.9 && this.getImc() <= 29.9) {
			return "Acima do peso!";
		} else if(this.getImc() > 29.9 && this.getImc() <= 34.9) {
			return "Obesdidade grau 1";
		} else if(this.getImc() > 34.9 && this.getImc() <= 39.9) {
			return "Obesidade grau 2";
		} else{
			return "Obesidade móbida!";
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setDataNacimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public LocalDate getDataNacimento() {
		return this.dataNascimento;
	}
	
	
	//Obter o dia/mes/ano - agora. O momento atual.
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(this.getDataNacimento(), hoje);
		return periodo.getYears();
	}
	
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
		if(this.getSexo() == 'F') {
			if(this.getSexo() == 'M'){
			}
		}else {
			System.out.println("Especifique o sexo!(M/H)");
		}
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public void setStatusAluno(String statusAluno) {
		this.statusAluno = statusAluno;
	}
}

/*if(this.getImc() <= 18.5) { 
			System.out.println("Você está abaixo do peso!");
			if (this.getImc() >= 18.5 && this.getImc() <= 24.9) {
				System.out.println("Peso normal!");
				if(this.getImc() >= 24.9 && this.getImc() <= 29.9) {
					System.out.println("Acima do peso!");
					if(this.getImc() >= 29.9 || this.getImc() <= 34.9) {
						System.out.println("Obesidade grau 1");
						if(this.getImc() >= 34.9 || this.getImc() <= 39.9) {
							System.out.println("Obesidade grau 2");
							if(this.getImc() > 39.9) {
								System.out.println("Obesidade mórbida!");
							}
						}
					}
				}
			}
		}*/
