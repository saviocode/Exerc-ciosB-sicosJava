package projetoPiramide;
import javax.swing.JOptionPane;

import dados.Piramide;
public class ProjetoPiramide {

	public static void main(String[] args) {
		Piramide kelps = new Piramide();
		
		float numeroBase = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para base: "));		
		kelps.setBase(numeroBase);
		
		float numeroAltura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para altura:"));
		kelps.setAltura(numeroAltura);
		
		String saida = "Dados da Piramide kelps: \n";
		saida += "Base: " + kelps.getBase() + "\n";
		saida += "Altura: " + kelps.getAltura() + "\n";
		saida += "Volume: " + kelps.calcVolume() + "\n";
		
		JOptionPane.showMessageDialog(null, saida);
		

	}

}
