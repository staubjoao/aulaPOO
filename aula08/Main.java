import java.util.ArrayList;

class Main {
    public static void main(String args[]) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Jorge");
        nomes.add("Cleiton");
        nomes.add("Vitor Marreco");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println(nomes.size());
        System.out.println(nomes.get(nomes.size() - 1));
    }
}