package modelos;

public class Bike {
	private Roda rodaDianteira;
	private Roda rodaTraseira;
	private Quadro quadro;
	private String marca;
	private int velocidade;
	private int quantidadeDeMarchas;
	private int marcha;
	
	//Construtores (pode ser public private)
	public Bike() {
		
	}
	
	public Bike(String marca, int velocidade, int marcha, int quantidadeDeMarchas) {
		this.marca = marca;
		this.velocidade = velocidade;
		this.marcha = marcha;
		this.quantidadeDeMarchas = quantidadeDeMarchas;
	}
	
	public Bike(String marca, int velocidade, int marcha, int quantidadeDeMarchas, Quadro quadro, Roda dianteira, Roda traseira) {
		this.marca = marca;
		this.velocidade = velocidade;
		this.marcha = marcha;
		this.quantidadeDeMarchas = quantidadeDeMarchas;
		this.quadro = quadro;
		rodaDianteira = dianteira;
		rodaTraseira = traseira;
	}
	
	public Roda getRodaDianteira() {
		return rodaDianteira;
	}
	
	public void setRodaDianteira(Roda rodaDianteira) {
		this.rodaDianteira = rodaDianteira;
	}
	
	public Roda getRodaTraseira() {
		return rodaTraseira;
	}
	
	public void setRodaTraseira(Roda rodaTraseira) {
		this.rodaTraseira = rodaTraseira;
	}
	
	public Quadro getQuadro() {
		return quadro;
	}
	
	public void setQuadro(Quadro quadro) {
		this.quadro = quadro;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getQuantidadeDeMarchas() {
		return quantidadeDeMarchas;
	}
	
	public void setQuantidadeDeMarchas(int quantidadeDeMarchas) {
		this.quantidadeDeMarchas = quantidadeDeMarchas;
	}
	
	public int getMarcha() {
		return marcha;
	}
	
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
}
