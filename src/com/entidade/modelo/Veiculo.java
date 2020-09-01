package com.entidade.modelo;

public class Veiculo {
	private String modelo;
	
	/*CONSTRUTOR SEM ARGUMENTOS, POR�M N�O H� NECESSIDADE
	 * MAS EU COLOQUIE POR H�BITO PORQUE ALGUNS FRAMEWORK's	
	 * EXIGEM ESSE CONTRUTOR PADR�O NAS CLASSES DE ENTIDADES*/ 
	
	public Veiculo() {
		
	}
	
	//CONSTRUTOR COM ARGUMENTOS
	public Veiculo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
	

}
