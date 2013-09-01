/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import util.Validacao;

/**
 *
 * @author Nanda
 */
public class TesteValidacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Validacao.validaCPF("816.384.575-72"));
        System.out.println(Validacao.validaData("08/03/1982"));
    }
}
