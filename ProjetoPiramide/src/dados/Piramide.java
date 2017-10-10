package dados;

public class Piramide {
	//Atributos
	private float base = 0;
	private float altura = 0;
	
	//Metodos
	public float calcVolume(){
		return (float)(1.0/3.0 * base * altura);
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
}
