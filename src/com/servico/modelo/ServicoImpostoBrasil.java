package com.servico.modelo;

public class ServicoImpostoBrasil implements ServicoImposto {
	public double imposto(double restante) {
		if (restante <= 100.0) {
			return restante * 0.2;
		}
		else {
			return restante * 0.15;
		}
	}

}
