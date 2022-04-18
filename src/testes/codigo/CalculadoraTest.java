package testes.codigo;

import codigo.Calculadora;
import static junit.framework.Assert.*;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    //Teste para testar a função de Soma
    @Test
    public void testSoma(){
        assertEquals(10, calc.soma(4, 6));
    }

    //Teste para testar a função de Subtração
    @Test
    public void testSubtracao(){
        assertEquals(0, calc.subtracao(5, 5));
    }

    //Teste para testar a função de Positivo
    @Test
    public void testPositivo(){
        assertEquals(false, calc.ehPositivo(-3));
    }

    //Teste para testar a função de Comparação
    @Test
    public void testCompara(){
        int num = 3;
        assertSame(true, calc.compara(num, num));
    }

    //Crie mais testes
}