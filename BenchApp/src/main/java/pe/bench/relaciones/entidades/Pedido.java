package pe.bench.relaciones.entidades;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import javax.persistence.Table;




@Entity
@Table(name="TB_PEDIDO")
public class Pedido {
	/*Atributos*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idPedido")
	private Long codigo;
	
	private Long costo_total;
	/*@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL,fetch = FetchType.LAZY)*/
	private List<Producto> productos;
	private String direccion;
	
	private Long id_cliente;
	
	private Long id_restaurante;

	
	/*Sets/Gets*/
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Long getCosto_total() {
		return costo_total;
	}
	public void setCosto_total(Long costo_total) {
		this.costo_total = costo_total;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}
	public Long getId_restaurante() {
		return id_restaurante;
	}
	public void setId_restaurante(Long id_restaurante) {
		this.id_restaurante = id_restaurante;
	}
	

}
