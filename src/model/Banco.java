package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;


/**
 * Classe que contem propiedades e accoes do banco
 * @author Carlos Massavanhane
 *
 */
public class Banco implements Imprimivel {

	/**
	 * atributo que contem lista das contas do banco
	 */
	private ArrayList<ContaBancaria> contasBancarias;
	
	/**
	 * Standard Constructor
	 * 
	 */
	public Banco() {
		
		// TODO Auto-generated constructor stub
	}
	
	//Metodos
	/**
	 * Insert account method
	 * @param conta
	 */
	public void inserir(ContaBancaria conta) {
		contasBancarias.add(conta);
	}
	
	/**
	 * Remove Account method
	 * @param conta
	 */
	public void remover(ContaBancaria conta) {
		contasBancarias.remove(conta);
	}
	
	/**
	 * Search element at bank using:
	 * @param numConta
	 * @return {@link ContaBancaria}
	 */
	public ContaBancaria procurar(int numConta) {
	
		for(int i=0;i<this.contasBancarias.size();i++) {
			if(contasBancarias.get(i).getNumero()==numConta) {
				return contasBancarias.get(i);
			}
		}
		return null;
	}

	/**
	 * Esse metodo sobescreve o metodo mostrarDados() da interface Imprivel
	 * imprimindo as contas bancarias existentes no
	 */
	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		String contas=null;
		for(int i=0;i<this.contasBancarias.size();i++)
			//concatena os toStrings das contas bancarias que estejam no array
			contas=contas+ " "+ this.contasBancarias.get(i).toString()+"/n";
		//verifica se o objecto contas esta vazio
		if(contas.isEmpty()) 
			//se estiver vazio mostra mensagem de inexistencia de dados
			JOptionPane.showMessageDialog(null, "Nao existem dados por mostrar!!!");
		else
			//caso contrario imprime as contas existentes;
			JOptionPane.showMessageDialog(null, contas);
		
	}

}
