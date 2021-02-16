package br.senai.sp.jandira.model;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa{
	private String nome;
	private LocalDate dataNascimento;
	private double peso;
	private double altura;
	private char sexo;
	private String nivelDeAtividade;
	 
	public double getImc() {
		return this.getPeso()/(this.getAltura() * this.getAltura());
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
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
		
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public String getStatusImc(){
		
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
			return "Obesidade mórbida!";
		}
	}
	
	
	public void setNivelDeAtividade(String nivelDeAtividade) {
		this.nivelDeAtividade = nivelDeAtividade;
		
	}
	
	public String getNivelDeAtividade() {
		return this.nivelDeAtividade;
	}
	
	public double getNcd() {
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
	
	public double getNCDNivelAtividade() {
		if(this.getNivelDeAtividade() == "NENHUMA" && this.getSexo() == 'M'){
			return this.getNcd();
		} else if(this.getNivelDeAtividade() == "LEVE" && this.getSexo() == 'M') {
			return this.getNcd() * 1.5;
		} else if(this.getNivelDeAtividade() == "MODERADA" && this.getSexo() == 'M') {
			return this.getNcd() * 1.8;
		} else if(this.getNivelDeAtividade() == "INTENSA" && this.getSexo() == 'M') {
			return this.getNcd() * 2.1;
		} else if(this.getNivelDeAtividade() == "NENHUMA" && this.getSexo() == 'F'){
			return this.getNcd();
		} else if(this.getNivelDeAtividade() == "LEVE" && this.getSexo() == 'F') {
			return this.getNcd() * 1.6;
		} else if(this.getNivelDeAtividade() == "MODERADA" && this.getSexo() == 'F') {
			return this.getNcd() * 1.6;
		} else if(this.getNivelDeAtividade() == "INTENSA" && this.getSexo() == 'F') {
			return this.getNcd() * 1.8;
		} else {
			return 00;
		}
	}
}
