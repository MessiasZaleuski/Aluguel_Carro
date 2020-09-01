package com.entidade.modelo;

import java.util.Date;

public class Aluguel_Carro {
	
	private Date inicio;
	private Date fim;
	
	//REALIZANDO AS ASSOCIAÇÕES
	private Veiculo veiculo;
	private Fatura fatura;
	
	//CONSTRUTOR SEM ARGUMENTOS
	public Aluguel_Carro() {	
	}
	
	/* NÃO FOI INSERIDO O ATRIBUTO "fatura", POIS AINDA NÃO TEMOS 
	 * A NOTA DE PAGAMENTO.*/
	public Aluguel_Carro(Date inicio, Date fim, Veiculo veiculo) {
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	

}
