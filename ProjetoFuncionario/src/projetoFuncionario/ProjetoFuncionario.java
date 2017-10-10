package projetoFuncionario;

import javax.swing.JOptionPane;

import dados.Funcionario;

public class ProjetoFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		String nome = JOptionPane.showInputDialog("Digite o nome do funcionario: ");
		f1.setNome(nome);
		double salarioMes = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario: "));
		f1.setSalarioMes(salarioMes);
		int qtdFilhos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de filhos: "));
		f1.setQtdFilhos(qtdFilhos);
		float aumentoSalario = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem do aumento: "));
		f1.setAumentoSalario(aumentoSalario);
		
		String saida = "Dados do funcionario \n";
		saida += "Nome: " + f1.getNome() + "\n";
		saida += "Salario: " + f1.getSalarioMes() + "\n";
		saida += "Quantidade de Filhos: " + f1.getQtdFilhos() + "\n";
		saida += "Aumento Salarial: " + f1.calcAumSalario() + "\n";
		saida += "INSS: " + f1.calcINSS() + "\n";
		saida += "IR: " + f1.calcIR() + "\n";		
		saida += "IRPF: " + f1.calcIRPF() + "\n";
		
		JOptionPane.showMessageDialog(null, saida);
		

	}

}
