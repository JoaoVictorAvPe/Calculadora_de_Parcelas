package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
	private Integer numero;
	private LocalDate data;
	private Double valor;
	
	public Parcela() {
	}
	
	public Parcela(Integer numero, LocalDate data, Double valor) {
		this.numero = numero;
		this.data = data;
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Integer getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - R$" + String.format("%.2f", getValor());
	}
	
	
}
