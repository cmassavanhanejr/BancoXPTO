/**
 * 
 */
package view;

import control.Relatorio;
import model.ContaCorrente;
import model.ContaPoupanca;

/**
 * Classe que:
 * 		1. Instancia duas contas (uma de cada tipo), credita algum valor para elas e 
 * 		efetua um saque (obs: no objeto conta poupan�a, fa�a um saque maior que o saldo atual).
 * 		2. Crie um objeto relat�rio e execute o m�todo gerar relat�rio para cada conta criada.
 * @author Carlos Massavanhane
 */
public class Executavel {

	
	//(int)(100+Math.random()*1000) - generate random account number
	//(500+Math.random()*10000) - generate random account money
	
	/**
	 * 
	 */
	public Executavel() {
		// TODO Auto-generated constructor stub		
	}
        
        public static void main(String[] args) {
            ContaCorrente cc=new ContaCorrente(1001,1000,"", 100);
		ContaPoupanca cp=new ContaPoupanca(1002,1000,"",500);
		
		cc.sacar(500);
		cp.sacar(1300);
		
		//Instancia objecto relatorio
		Relatorio relatorio=new Relatorio();
		
		//utilizando metodo gerar relatorio para cada tipo de conta
		relatorio.gerarRelatorio(cc);
		relatorio.gerarRelatorio(cp);
        }

}
