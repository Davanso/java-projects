package tipos_primitivos_e_dados.incopatibilidade;

public class teste {
    public static void main(String[] args) {
        
   
    int idade = 30;
    //String valor = idade; Type mismatch: cannot convert from int to String
    //String valor = (String) idade; Type mismatch: cannot convert from int to String

    // Maneira correta:
    String valor = Integer.toString(idade); 
    System.out.println(valor);  // Int to -> String


    String valor2 = "30";

    int idade2 = Integer.parseInt(valor2);
    System.out.println(idade2); // String to -> Int

    
    } 
}
