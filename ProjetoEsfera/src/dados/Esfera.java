package dados;
import java.lang.Math;

public class Esfera {
	private float raio = 0;
	
	public float calcArea(){
		return (float) (4 * Math.PI * Math.pow(raio, 2));
	}
	
	public float calcVolume(){
		return (float) ((4/3) * Math.PI * Math.pow(raio,3));
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	
}
