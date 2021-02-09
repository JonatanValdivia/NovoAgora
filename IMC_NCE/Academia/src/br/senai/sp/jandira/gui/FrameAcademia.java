package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.Academia;
import br.senai.sp.jandira.model.Pessoa;

public class FrameAcademia {
	public void criarTela() { 
		JFrame telaAcademia = new JFrame();
		telaAcademia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaAcademia.setSize(800, 600);
		telaAcademia.setTitle("IMC e NDC");
		telaAcademia.setLayout(null);
		telaAcademia.setLocationRelativeTo(null);
		
		JLabel labelNomeDoAluno = new JLabel();
		labelNomeDoAluno.setFont(new Font("Arial", 2, 10));
		labelNomeDoAluno.setText("Nome do aluno: ");
		labelNomeDoAluno.setForeground(Color.GRAY);
		labelNomeDoAluno.setBounds(10, 40, 100, 30);
		
		JTextField textNome = new JTextField();
		textNome.setBounds(10, 70, 200, 30);
		
		JLabel labelDataDeNascimento = new JLabel();
		labelDataDeNascimento.setText("Data de nascimento: ");
		labelDataDeNascimento.setBounds(10, 110, 100, 30);
		labelDataDeNascimento.setForeground(Color.GRAY);
		labelDataDeNascimento.setFont(new Font("Arial", 2, 10));
		
		JTextField textDataDeNascimento = new JTextField();
		textDataDeNascimento.setBounds(10, 140, 100, 30);
		
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso do aluno: ");
		labelPeso.setFont(new Font("Arial", 2, 10));
		labelPeso.setForeground(Color.GRAY);
		labelPeso.setBounds(10, 180, 200, 30);
		
		JTextField textPeso = new JTextField();
		textPeso.setBounds(10, 210, 100, 30);
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura do alno: ");
		labelAltura.setBounds(10, 240, 200, 30);
		labelAltura.setFont(new Font("Arial", 2, 10));
		labelAltura.setForeground(Color.GRAY);
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds(10, 270, 100, 30);
		
		JLabel labelResultados = new JLabel();
		labelResultados.setText("Resultados:");
		labelResultados.setFont(new Font("Verdana", 1, 25));
		labelResultados.setBounds(400, 40, 200, 30);
		labelResultados.setForeground(Color.BLUE);
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome: ");
		labelNome.setFont(new Font("Verdana", 1, 15));
		labelNome.setBounds(400, 90, 100, 30);
		
		JLabel labelIdade = new JLabel();
		labelIdade.setText("Idade: ");
		labelIdade.setFont(new Font("Verdana", 1, 15));
		labelIdade.setBounds(400, 120, 100, 30);
		
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC: ");
		labelImc.setFont(new Font("Verdana", 1, 15));
		labelImc.setBounds(400, 150, 100, 30);
		
		JLabel labelStatusImc = new JLabel();
		labelStatusImc.setText("Status IMC: ");
		labelStatusImc.setFont(new Font("Verdana", 1, 15));
		labelStatusImc.setBounds(400, 180, 120, 30);
		
		JLabel labelNcd = new JLabel();
		labelNcd.setText("NCD: ");
		labelNcd.setFont(new Font("Verdana", 1, 15));
		labelNcd.setBounds(400, 210, 100, 30);
		
		telaAcademia.getContentPane().add(labelNomeDoAluno);
		telaAcademia.getContentPane().add(textNome);
		telaAcademia.getContentPane().add(labelDataDeNascimento);
		telaAcademia.getContentPane().add(textDataDeNascimento);
		telaAcademia.getContentPane().add(labelPeso);
		telaAcademia.getContentPane().add(textPeso);
		telaAcademia.getContentPane().add(labelAltura);
		telaAcademia.getContentPane().add(textAltura);
		telaAcademia.getContentPane().add(labelResultados);
		telaAcademia.getContentPane().add(labelNome);
		telaAcademia.getContentPane().add(labelIdade);
		telaAcademia.getContentPane().add(labelImc);
		telaAcademia.getContentPane().add(labelStatusImc);
		telaAcademia.getContentPane().add(labelNcd);
		
		telaAcademia.setVisible(true);
	}
	//JComboBox
	//JRadioButton radioMasculino = new JRadioBurron();
	//ButtonGrop
	
	//JRadioButton radioFeminino = new JRadioBurron();
}
