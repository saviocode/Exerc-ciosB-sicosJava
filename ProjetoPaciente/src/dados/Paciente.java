package dados;
import java.lang.Math;

public class Paciente {
	private String nome = "";
	private float peso = 0;
	private float altura = 0;
	
	
	public float calcIMC(){
		return (float) (peso / Math.pow(altura, 2));
	}
	
	public String faixaDePeso(){
		float imc = calcIMC();
		if(imc < 20){
			return  "Voce esta abaixo do peso ideal!";
		}else if(imc >= 20 || imc <= 25){
			return "Você está no peso ideal!";
		}else if(imc > 25 || imc <= 30){
			return "Você está acima do peso!";
		}else if(imc > 30 || imc <= 35){
			return "Você está obeso!";
		}else{
			return "Atenção! você está com obesidade mórbida!";
		}	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
}
