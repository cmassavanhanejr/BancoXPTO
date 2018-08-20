/**
 * 
 */
package control;

import model.Imprimivel;

/**
 * classe Relat�rio que possui um m�todo gerarRelat�rio que receba um objeto imprim�vel 
 *	e executa o m�todo mostrarDados do objeto.
 * @author Carlos Massavanhane
 *	
 */
public class Relatorio {

	public void gerarRelatorio(Imprimivel obj) {
		obj.mostrarDados();
	}
	
	/**
	 * standard constructor
	 */
	public Relatorio() {
		// TODO Auto-generated constructor stub
	}

}
