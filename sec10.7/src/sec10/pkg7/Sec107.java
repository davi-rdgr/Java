package sec10.pkg7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sec107 {

    public static void main(String[] args) {
        // Cria um arraylist 

        List<String> list = new ArrayList<>();

        // adiciona itens ao array
        list.add("Davizo");
        list.add("Ma");
        list.add("Daawdvizo");
        list.add("Davizawdawdawdo");
        list.add("Maracatu");
        list.add("Gilberto Barros");
        list.add("Ratinho");
        list.add("Adalberto");
        

        // adiciona a um index específico
        list.add(2, "listtchananam");

        //compara e remove 
        list.remove("Davizo");

        //remove quem começa com a letra M
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println(list);

        // imprime só nomes que começam com A
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
    }

}
