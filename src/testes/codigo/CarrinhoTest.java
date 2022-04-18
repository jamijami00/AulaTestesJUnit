package testes.codigo;

import codigo.Carrinho;
import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import produto.Produto;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class CarrinhoTest {

    //Esses testes são feitos com o JUnit4

    Carrinho cart = new Carrinho();
    private ArrayList carrinho;

    Produto caneta;
    Produto borracha;
    Produto lapis;

    @Before
    public void inicializar(){
        caneta = new Produto("Caneta",2.00);
        borracha = new Produto("Borracha",2.00);
        lapis = new Produto("Lapis",2.00);
        carrinho = new ArrayList();
    }

    //Teste para ver se um item é adicionado com sucesso com assertEquals
    @Test
    public void testQtdItem(){
        cart.addItem(caneta);
        assertEquals(1,cart.getQtdeItems());
    }

    //Teste para comparar se os Arrays de Carrinhos são iguais com assertArrayEquals
    @Test
    public void testCarrinho(){
        carrinho.add(caneta);
        carrinho.add(borracha);
        cart.addItem(caneta);

        assertArrayEquals(carrinho.toArray(),cart.getCarrinho().toArray());
    }

    //Crie mais testes
}
