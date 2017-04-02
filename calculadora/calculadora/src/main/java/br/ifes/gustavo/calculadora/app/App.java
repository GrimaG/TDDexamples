package br.ifes.calculadora.app;

import br.ifes.calculadora.model.Calculadora;

public class App {
	
	public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calculadora = new Calculadora();
        String entrada = "5 1 2 + 4 * + 3 -";
        Double valor = calculadora.evaluate(entrada);
        System.out.println("Entrada:" + entrada);
        System.out.println("Saida: " + valor);
    }

}
