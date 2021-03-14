package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Parcelas;

public class ServicoDeContrato {

	private ServicoDePagamentoOnline servicoDePagamentoOnline;

	public ServicoDeContrato(ServicoDePagamentoOnline servicoDePagamentoOnline) {
		this.servicoDePagamentoOnline = servicoDePagamentoOnline;
	}

	public void processarContrato(Contrato contrato, Integer meses) {

		double valorBase = contrato.getValorTotaldoContrato() / meses;

		for (int i = 1; i <= meses; i++) {

			double valorComJuro = valorBase + servicoDePagamentoOnline.juro(valorBase, i);
			double ValorComJuroETaxa = valorComJuro+ servicoDePagamentoOnline.taxaDePagamento(valorComJuro);
			
			Date dataDevida = acrescentandoMesesNaData(contrato.getDataDoContrato(), i);

			contrato.getParcelas().add(new Parcelas(dataDevida, ValorComJuroETaxa));

		}

	}
	
	public Date acrescentandoMesesNaData(Date dataDevida, int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataDevida);
		calendar.add(Calendar.MONTH, n);
		return calendar.getTime();
		
		
		
	}
	

}
