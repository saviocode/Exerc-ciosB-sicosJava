package dados;

public class Paralelepipido {
	private float altura=0;
	private float largura=0;
	private float comprimento=0;
	
	public float calcVolume(){
		return (altura * comprimento * largura);
	}
	public float calcArea(){
		return (2 * (altura * largura + altura * comprimento + largura * comprimento));
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
	
}
