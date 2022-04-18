package testes.codigo;

import codigo.Calculadora;
import org.junit.*;

import static org.junit.Assert.*;

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

    //Roda antes de começar a testar
    @BeforeClass
    public static void inicializar(){
        System.out.println("Começando testes...");
    }

    //Roda antes de cada teste
    @Before
    public void init(){
        System.out.println("Próximo teste...");
    }

    //Teste para testar a função de Soma
    @Test
    public void testSoma(){
        System.out.println("Iniciando teste de Soma...");
        assertEquals(10, calc.soma(4, 6));
    }

    //Teste para testar a função de Subtração
    @Test
    public void testSubtracao(){
        System.out.println("Iniciando teste de Subtração...");
        assertEquals(0, calc.subtracao(5, 5));
    }

    //Teste para testar a função de Positivo
    @Test
    public void testPositivo(){
        System.out.println("Iniciando teste de Positivo...");
        assertFalse(calc.ehPositivo(-3));
    }

    //Teste para testar a função de Comparação
    @Test
    public void testCompara(){
        System.out.println("Iniciando teste de Comparação...");
        assertEquals(0, calc.compara(3, 3));
    }

    //Teste para testar a função de Multiplicação
    @Test
    public void testMultiplicacao(){
        System.out.println("Iniciando teste de Multiplicação...");
        assertEquals(20, calc.multiplicacao(4,5));
    }

    //Testes para testar a função de Divisão
    @Test
    public void testDivisao(){
        System.out.println("Iniciando teste de Divisão...");
        assertEquals(5, calc.divisao(10,2));
        assertTrue(calc.divisao(14,7) == 2);
    }

    @Test
    public void testDivisaoPorZero(){
        System.out.println("Iniciando teste de Divisão/0...");
        try{
            calc.divisao(10, 0);
            fail("Exceção não lançada");
        } catch (ArithmeticException e){
            assertEquals("/ by zero", e.getMessage());
        }
    }

    @Test
    public void testDivisaoPorZeroAssertThrows(){
        System.out.println("Iniciando teste de Divisão/0 com assertThrows...");
        assertThrows(ArithmeticException.class,
                () -> calc.divisao(10,0));
    }

    //Teste para testar a função de Somatório
    @Test
    public void testSomatorio(){
        System.out.println("Iniciando teste de Somatório...");
        assertEquals(15, calc.somatoria(5));
    }

    //Roda no fim de cada teste
    @After
    public void finaliza(){
        System.out.println("Teste Finalizado!");
        System.out.println("=================");
    }

    //Roda quando acabar todos os testes
    @AfterClass
    public static void finish(){
        System.out.println("Fim dos testes!");
    }
}