/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.navegacao.model;

import br.ifes.navegacao.control.Cidade;
import java.util.Stack;

/**
 *
 * @author Gustavo
 */
public class MaisLeste extends AbstractAvaliadorDirecional{
    
    public MaisLeste() {
        this.direcao = "Leste";
    }
    
    @Override
    protected String[] matchingWords() {
        return new String[]{"Leste"};
    }
    
    @Override
    public Cidade executar(Stack<Cidade> expressoes) {
        Cidade cidadeResultante = this.cidadeAtual;
        while(!expressoes.empty()){
            Cidade token = expressoes.pop();
            if(cidadeResultante.getLongitude()< token.getLongitude()){
                cidadeResultante = token;
            }
        }
        return cidadeResultante;
    }

}
