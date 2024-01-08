package model.service;

import model.entities.Parcela;

public interface ServicoPagamento {
	public Parcela aplicarJuros(Parcela parcela);
}
