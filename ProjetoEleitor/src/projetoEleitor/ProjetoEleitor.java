package projetoEleitor;

import javax.swing.JOptionPane;

import dados.Eleitor;

public class ProjetoEleitor {

	public static void main(String[] args) {
		Eleitor e1 = new Eleitor();
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		e1.setNome(nome);
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		e1.setAnoNascimento(anoNascimento);
		
		String saida = "Dados Eleitor \n";
		saida += "Nome: " + e1.getNome() + "\n";
		saida += "Ano de Nascimento: " + e1.getAnoNascimento() + "\n";
		saida += "Tipo de Eleitor: " + e1.calcTipoEleitor() + "\n";
		
		JOptionPane.showMessageDialog(null, saida);

	}

}
