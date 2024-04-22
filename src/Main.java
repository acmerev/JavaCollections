import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<User> usuarios = Arrays.asList(
                new User("Andres", "20"),
                new User("Abigail", "35"),
                new User("Barto", "15"),
                new User("Jose Canceco","46"),
                new User("Berenice", "15")
        );


        Map<String, String> mapaPersonas = usuarios.stream()
                .collect(Collectors.toMap(User::getName, User::getNumberID));
        System.out.println("Mapa de personas: " + mapaPersonas);



        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<String> estudiantes = List.of("Anel","ALberto","Briyan", "jose");

        List<String> nombres =  estudiantes.stream()
                .filter(nombre-> nombre.startsWith("A"))
                .collect(Collectors.toList());

        for(String nom : nombres){
            System.out.println("nombre: " +nom);
        }

        System.out.println(nombres  + "\n");

        HashSet<String> hs = new HashSet<String>();

        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

            System.out.println(hs);

    }
}