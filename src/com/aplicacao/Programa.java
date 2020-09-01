package com.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.entidade.modelo.Aluguel_Carro;
import com.entidade.modelo.Veiculo;
import com.servico.modelo.ServicoAluguel;
import com.servico.modelo.ServicoImpostoBrasil;

public class Programa {

	public static void main(String[] args) throws ParseException  {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Insira os dados do aluguel:");
		
		System.out.println("Modelo do carro: ");
		String modeloCarro = sc.nextLine();
		
		System.out.println("Digite a data e hora de retirada: (dd/MM/yyyy hh:mm): ");
		Date inicio = sdf.parse(sc.nextLine());
	
		System.out.println("Digite a data de devolução: (dd/MM/yyyy hh:mm):");
		Date fim = sdf.parse(sc.nextLine());
		
		Aluguel_Carro ac = new Aluguel_Carro(inicio, fim, new Veiculo(modeloCarro));
		
		System.out.println("Entre com o preço por hora: ");
		double precoPorHora = sc.nextDouble();
		
		System.out.println("Entre com o preço por dia:");
		double precoPorDia = sc.nextDouble();
		
		ServicoAluguel sa = new ServicoAluguel(precoPorDia, precoPorHora, new ServicoImpostoBrasil());
		
		sa.processoFatura(ac);
		System.out.println();
		System.out.println("FATURA: ");
		System.out.println("Carro: " + modeloCarro);
		System.out.println("Pagamento básico: " + String.format("%.2f", ac.getFatura().getPagamentoBasico()));
		System.out.println("Imposto: " + String.format("%.2f", ac.getFatura().getImposto()));
		System.out.println("Pagamento total: " + String.format("%.2f", ac.getFatura().getPagamentoTotal()));
		
		sc.close();
	}

}
