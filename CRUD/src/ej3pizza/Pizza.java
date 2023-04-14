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
	private Tamaño tamaño;
	private Tipo tipo;
	private Estado estado;
	
	public Pizza() {
		
	}
	
	public Pizza(int codigo, String tipo, Estado estado, String tamaño) {
		this.codigo = codigo;
		this.tipo = Tipo.valueOf(tipo);
		this.estado = estado;
		this.tamaño = Tamaño.valueOf(tamaño);
	}
	
	public Tamaño getTamaño() {
		return tamaño;
	}
	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		String res;
		res = "La pizza pedida es una " + tipo + ", de tamaño " + tamaño + "\nCodigo: " + codigo;
		
		return res;
	}
	
}
