package dados;
import java.lang.Math;

public class Cilindro {
	private float raio = 0;
	private float altura = 0;
	
	public float calcAreaLateral(){
		return (float) (2 * Math.PI * raio * altura);
	}
	
	public float calcAreaTotal(){
		return (float) (2 * Math.PI * raio * (altura + raio));
	}
	
	public float calcVolume(){
		return (float) (Math.PI * raio * raio * altura);
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
