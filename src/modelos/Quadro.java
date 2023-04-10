package modelos;

public class Quadro {
	private int tamanho;
	private String cor;
	private String material;
	
	public Quadro(int tamanho, String cor, String material) {
		this.tamanho = tamanho;
		this.cor = cor;
		this.material = material;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
}
