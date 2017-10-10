package projetoRetangulo;

import javax.swing.JOptionPane;

import dados.Retangulo;

public class ProjetoRetangulo {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo();
		
		float comprimento = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do comprimento: "));
		r1.setComprimento(comprimento);
		float largura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da largura: "));
		r1.setLargura(largura);
		
		String saida = "Dados do retangulo: \n";
		saida += "Comprimento: " + r1.getComprimento() + "\n";
		saida += "Largura: " + r1.getLargura() + "\n";
		saida += "Perimetro: " + r1.calcPerimetro() + "\n";
		saida += "Area: " + r1.calcArea() + "\n";
		
		JOptionPane.showMessageDialog(null, saida);

	}

}
