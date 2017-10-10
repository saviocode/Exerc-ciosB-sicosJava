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
			return "Voc� est� no peso ideal!";
		}else if(imc > 25 || imc <= 30){
			return "Voc� est� acima do peso!";
		}else if(imc > 30 || imc <= 35){
			return "Voc� est� obeso!";
		}else{
			return "Aten��o! voc� est� com obesidade m�rbida!";
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
