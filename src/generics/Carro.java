package generics;

public abstract class Carro {
	
	Double preco;
	Long ano;
	String marca;
	
	public Carro(Double preco, Long ano, String marca) {
		this.ano=ano;
		this.marca=marca;
		this.preco=preco;
	}
	
	
	public String toString() {
		return "[Modelo: " + getClass().getSimpleName() + ", Preco : " + preco + ", Ano : " + ano + ", Marca : " + marca + "] \n" ;
	}
	
	
	

}