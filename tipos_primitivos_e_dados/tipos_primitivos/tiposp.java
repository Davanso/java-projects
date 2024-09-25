package tipos_primitivos_e_dados.tipos_primitivos;

public class tiposp {
    // 3 maneiras de declarar variaveis
    // Integer:
    int idade = 3; // Aqui a mais basica, considerado uma variavel
    int idade2 = (int) 3; // Aqui especificando o tipo da variavel (typecast), considerado uma variavel
    Integer idade3 = new Integer(3); // Aqui usando Classe(lembrando do CamelCase) e aqui eh considerado um objeto.

    // Real:
    float sal = 1825.54f;
    float sal2 = (float) 1825.54;
    Float sal3 = new Float(1825.54);

    // Char:
    char letra = 'a';
    char letra2 = (char) 'a';
    Character letra3 = new Character('a');

    // Boolean:
    boolean x = true;
    boolean y = false;

    boolean z = (boolean) false;
    boolean h = (boolean) true;

    Boolean l = new Boolean(false);
    Boolean m = new Boolean(true);

}

/*
 * FAMILIA  |   TIPO PRIMITIVO    |       CLASSE WRAP       |      TAMANHO      |     EXEMPLO
 * Lógico   |      boolean        |         Boolean         |      1 bit        |      true
 * Literais |       char          |     Character/String    |      1 byte       |      'A'
 * Inteiros | byte/short/int/long | Byte/Short/Integer/Long |1 byte / 2 / 4 / 8 | 127 / 32 767 / 2 147 483 / 2**63
 * Reais    | float / double      |     Float | Double      |    4 bytes / 8    | 3.4e**+38 / 1.8e**+308
 */