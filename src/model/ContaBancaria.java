/**
 * 
 */
package model;

/**
 * Abstract class Conta Bancaria
 * contém como atributos o numero da conta, saldo e historico e 
 * como métodos abstratos sacar e depositar que recebem um parâmetro do tipo double.
 * @author Carlos Massavanhane
 * 
 */
public class ContaBancaria {

	
	//variables declaration
	/**
	 * account number field
	 */
	private int numero;
	/**
	 * money of account field
	 */
	private double saldo;
	/**
	 * history of account field
	 */
	private String historico;
	
	
	
	//espaco para os construtores
	/**
	 * Fields constructor
	 * @param numero
	 * @param saldo
	 * @param historico
	 */
	public ContaBancaria(int numero, double saldo, String historico) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.historico = historico;
	}
	
	/**
	 * standard Constructor
	 */
	public ContaBancaria() {
		// TODO Auto-generated constructor stub
	}
	
	

	// Getters and Setters Methods
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the historico
	 */
	public String getHistorico() {
		return historico;
	}

	/**
	 * @param historico the historico to set
	 */
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	
	
	/**
	 * Method to sacar valor da conta
	 * @param valor
	 */
	public void sacar(double valor) {
		this.saldo-=valor;
	}
	
	/**
	 * Method to depositar valor da conta
	 * @param valor
	 */
	public void depositar(double valor) {
		this.saldo+=valor;
	}
	
	public void transferir(double valor, ContaBancaria conta) {
		this.sacar(valor);
		conta.depositar(valor);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName()+" [numero=" + numero + ", saldo=" + saldo + ", historico=" + historico + ", ";
	}
	
	

	

}
