/**
 * 
 */
package model;

import javax.swing.JOptionPane;

/**
 * Class that represents a current bank account 
 * @author Carlos Massavanhane
 * 
 */
public class ContaCorrente extends ContaBancaria implements Imprimivel{

	//Field variables
	/**
	 * variavel taxa de operacao que representa valor 
	 * a  ser cobrado por cada operacao executada
	 */
	private double taxaDeOperacao;
	
	
	//Getters and Setters
	/**
	 * @return the taxaDeOperacao
	 */
	public double getTaxaDeOperacao() {
		return taxaDeOperacao;
	}

	/**
	 * @param taxaDeOperacao the taxaDeOperacao to set
	 */
	public void setTaxaDeOperacao(double taxaDeOperacao) {
		this.taxaDeOperacao = taxaDeOperacao;
	}

	//construtores
	/**
	 * Field constructor that call the superclass constructor
	 * @param numero
	 * @param saldo
	 * @param historico
	 * @param taxaDeOperacao
	 */
	public ContaCorrente(int numero, double saldo, String historico, double taxaDeOperacao) {
		super(numero, saldo, historico);
		this.taxaDeOperacao = taxaDeOperacao;
	}

	/**
	 * standard Constructor
	 */
	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}

	
	//Metodos do modelo
	/**
	 * Implements of mostrarDados Method of the Imprimivel interface 
	 */
	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
                JOptionPane.showMessageDialog(null,
                        getClass().getName()+
                        "\n numero: "+ this.getNumero() + 
                        "\n saldo: "+ this.getSaldo()+
                        "\n historico: "+ this.getHistorico()+
                        "\n limite: "+ this.taxaDeOperacao
                );
		

	}

	/* (non-Javadoc)
	 * @see model.ContaBancaria#sacar(double)
	 */
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		if(validarSaque(valor))
                    super.sacar(valor+this.taxaDeOperacao);
                else
                    JOptionPane.showMessageDialog(null, "Nao pode fazer o saque pois nao tem saldo suficiente e excedeu o limite");
	}

	/* (non-Javadoc)
	 * @see model.ContaBancaria#depositar(double)
	 */
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		super.depositar(valor);
		this.setSaldo(this.getSaldo()-this.taxaDeOperacao);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+" taxaDeOperacao=" + taxaDeOperacao + "]";
	}

    /**
     * Implementacao do validar saque
     * @param valor
     * @return 
     */
    @Override
    public boolean validarSaque(double valor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return valor+this.getTaxaDeOperacao()<=this.getSaldo();
            
    }
	
	
	
	

}
