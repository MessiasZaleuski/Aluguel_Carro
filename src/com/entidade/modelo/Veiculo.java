package com.entidade.modelo;

public class Veiculo {
	private String modelo;
	
	/*CONSTRUTOR SEM ARGUMENTOS, PORÉM NÃO HÁ NECESSIDADE
	 * MAS EU COLOQUIE POR HÁBITO PORQUE ALGUNS FRAMEWORK's	
	 * EXIGEM ESSE CONTRUTOR PADRÃO NAS CLASSES DE ENTIDADES*/ 
	
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
