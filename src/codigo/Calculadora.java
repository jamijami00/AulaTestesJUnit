package codigo;

public class Calculadora {

    /**
     * Este metodo soma dois inteiros e retorna o resultado
     *
     * @param a
     * 	 Primeiro valor a ser adicionado
     * @param b
     * 	Segundo valor a ser adicionado
     * @return O valor retornado  a soma dos dois numeros
     */
    public int soma (int a, int b) {
        return a + b;
    }

    /**
     * Este metodo subtrai dois inteiros e retorna o resultado
     *
     * @param a
     * 	 Primeiro valor a ser subtraido
     * @param b
     * 	Segundo valor a ser subtraido
     * @return O valor retornado a a subtrao dos dois nmeros
     */
    public int subtracao(int a, int b) {
        return a - b;
    }

    /**
     * Este mtodo multiplica dois inteiros e retorna o resultado
     *
     * @param a
     * @param b
     * @return
     */
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    /**
     * Este mtodo divide dois inteiros e retorna o resultado
     *
     * @param a
     * @param b
     * @return
     * */
    public int divisao(int a, int b) {
        return a / b;
    }

    /**
     * Este mtodo retorna o somatrio 0 at n
     *
     * @param n
     * @return O retorno ser o somatrio de 0 at n
     */
    public int somatoria(int n) {
        int somatorio = 0;
        while (n >= 0) {
            somatorio += n;
            n--;
        }
        return somatorio;
    }


    /**
     * Este retorna se um inteiro n  positivo
     *
     * @param n
     * @return
     */
    public boolean ehPositivo(int n) {
        return n >= 0;
    }

    /**
     * Esse mtodo compara dois nmero a e b
     * @param a
     * @param b
     * @return 0 se a==b, 1 se a>b, -1 se a < b
     */
    public int compara(int a, int b) {
        int retorno = 0;
        if (a==b) {
            retorno = 0;
        } else if (a > b) {
            retorno = 1;
        } else {
            retorno = -1;
        }
        return retorno;
    }

}
