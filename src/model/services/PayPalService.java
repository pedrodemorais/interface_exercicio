package model.services;

public class PayPalService implements ServicoDePagamentoOnline{

	@Override
	public double taxaDePagamento(Double valor) {
		double taxa = (valor * 0.02);

		
		return taxa;
	}

	@Override
	public double juro(Double valor, Integer meses) {
		double juro = (valor * 0.01) * meses;

		
		return juro;
	}

}
