/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.navegacao.control;

import br.ifes.navegacao.model.AbstractAvaliadorDirecional;

/**
 *
 * @author Gustavo
 */
public interface Expressao {
    public Cidade interpreter(String rota);
    public void proximaExpressao(AbstractAvaliadorDirecional proximo);
}
