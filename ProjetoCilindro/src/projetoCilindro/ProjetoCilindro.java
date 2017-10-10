package projetoCilindro;

import javax.swing.JOptionPane;

import dados.Cilindro;

public class ProjetoCilindro {

	public static void main(String[] args) {
		Cilindro c1 = new Cilindro();
		
		float raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para o raio: "));
		c1.setRaio(raio);
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para a altura: "));
		c1.setAltura(altura);
		
		String saida = "Dados do cilindro: \n";
		saida += "Raio: " + c1.getRaio() + "\n";
		saida += "Altura: " + c1.getAltura() + "\n";
		saida += "Area lateral: " + c1.calcAreaLateral() + "\n";
		saida += "Area total: " + c1.calcAreaTotal() + "\n";
		saida += "Volume: " + c1.calcVolume() + "\n";
		
		JOptionPane.showMessageDialog(null, saida);

	}

}
