package operadores_logicos;

public class operadores_l {
    public static void main(String[] args) {
        
        // Operadores lógicos AND (&)
        int a = 5;
        int b = 10;

        if (a > 0 && b > 0) {
            System.out.println("Ambos os números são positivos");
        }

        // Operadores lógicos OR (|)
        if (a > 0 || b > 0) {
            System.out.println("Pelo menos um dos números é positivo");
        }

        // Operador lógico NOT (!)
        //boolean c = true;
        //boolean d = false;

        // Operador Ternario
        // Sintaxe: 
        //variavel = (condicao) ? valor_se_verdadeiro : valor_se_falso;

        int num = 15;
        String resultado = num > 10? "O número é maior que 10" : "O número é menor ou igual a 10";
        System.out.println(resultado);
    }
}
