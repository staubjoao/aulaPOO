public class Main {

    public static void main(String[] args) {
        float[] salario = new float[20];
        salario[7] = 2000.00f;
        // System.out.print("Salario: " + salario[7]);

        String[] estado = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB",
                "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };

        // for (int i = 0; i < estado.length; i++) {
        // System.out.println("UF " + (i + 1) + ": " + estado[i]);
        // }

        for (String uf : estado)
            System.out.println(uf);
    }

}