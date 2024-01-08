package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	private String numero;
	private LocalDate data;
	private Double valor;
	
	List<Parcela> listaParcelas  = new ArrayList<>();
	
	public Contrato() {
	}

	public Contrato(String numero, LocalDate data, Double valor) {
		this.numero = numero;
		this.data = data;
		this.valor = valor;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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
	
	public List<Parcela> getListaParcelas() {
		return this.listaParcelas;
	}

	@Override
	public String toString() {
		return "Contrato [numero=" + numero + ", data=" + data + ", valor=" + valor + "]";
	}
	
}
