package dados;

public class Eleitor {
	private String nome = "";
	private int anoNascimento = 0;
	
	public String calcTipoEleitor(){
		int idade = 2017 - anoNascimento;
		if(idade < 16){
			return "Não eleitor!";
		}else if(idade >= 16 && idade < 18){
			return "Eleitor Facultativo!";
		}else if(idade >= 18 && idade <= 65){
			return "Eleitor Obrigatório!";
		}else{
			return "Eleitor Facultativo!";
		}
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
}
