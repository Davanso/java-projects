package _Java_Udemy._Fundamentos.Tipos;

public class tipos_primitivos {
    public static void main(String[] args) {
          // 3 maneiras de declarar variaveis
    // Integer:
    int idade = 3; // Aqui a mais basica, considerado uma variavel
    int idade2 = (int) 3; // Aqui especificando o tipo da variavel (typecast), considerado uma variavel


    // Real:
    float sal = 1825.54f;
    float sal2 = (float) 1825.54;
  

    // Char:
    char letra = 'a';
    char letra2 = (char) 'a';
    
    // Boolean:
    boolean x = true;
    boolean y = false;

    boolean z = (boolean) false;
    boolean h = (boolean) true;


    System.out.println(idade + " " + idade2 + " ");
    System.out.println(sal + " " + sal2 + " ");
    System.out.println(letra + " " + letra2 + " ");
    System.out.println(x + " " + y + " ");
    System.out.println(z + " " + h + " ");
}

/*
 * FAMILIA  |   TIPO PRIMITIVO    |       CLASSE WRAP       |      TAMANHO      |     EXEMPLO
 * Lógico   |      boolean        |         Boolean         |      1 bit        |      true
 * Literais |       char          |     Character/String    |      1 byte       |      'A'
 * Inteiros | byte/short/int/long | Byte/Short/Integer/Long |1 byte / 2 / 4 / 8 | 127 / 32 767 / 2 147 483 / 2**63
 * Reais    | float / double      |     Float | Double      |    4 bytes / 8    | 3.4e**+38 / 1.8e**+308
 */
}
