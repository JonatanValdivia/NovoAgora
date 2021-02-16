package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import br.senai.sp.jandira.model.Pessoa;

public class FrameAcademia {
	public void criarTela() throws ParseException { 
		JFrame telaAcademia = new JFrame();
		telaAcademia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaAcademia.setSize(1000, 600);
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
		
		JTextField textDataDeNascimento = new JFormattedTextField(new MaskFormatter("##/##/####"));  
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
		
		JLabel labelSexo = new JLabel();
		labelSexo.setText("Sexo do aluno: ");
		labelSexo.setBounds(10, 300, 100, 30);
		labelSexo.setFont(new Font("Arial", 2, 10));
		labelSexo.setForeground(Color.GRAY);
		
		JRadioButton radioMasculino = new JRadioButton();
		radioMasculino.setText("Masculino");
		radioMasculino.setBounds(10, 330, 100, 30);
		JRadioButton radioFeminino = new JRadioButton();
		radioFeminino.setText("Feminino");
		radioFeminino.setBounds(120, 330, 100, 30);
		
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(radioMasculino);
		radioGroup.add(radioFeminino);
		
		JLabel labelniveisDeAtividade = new JLabel();
		labelniveisDeAtividade.setText("Nível de atividade: ");
		labelniveisDeAtividade.setFont(new Font("Arial", 2, 10));
		labelniveisDeAtividade.setForeground(Color.GRAY);
		labelniveisDeAtividade.setBounds(10, 360, 200, 30);
		
		String niveisDeAtividade[] = {"NENHUMA", "LEVE","MODERADA", "INTENSA", "Selecione um nível de atividade"};
		JComboBox<String> combo = new JComboBox<String>(niveisDeAtividade);
		combo.setBounds(10, 390, 250, 30);
		combo.setSelectedItem(niveisDeAtividade[4]);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("CALCULAR");
		buttonCalcular.setFont(new Font("Arial", 1, 15));
		buttonCalcular.setBackground(Color.green);
		buttonCalcular.setBounds(10, 480, 130, 40);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("LIMPAR");
		buttonLimpar.setFont(new Font("Arial", 1, 15));
		buttonLimpar.setBackground(Color.PINK);
		buttonLimpar.setBounds(150, 480, 130, 40);
		
		JLabel labelResultados = new JLabel();
		labelResultados.setText("Resultados:");
		labelResultados.setFont(new Font("Verdana", 1, 25));
		labelResultados.setBounds(400, 40, 200, 30);
		labelResultados.setForeground(Color.BLUE);
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome: ");
		labelNome.setFont(new Font("Verdana", 1, 15));
		labelNome.setBounds(400, 90, 400, 30);
		
		JLabel labelIdade = new JLabel();
		labelIdade.setText("Idade: ");
		labelIdade.setFont(new Font("Verdana", 1, 15));
		labelIdade.setBounds(400, 120, 100, 30);
			
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC: ");
		labelImc.setFont(new Font("Verdana", 1, 15));
		labelImc.setBounds(400, 150, 200, 30);
		
		JLabel labelStatusImc = new JLabel();
		labelStatusImc.setText("Status IMC: ");
		labelStatusImc.setFont(new Font("Verdana", 1, 15));
		labelStatusImc.setBounds(400, 180, 350, 30);
		
		JLabel labelNivelDeAtividade = new JLabel();
		labelNivelDeAtividade.setText("Nivel de atividade física: ");
		labelNivelDeAtividade.setBounds(400, 210, 460, 30);
		labelNivelDeAtividade.setFont(new Font("Verdana", 1, 15));
		
		JLabel labelNcd = new JLabel();
		labelNcd.setText("NCD: ");
		labelNcd.setFont(new Font("Verdana", 1, 15));
		labelNcd.setBounds(400, 240, 200, 30);
		
		telaAcademia.getContentPane().add(labelNomeDoAluno);
		telaAcademia.getContentPane().add(textNome);
		telaAcademia.getContentPane().add(labelDataDeNascimento);
		telaAcademia.getContentPane().add(textDataDeNascimento);
		telaAcademia.getContentPane().add(labelPeso);
		telaAcademia.getContentPane().add(textPeso);
		telaAcademia.getContentPane().add(labelAltura);
		telaAcademia.getContentPane().add(textAltura);
		telaAcademia.getContentPane().add(labelSexo);
		telaAcademia.getContentPane().add(radioMasculino);
		telaAcademia.getContentPane().add(radioFeminino);
		telaAcademia.getContentPane().add(labelniveisDeAtividade);
		telaAcademia.getContentPane().add(combo);
		telaAcademia.getContentPane().add(buttonCalcular);
		telaAcademia.getContentPane().add(buttonLimpar);
		telaAcademia.getContentPane().add(labelResultados);
		telaAcademia.getContentPane().add(labelNome);
		telaAcademia.getContentPane().add(labelIdade);
		telaAcademia.getContentPane().add(labelImc);
		telaAcademia.getContentPane().add(labelStatusImc);
		telaAcademia.getContentPane().add(labelNivelDeAtividade);
		telaAcademia.getContentPane().add(labelNcd);
		telaAcademia.setVisible(true);
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Pessoa pessoa1 = new Pessoa();
				pessoa1.setNome(textNome.getText());
				String dia = textDataDeNascimento.getText().substring(0, 2);
				String mes = textDataDeNascimento.getText().substring(3, 5);
				String ano = textDataDeNascimento.getText().substring(6, 10);
				pessoa1.setDataNascimento(LocalDate.of(Integer.parseInt(ano), Integer.parseInt(mes), Integer.parseInt(dia)));
				int idade = Period.between(pessoa1.getDataNacimento(), LocalDate.now()).getYears();
				pessoa1.setPeso(Double.parseDouble(textPeso.getText()));
				pessoa1.setAltura(Double.parseDouble(textAltura.getText()));
				pessoa1.setSexo(radioMasculino.isSelected()?'M':'F');
				if(! radioMasculino.isSelected() && !radioFeminino.isSelected()) {
					JOptionPane.showMessageDialog(null, "Selecione o sexo! (Masculino/Feminino), ", null, 1);
				} 				
				pessoa1.setNivelDeAtividade(combo.getSelectedItem().toString());
				if(combo.getSelectedItem().equals("Selecione um nível de atividade")) {
					JOptionPane.showMessageDialog(null, "Opção errada! Selecione um nível de atividade.", null, 1);
				}
				labelNome.setText("Nome: " + pessoa1.getNome());
				labelIdade.setText("Idade: " + pessoa1.getIdade());
				if(idade < 14) {
					JOptionPane.showMessageDialog(null, "Para o NDC ser calculado, a idade deve ser maior que 14 anos!", null, 1);
				}
				labelImc.setText("IMC: " + String.format("%.2f",pessoa1.getImc()));
				labelStatusImc.setText("Status IMC: " + String.valueOf(pessoa1.getStatusImc()));
				labelNivelDeAtividade.setText("Nivel de atividade física: " + (pessoa1.getNivelDeAtividade()));
				labelNcd.setText("NCD: " + String.format("%.2f",pessoa1.getNCDNivelAtividade()));
			}
		});	
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				labelNome.setText("Nome: ");
				labelIdade.setText("Idade: ");
				labelImc.setText("IMC: ");
				labelStatusImc.setText("Status IMC: ");
				labelNivelDeAtividade.setText("Nivel de atividade física: ");
				labelNcd.setText("NCD: ");
				
				textNome.setText(null);
				textDataDeNascimento.setText(null);
				textPeso.setText(null);
				textAltura.setText(null);
				radioGroup.clearSelection();
				combo.setSelectedItem(niveisDeAtividade[4]);
				
			}
		});
	}
}
