/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.navegacao.app;

import br.ifes.navegacao.control.Cidade;
import br.ifes.navegacao.model.AbstractAvaliadorDirecional;

/**
 *
 * @author Gustavo
 */
public class Application {
    public static void main(String[] args) {
        
        Cidade cidadeSelecionada = AbstractAvaliadorDirecional.processar("Oeste Aberdeen Birmingham Liverpool Southampton");
        cidadeSelecionada.resposta();
    }
}
