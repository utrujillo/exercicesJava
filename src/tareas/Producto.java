package tareas;

public class Producto {
	private Integer codigo;
	private String descripcion;
	private String medida;
	private String categoria;
	private Integer cantidad;
	private Float pCompra;
	private float pVenta;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Float getpCompra() {
		return pCompra;
	}
	public void setpCompra(Float pCompra) {
		this.pCompra = pCompra;
	}
	public Float getpVenta() {
		return pVenta;
	}
	public void setpVenta(Float pVenta) {
		this.pVenta = pVenta;
	}
	
	

}
