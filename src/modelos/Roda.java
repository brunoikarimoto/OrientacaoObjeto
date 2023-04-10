package modelos;

public class Roda {
	private float aro;
	private String material;
	private String cor;
	
	public Roda(float aro, String material, String cor) {
		this.aro = aro;
		this.material = material;
		this.cor = cor;
	}
	
	public float getAro() {
		return aro;
	}
	
	public void setAro(float aro) {
		this.aro = aro;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
}
