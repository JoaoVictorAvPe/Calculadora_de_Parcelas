package model.service;

import model.entities.Parcela;

public class PicPay implements ServicoPagamento {

	@Override
	public Parcela aplicarJuros(Parcela parcela) {
		int numeroMes = parcela.getNumero();
		double valorParcela = parcela.getValor() + parcela.getValor() * 0.01 * numeroMes;
		valorParcela += valorParcela * 0.02;
		parcela.setValor(valorParcela);
		return parcela;
	}

}
