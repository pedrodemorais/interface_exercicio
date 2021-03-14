package model.services;

public interface ServicoDePagamentoOnline {
	double taxaDePagamento(Double valor);
	double juro(Double valor, Integer meses);

}
