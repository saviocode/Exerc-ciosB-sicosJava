package dados;

public class Funcionario {
	private String nome = "";
	private double salarioMes = 0;
	private int qtdFilhos = 0;
	private float aumentoSalario = 0;
	

	public double calcAumSalario(){
		return (salarioMes * aumentoSalario)/100;
	}
	
	public double calcINSS(){
		double inss = 0;
		if(salarioMes <= 2545){
			return inss = (salarioMes * 6)/100;
		}
		return inss;
	}
	
	public double calcIR(){
		double ir = 0;
		if(salarioMes >= 1903.99 || salarioMes <= 2826.65){
			return ir = (salarioMes * 7.5)/100;
		}else if(salarioMes >= 286.66 || salarioMes <= 3751.05){
			return ir = (salarioMes * 15)/100;
		}else if(salarioMes >= 3751.06 || salarioMes <= 4664.68){
			return ir = (salarioMes * 22.5)/100;
		}else if(salarioMes > 4664.68 ){
			return ir = (salarioMes * 27.5)/100;
		}else{
			return ir;
		}
		
	}
	
	public double calcIRPF(){
		return (calcIR() - (545 * qtdFilhos));
	}
	
	public float getAumentoSalario() {
		return aumentoSalario;
	}

	public void setAumentoSalario(float aumentoSalario) {
		this.aumentoSalario = aumentoSalario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioMes() {
		return salarioMes;
	}
	public void setSalarioMes(double salarioMes) {
		this.salarioMes = salarioMes;
	}
	public int getQtdFilhos() {
		return qtdFilhos;
	}
	public void setQtdFilhos(int qtdFilhos) {
		this.qtdFilhos = qtdFilhos;
	}	
}
