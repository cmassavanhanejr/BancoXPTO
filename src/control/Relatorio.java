/**
 * 
 */
package control;

import model.Imprimivel;

/**
 * classe Relatório que possui um método gerarRelatório que receba um objeto imprimível 
 *	e executa o método mostrarDados do objeto.
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
