package dados;

public class Retangulo {
	private float comprimento = 0;
	private float largura = 0;
	
	public float calcPerimetro(){
		return (comprimento * comprimento) + (largura * largura);
	}
	
	public float calcArea(){
		return largura * comprimento;
	}
	
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	
	
}
