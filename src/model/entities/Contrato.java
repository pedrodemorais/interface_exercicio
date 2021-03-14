package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private Integer numeroDoContrato;
	private Date dataDoContrato;
	private Double valorTotaldoContrato;
	
	private List<Parcelas> parcelas = new ArrayList<Parcelas>();

	public Contrato(Integer numeroDoContrato, Date dataDoContrato, Double valorTotaldoContrato) {
		this.numeroDoContrato = numeroDoContrato;
		this.dataDoContrato = dataDoContrato;
		this.valorTotaldoContrato = valorTotaldoContrato;
	}

	public Integer getNumeroDoContrato() {
		return numeroDoContrato;
	}

	public void setNumeroDoContrato(Integer numeroDoContrato) {
		this.numeroDoContrato = numeroDoContrato;
	}

	public Date getDataDoContrato() {
		return dataDoContrato;
	}

	public void setDataDoContrato(Date dataDoContrato) {
		this.dataDoContrato = dataDoContrato;
	}

	public Double getValorTotaldoContrato() {
		return valorTotaldoContrato;
	}

	public void setValorTotaldoContrato(Double valorTotaldoContrato) {
		this.valorTotaldoContrato = valorTotaldoContrato;
	}

	public List<Parcelas> getParcelas() {
		return parcelas;
	}
	
	
	
	

}
