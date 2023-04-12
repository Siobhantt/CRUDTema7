package ej2;

public class Gestimal {
	int codigo;
	String descripcion;
	double precioCompra;
	double precioVenta;
	int stock;

	/**
	 * Constructor sin parametros
	 */
	public Gestimal() {

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param codigo       del articulo
	 * @param descripcion  del articulo
	 * @param precioCompra del articulo
	 * @param precioVenta  del articulo
	 * @param stock        del articulo
	 */
	public Gestimal(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	/**
	 * 
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * 
	 * @return
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * 
	 * @return
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * 
	 * @param precioCompra
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * 
	 * @return
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * 
	 * @param precioVenta
	 */
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * 
	 * @return
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * 
	 * @param stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Gestimal [codigo=" + codigo + ", descripcion=" + descripcion + ", precioCompra=" + precioCompra
				+ ", precioVenta=" + precioVenta + ", stock=" + stock + "]";
	}

}
