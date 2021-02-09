package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
		
		JLabel labelResultados = new JLabel();
		labelResultados.setText("Resultados:");
		labelResultados.setFont(new Font("Verdana", 1, 25));
		labelResultados.setBounds(400, 30, 200, 30);
		labelResultados.setForeground(Color.BLUE);
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome: ");
		labelNome.setFont(new Font("Verdana", 1, 15));
		labelNome.setBounds(400, 70, 100, 30);
		
		JLabel labelIdade = new JLabel();
		labelIdade.setText("Idade: ");
		labelIdade.setFont(new Font("Verdana", 1, 15));
		labelIdade.setBounds(400, 100, 100, 30);
		
		telaAcademia.getContentPane().add(labelResultados);
		telaAcademia.getContentPane().add(labelNome);
		telaAcademia.getContentPane().add(labelIdade);
		telaAcademia.setVisible(true);
	}
	//JComboBox
	//JRadioButton radioMasculino = new JRadioBurron();
	//ButtonGrop
	
	//JRadioButton radioFeminino = new JRadioBurron();
}
