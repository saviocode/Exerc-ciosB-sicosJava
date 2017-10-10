package projetoEsfera;

import javax.swing.JOptionPane;

import dados.Esfera;

public class ProjetoEsfera {

	public static void main(String[] args) {
		Esfera e1 = new Esfera();
		
		float raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para o raio: "));
		e1.setRaio(raio);
		
		String saida = "Dados da esfera: \n";
		saida += "Raio: " + e1.getRaio() + "\n";
		saida += "Area: " + e1.calcArea() + "\n";
		saida += "Volume: " + e1.calcVolume() + "\n";
		
		JOptionPane.showMessageDialog(null, saida);

	}

}
