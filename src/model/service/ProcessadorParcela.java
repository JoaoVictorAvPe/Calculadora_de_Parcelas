package model.service;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcela;

public class ProcessadorParcela {

	public static void gerarParcelas(Contrato contrato, int numeroParcelas ,ServicoPagamento servico) {
		for(int i=1; i <= numeroParcelas; i++) {
			
			double valorParcela = contrato.getValor() / numeroParcelas;
			LocalDate dataParcela = contrato.getData().plusMonths(i);
			
			Parcela parcela = new Parcela(i, dataParcela, valorParcela);
			contrato.getListaParcelas().add(servico.aplicarJuros(parcela));
		}
	}
	
}
