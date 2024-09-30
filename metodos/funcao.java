package metodos;

public class funcao {
    static int soma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) { 
       int soma = soma(5, 10);
       System.out.println("Soma: " + soma); //Quem trata a saida dos dados eh a minha main, tornando
       System.out.println(contador.contadores(1,5));  // Chamando la de outro arquivo "contador"
    }
    }                                       


    /* 
     * public = torna o metodo publico, qlqr um pode acessar
     * static = torna o metodo estatico, nao precisa transformar em objeto para utiliza-lo
     * void = nao retorna valor
     */