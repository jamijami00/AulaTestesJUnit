package testes.codigo;

import codigo.Carrinho;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import produto.Produto;
import produto.ProdutoNaoEncontradoException;
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
    ArrayList carrinho;

    Produto caneta;
    Produto borracha;
    Produto lapis;
    Produto livro;

    @Before
    public void inicializar(){
        carrinho = new ArrayList();

        caneta = new Produto("Caneta",2.00);
        borracha = new Produto("Borracha",0.50);
        lapis = new Produto("Lapis",1.00);
        livro = new Produto("Livro", 25.00);
    }

    //Teste para ver se um item é adicionado com sucesso com assertEquals
    @Test
    public void testAdicionarItem(){
        cart.addItem(caneta);
        assertEquals(1,cart.getQtdeItems());
    }

    //Teste para ver se um item apenas é removido
    @Test
    public void testRemoverItem() throws ProdutoNaoEncontradoException {
        cart.addItem(caneta);
        cart.addItem(borracha);
        cart.addItem(caneta);
        cart.removeItem(caneta);
        assertEquals(2,cart.getQtdeItems());
    }

    //Teste para ver se o carrinho vai ser esvaziado
    @Test
    public void testEsvaziarCarrinho(){
        cart.addItem(caneta);
        cart.addItem(borracha);
        cart.addItem(caneta);
        assertEquals(3,cart.getQtdeItems());
        cart.esvazia();
        assertEquals(0,cart.getQtdeItems());
    }

    //Teste para ver se o valor total está correto
    @Test
    public void testValorTotal(){
       double delta = 1e-15;

        cart.addItem(lapis);
        cart.addItem(livro);
        cart.addItem(borracha);
        //Nesse caso ele acusou que assertEquals(double expected, double actual) está depreciado
        //logo falou para usar assertEquals(double expected, double actual, double delta)
        assertEquals(26.50, cart.getValorTotal(), delta);
    }

    //Testes para comparar se um Produto específico está dentro do carrinho
    @Test
    public void testCarrinho(){
        cart.addItem(lapis);
        cart.addItem(livro);

        carrinho = cart.getCarrinho();
        assertTrue(carrinho.contains(livro));
    }

    //Tirar dúvida sobre esse erro depois
    @Test
    public void testCarrinhoComHamcrest(){
        cart.addItem(lapis);
        cart.addItem(livro);

        //Dessa maneira dá argument mismatch
        //assertThat(carrinho, hasItem(livro));
    }

    @Test
    public void testItemComHamcrest(){
        cart.addItem(lapis);
        cart.addItem(livro);

        assertThat(livro.getPreco(), equalTo(25.00));
        assertThat(lapis.getNome(), notNullValue());
    }

}
