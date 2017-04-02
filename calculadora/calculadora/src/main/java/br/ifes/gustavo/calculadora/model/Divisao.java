package br.ifes.calculadora.model;

import java.util.Stack;

import br.ifes.calculadora.control.Expressao;

public class Divisao implements Expressao {
    private Stack<Double> stack;

    public Divisao(Stack<Double> stack) {
        this.stack = stack;
    }
    
    public Double interpret() {
        Double result = null;
        if( stack.size() > 1) {
            Double n1 = stack.pop();
            Double n2 = stack.pop();
            result = n1/n2;
        }
        return result;
    }

}
