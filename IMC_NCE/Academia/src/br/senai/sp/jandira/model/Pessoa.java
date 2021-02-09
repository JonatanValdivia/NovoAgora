package br.senai.sp.jandira.model;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private double peso;
	private double altura;
	private char sexo;
	private String status;
	private String nivelDeAtividade;
	private String statusAluno;
	
	LocalDate localDate = LocalDate.now();
	
	public double getImc() {
		return this.getPeso()/(this.getAltura() * this.getAltura());
	}
	
	//14,7 x peso + 496
	//8,7 x peso + 829
	//10,5 x peso + 596.
	public double getNdc() {
		if(this.getSexo() == 'M' && this.getIdade() >= 14 && this.getIdade() <= 30) {
			return 15.3 * this.getPeso() + 679;
		} else if(this.getSexo() == 'M' && this.getIdade() > 30 && this.getIdade() <= 60) {
			return 11.6 * this.getPeso() + 879;
		} else if(this.getSexo() == 'M' && this.getIdade() > 60) {
			return 13.5 * this.getPeso() + 487;
		} else if(this.getSexo() == 'F' && this.getIdade() >= 14 && this.getIdade() <= 30){
			return 14.7 * this.getPeso() + 496;
		} else if(this.getSexo() == 'F' && this.getIdade() > 30 && this.getIdade() <= 60) {
			return 8.7 * this.getPeso() + 829;
		} else if(this.getSexo() == 'F' && this.getIdade() > 60) {
			return 10.5 * this.getPeso() + 596;
		} else {
			return 0;
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
			
		}else if(this.getSexo() == 'M'){
			
		}else {
			System.out.println("Especifique o sexo!(F/M)");
		}
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public String getStatusImc(){
		
		if(this.getImc() <= 18.5) { 
			return "Voc� est� abaixo do peso!";
		} else if(this.getImc() > 18.5 && this.getImc() <= 24.9){
			return "Peso ideal!";
		} else if(this.getImc() > 24.9 && this.getImc() <= 29.9) {
			return "Acima do peso!";
		} else if(this.getImc() > 29.9 && this.getImc() <= 34.9) {
			return "Obesdidade grau 1";
		} else if(this.getImc() > 34.9 && this.getImc() <= 39.9) {
			return "Obesidade grau 2";
		} else{
			return "Obesidade m�rbida!";
		}
	}
	
	
	public void setNivelDeAtividade(String nivelDeAtividade) {
		this.nivelDeAtividade = nivelDeAtividade;
		if(this.getSexo() == 'M' && this.getNivelDeAtividade() == "NENHUMA"){
		
		} else if(this.getSexo() == 'M' && this.getNivelDeAtividade() == "LEVE") {
			
		} else if(this.getSexo() == 'M' && this.getNivelDeAtividade() == "MODERADA") {
			
		} else if(this.getSexo() == 'M' && this.getNivelDeAtividade() == "INTENSA") {
			
		}else if(this.getSexo() == 'F' && this.getNivelDeAtividade() == "NENHUMA" ) {
			
		} else if(this.getSexo() == 'F' && this.getNivelDeAtividade() == "LEVE") {
			
		} else if(this.getSexo() == 'F' && this.getNivelDeAtividade() == "MODERADA") {
		
		} else if(this.getSexo() == 'F' && this.getNivelDeAtividade() == "INTENSA") {
			
		}
		
		else {
			System.out.println("Especifique o seu sexo e/ou especifique o seu n�vel de atividade f�sica.");
		}
	}
	
	public String getNivelDeAtividade() {
		return this.nivelDeAtividade;
	}
	
	public double getStatusNivelDeAtividade() {
		if(this.getNivelDeAtividade() == "NENHUMA" && this.getSexo() == 'M'){
			return this.getNdc();
		} else if(this.getNivelDeAtividade() == "LEVE" && this.getSexo() == 'M') {
			return this.getNdc() * 1.5;
		} else if(this.getNivelDeAtividade() == "MODERADA" && this.getSexo() == 'M') {
			return this.getNdc() * 1.8;
		} else if(this.getNivelDeAtividade() == "INTENSA" && this.getSexo() == 'M') {
			return this.getNdc() * 2.1;
		} else if(this.getNivelDeAtividade() == "NENHUMA" && this.getSexo() == 'F'){
			return this.getNdc();
		} else if(this.getNivelDeAtividade() == "LEVE" && this.getSexo() == 'F') {
			return this.getNdc() * 1.6;
		} else if(this.getNivelDeAtividade() == "MODERADA" && this.getSexo() == 'F') {
			return this.getNdc() * 1.6;
		} else if(this.getNivelDeAtividade() == "INTENSA" && this.getSexo() == 'F') {
			return this.getNdc() * 1.8;
		} else {
			return 00;
		}
	}
	
	public void setStatusAluno(String statusAluno) {
		this.statusAluno = statusAluno;
	}
}