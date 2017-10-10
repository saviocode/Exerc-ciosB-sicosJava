package projetoParalelepipido;

import javax.swing.JOptionPane;

import dados.Paralelepipido;

public class ProjetoParalelepipido {

	public static void main(String[] args) {
		Paralelepipido p1 = new Paralelepipido();

		float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para a altura: "));
		p1.setAltura(altura);
		float largura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para largura: "));
		p1.setLargura(largura);
		float comprimento = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para o comprimento: "));
		p1.setComprimento(comprimento);
		
		String saida = "Dados do Paralelepipido: \n";
		saida += "Altura: " + p1.getAltura() + "\n";
		saida += "Largura: " + p1.getLargura() + "\n";
		saida += "Comprimento: " + p1.getComprimento() + "\n";
		saida += "Volume: " + p1.calcVolume() + "\n";
		saida += "Area: " + p1.calcArea() + "\n";
		
		JOptionPane.showMessageDialog(null, saida);
	}

}
