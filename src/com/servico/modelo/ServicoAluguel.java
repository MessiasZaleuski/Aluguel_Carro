package com.servico.modelo;

import com.entidade.modelo.Aluguel_Carro;
import com.entidade.modelo.Fatura;

public class ServicoAluguel {
	
	private Double precoPorDia;
	private Double precoPorHora;
	
	//REALIZANDO ASSOCIAÇÃO COM A CLASEE "ServicoImpostoBrasil"
	private ServicoImposto servicoImposto;

	public ServicoAluguel(Double precoPorDia, Double precoPorHora, ServicoImposto servicoImposto) {
		super();
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.servicoImposto = servicoImposto;
	}
	/*IMPLEMENTAÇÃO RESPONSÁVEL POR GERAR 
	 * A NOTA DE PAGAMENTO DO "ALUGUEL_CARRO"*/ 
	public void processoFatura(Aluguel_Carro aluguel_Carro) {
		long t1 = aluguel_Carro.getInicio().getTime();
		long t2 = aluguel_Carro.getFim().getTime();
		//1000->MILISSEGUNDOS, 60->HORAS, 60->SEGUNDOS
		double horas = (double) (t2 - t1) /1000 /60 /60;
		
		double pagamentoBasico;
		if(horas <= 12.0) {
			pagamentoBasico = precoPorHora *  Math.ceil(horas);
		}
		else {
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24);
		}
		//CÁLCULO DE IMPOSTO
		double imposto = servicoImposto.imposto(pagamentoBasico);
		aluguel_Carro.setFatura(new Fatura(pagamentoBasico, imposto));
	}
	
	
	
}