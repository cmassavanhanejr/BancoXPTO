/**
 * 
 */
package model;

/**
 * Classe que refere-se a caracteriscas e accoes de uma conta poupanca
 * @author Carlos Massavanhane
 * 
 *
 */
public class ContaPoupanca extends ContaBancaria implements Imprimivel {

	private double limite;
	
	
	//Getters & Setters
	/**
	 * @return the limite
	 */
	public double getLimite() {
		return limite;
	}

	/**
	 * @param limite the limite to set
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}



	//Constructors
	/**
	 * Standard Construtors
	 */
	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param numero
	 * @param saldo
	 * @param historico
	 * @param limite
	 */
	public ContaPoupanca(int numero, double saldo, String historico, double limite) {
		super(numero, saldo, historico);
		this.limite = limite;
	}

	//metodos do modelo
	/**
	 * Implements of mostrarDados Method of the Imprimivel interface 
	 */
	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		
	}

	/** 
	 * @Override of @see model.ContaBancaria#sacar(double)
	 * Metodo que dá credito a mais para o correntista caso ele precise sacar mais que o saldo de acordo com o limite
	 * @param valor
	 */
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		super.sacar(valor);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " limite=" + limite + "]";
	}
	
	
	
	

}
