import java.util.ArrayList;

class Main {

    public static void main(String args[]) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Jorge");
        nomes.add("Cleiton");
        nomes.add("Vitor Marreco");
        nomes.add("João");
        nomes.add("Pedro");

        // tamanho
        // System.out.println(nomes.size());
        // //pegar o nome no indice 1
        // System.out.println(nomes.get(1));
        // //pegar o ultimo nome
        // System.out.println(nomes.get(nomes.size() - 1));

        // nomes.set(nomes.size() - 1, "Walter Big House");
        // System.out.println(nomes.get(nomes.size() - 1));

        // System.out.println(nomes.size());
        // for (String nome : nomes) {
        // System.out.println(nome);
        // }

        // nomes.remove(0);
        // System.out.println(nomes.size());
        // for (String nome : nomes) {
        // System.out.println(nome);
        // }

        // nomes.add(0, "Heitor");
        // System.out.println(nomes.size());
        // for (String nome : nomes) {
        // System.out.println(nome);
        // }

        // por refencias, apontando para a mesma lista
        // ArrayList<String> amiges = nomes;
        // for (String amige : amiges) {
        // System.out.println(amige);
        // }

        // System.out.println();

        // //criando um novo objeto como copia do nomes
        // ArrayList<String> novosNomes = new ArrayList<>(nomes);
        // for (String nome : novosNomes) {
        // System.out.println(nome);
        // }

        ArrayList<Integer> quadrados = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            quadrados.add(i * i);
        }

        System.out.println(quadrados);
    }
}