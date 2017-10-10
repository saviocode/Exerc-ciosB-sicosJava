package dados;
import java.lang.Math;

public class Pessoa {
	private String nome = "";
	private float peso = 0;
	private float altura = 0;
	private String sexo = "";
	
	public float calcIMC(){
		return (float) (peso / Math.pow(altura, 2));
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
	
}
