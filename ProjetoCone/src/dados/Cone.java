package dados;
import java.lang.Math;

public class Cone {
	private float raio = 0;
	private float altura = 0;
	
	public float calcGeratriz(){
		return (float) Math.sqrt((Math.pow(altura, 2)) + (Math.pow(raio, 2)));
	}
	
	public float calcAreaLateral(){
		return (float) (Math.PI * raio * calcGeratriz());
	}
	
	public float calcAreaTotal(){
		return (float) (Math.PI * raio * (calcGeratriz() + raio));
	}
	
	public float calcVolume(){
		return (float) ((1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura);
	}
	
	public float getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		this.raio = raio;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}
