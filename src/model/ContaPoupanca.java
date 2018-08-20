/**
 * 
 */
package model;

import javax.swing.JOptionPane;

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
		JOptionPane.showMessageDialog(null,
                        getClass().getName()+
                        "\n numero: "+ this.getNumero() + 
                        "\n saldo: "+ this.getSaldo()+
                        "\n historico: "+ this.getHistorico()+
                        "\n limite: "+ this.limite
                );
	}

	/** 
	 * @Override of @see model.ContaBancaria#sacar(double)
	 * Metodo que d� credito a mais para o correntista caso ele precise sacar mais que o saldo de acordo com o limite
	 * @param valor
	 */
        @Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
                if(validarSaque(valor))
                    super.sacar(valor);
                else
                    JOptionPane.showMessageDialog(null, "Nao pode fazer o saque pois nao tem saldo suficiente e excedeu o limite");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " limite=" + limite + "]";
	}

    /**
     * Implementacao do metodo validar saque!!!
     * @param valor
     * @return 
     */
    @Override
    public boolean validarSaque(double valor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return valor<this.getSaldo()+this.limite;
    }
	
	
	
	

}
