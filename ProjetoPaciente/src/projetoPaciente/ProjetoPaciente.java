package projetoPaciente;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

import dados.Paciente;

public class ProjetoPaciente {
	public static void main(String[] args){
		Paciente p1 = new Paciente();
		DecimalFormat df = new DecimalFormat("0.00");
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		p1.setNome(nome);
		float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso: "));
		p1.setPeso(peso);
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite su altura:"));
		p1.setAltura(altura);
		
				
		String saida = "===Dados do Paciente=== \n";
		saida += "Nome: " + p1.getNome() + "\n";
		saida += "Peso: " + p1.getPeso() + "\n";
		saida += "Altura: " + p1.getAltura() + "\n";	
		saida += "Seu IMC: " + df.format(p1.calcIMC()) + "\n";
		saida += "Faixa de Peso: " + p1.faixaDePeso() + "\n";
				
		JOptionPane.showMessageDialog(null, saida);		
	}	
}
