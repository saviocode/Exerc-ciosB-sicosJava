package projetoCone;

import javax.swing.JOptionPane;

import dados.Cone;

public class ProjetoCone {

	public static void main(String[] args) {
		Cone c1 = new Cone();
		
		float raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para o raio: "));
		c1.setRaio(raio);
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para a altura: "));
		c1.setAltura(altura);
		
		String saida = "Dados do Cone: \n";
		saida += "Raio: " + c1.getRaio() + "\n";
		saida += "Altura: " + c1.getAltura() + "\n";
		saida += "Geratriz: " + c1.calcGeratriz() + "\n";
		saida += "Area Lateral: " + c1.calcAreaLateral() + "\n";
		saida += "Area Total: " + c1.calcAreaTotal() + "\n";
		saida += "Volume: " + c1.calcVolume() + "\n";
		
		JOptionPane.showMessageDialog(null, saida);
	}

}
