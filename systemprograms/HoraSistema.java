package systemprograms;

import java.util.Date;

public class HoraSistema {
    public static void main(String[] args) {
        Date data = new Date(); // new: define um objeto, no caso o objeto vai ser "data"
        System.out.println("A hora do sistema é");
        System.out.println(data.toString());

    }
}
