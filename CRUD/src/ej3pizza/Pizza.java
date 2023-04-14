package ej3pizza;

public class Pizza {
	private  int codigo;
	enum Tamaño{
		Mediana, Familiar
	}
	enum Tipo{
		Margarita, CuatroQuesos, Funghi
	}
	enum Estado{
		Pedida, Servida
	}
	
	public Pizza() {
	
	}
	public Pizza(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Pizza codigo = " + codigo;
	}
	
}
