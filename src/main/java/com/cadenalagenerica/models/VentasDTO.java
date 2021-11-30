package com.cadenalagenerica.models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_ventas")
public class VentasDTO {

	@Id
	private Integer codigoventa;
	private Integer cedulacliente;
	private Double valorventa;
	private Double ivaventa;
	private Double totalventa;
	private ArrayList<String> detalleventa;
	public VentasDTO(Integer codigoventa, Integer cedulacliente, Double valorventa, Double ivaventa, Double totalventa,
			ArrayList<String> detalleventa) {
		this.codigoventa = codigoventa;
		this.cedulacliente = cedulacliente;
		this.valorventa = valorventa;
		this.ivaventa = ivaventa;
		this.totalventa = totalventa;
		this.detalleventa = detalleventa;
	}
	public Integer getCodigoventa() {
		return codigoventa;
	}
	public void setCodigoventa(Integer codigoventa) {
		this.codigoventa = codigoventa;
	}
	public Integer getCedulacliente() {
		return cedulacliente;
	}
	public void setCedulacliente(Integer cedulacliente) {
		this.cedulacliente = cedulacliente;
	}
	public Double getValorventa() {
		return valorventa;
	}
	public void setValorventa(Double valorventa) {
		this.valorventa = valorventa;
	}
	public Double getIvaventa() {
		return ivaventa;
	}
	public void setIvaventa(Double ivaventa) {
		this.ivaventa = ivaventa;
	}
	public Double getTotalventa() {
		return totalventa;
	}
	public void setTotalventa(Double totalventa) {
		this.totalventa = totalventa;
	}
	public ArrayList<String> getDetalleventa() {
		return detalleventa;
	}
	public void setDetalleventa(ArrayList<String> detalleventa) {
		this.detalleventa = detalleventa;
	}


}