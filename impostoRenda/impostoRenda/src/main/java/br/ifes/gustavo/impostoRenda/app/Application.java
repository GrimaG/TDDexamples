/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.impostoRenda.app;

import br.ifes.impostoRenda.control.Pessoa;
import br.ifes.impostoRenda.model.CalculoImposto;

/**
 *
 * @author Gustavo
 */
public class Application {
    @SuppressWarnings("unused")
	public static void main(String [] args){
        CalculoImposto calculoImposto;
        Pessoa pessoa = new Pessoa(2000.00);
        calculoImposto = new CalculoImposto(pessoa);
        
        pessoa = new Pessoa(-200);
        calculoImposto = new CalculoImposto(pessoa);
    }
}
