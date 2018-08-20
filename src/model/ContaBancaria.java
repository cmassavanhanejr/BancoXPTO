/**
 * 
 */
package model;

import javax.swing.JOptionPane;

/**
 * Abstract class Conta Bancaria
 * cont�m como atributos o numero da conta, saldo e historico e 
 * como m�todos abstratos sacar e depositar que recebem um par�metro do tipo double.
 * @author Carlos Massavanhane
 * 
 */
public abstract class ContaBancaria {

	
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
                this.historico=this.historico+" \n Saque no valor de: "+valor;
                JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!! \n o saldo actual eh "+ this.saldo);
	}
	
        /**
         * Method abstrascto para validar o saque de acordo com tipo de conta 
         * @param valor
         * @return 
         */
        public abstract boolean validarSaque(double valor);
        
	/**
	 * Method to depositar valor da conta
	 * @param valor
	 */
	public void depositar(double valor) {
		this.saldo+=valor;
                this.historico=this.historico+" \n deposito no valor de: "+valor;
                JOptionPane.showMessageDialog(null, "Deposito efectuado! O saldo actual eh de "+this.saldo);
	}
	
	public void transferir(double valor, ContaBancaria conta) {
		this.sacar(valor);
		conta.depositar(valor);
                this.historico=this.historico+" \n transferencia para "+ conta.getNumero() + "no valor de: "+valor;
                JOptionPane.showMessageDialog(null, "Transferido com sucesso para "+conta.getNumero() +"no valor de "+valor);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName()+" [numero=" + numero + ", saldo=" + saldo + ", historico=" + historico + ", ";
	}
	
	

	

}
