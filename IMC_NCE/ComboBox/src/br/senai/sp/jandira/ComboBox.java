package br.senai.sp.jandira;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame {
	//A JComboBox não pode ser feita usando tipos primitivos 
	//Como: char, int, double. Teria que usar String, Integer, Double... 
	private String paises[] = { "Brasil", "Argentina", "Japão", "Estados Unidos", "Selecione um país"};
	private String um[] = {"eu", "ela", "funalo", "ciclano"};
	JComboBox<String> combo = new JComboBox<String>(paises);	

	public ComboBox() {
		setLayout(new FlowLayout());
		add(combo);
		setSize(400,300);
		combo.setSelectedItem(paises[4]);
		/*Este comando : ***System.out.println(combo.getSelectedIndex());*** 
		  retorna apenas um objeto, não a String que estamos usando. 
		  Por isso devemos convertê-lo dessa forma:   */
		System.out.println(String.valueOf(combo.getSelectedItem()));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboBox();

	}

}
