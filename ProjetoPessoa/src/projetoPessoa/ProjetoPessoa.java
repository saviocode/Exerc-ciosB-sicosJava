package projetoPessoa;

import javax.swing.JOptionPane;

import dados.Pessoa;

public class ProjetoPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		p1.setNome(nome);
		String sexo = JOptionPane.showInputDialog("Digite o seu sexo [m]-masculino [f]-feminino: ");
		p1.setSexo(sexo);
		float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso: "));
		p1.setPeso(peso);
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura: "));
		p1.setAltura(altura);
		
		String saida = "Dados da Pessoa: \n";
		saida += "Nome: " + p1.getNome() + "\n";
		saida += "Sexo: " + p1.getSexo() + "\n";
		saida += "Peso: " + p1.getPeso() + "\n";
		saida += "Altura: " + p1.getAltura() + "\n";
		saida += "IMC: " + p1.calcIMC() + "\n";
		
		JOptionPane.showMessageDialog(null, saida);

	}

}
