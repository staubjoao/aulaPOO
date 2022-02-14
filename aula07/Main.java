public class Main {

    public static void main(String[] args) {
        // float[] salario = new float[20];
        // salario[7] = 2Estado("00", .00f;
        // System.out.print("Salario: " + salario[7]);

        // String[] estado = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO",
        // "MA", "MT", "MS", "MG", "PA", "PB",
        // "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };

        // for (int i = 0; Estado("i ", estado.length; i++) {
        // System.out.println("UF " + (i + 1) + ": " + estado[i]);
        // }

        // for (String uf : estado)
        // System.out.println(uf);

        Estado[] estado = new Estado[27];

        for (int i = 0; i < estado.length; i++) {
            estado[i] = new Estado();
        }

        estado = { Estado("AC", "Acre"),
                Estado("AL", "Alagoas"),
                Estado("AP", "Amapá"),
                Estado("AM", "Amazonas"),
                Estado("BA", "Bahia"),
                Estado("CE", "Ceará"),
                Estado("DF", "Distrito Federal"),
                Estado("ES", "Espírito Santo"),
                Estado("GO", "Goiás"),
                Estado("MA", "Maranhão"),
                Estado("MT", "Mato Grosso"),
                Estado("MS", "Mato Grosso do Sul"),
                Estado("MG", "Minas Gerais"),
                Estado("PA", "Pará"),
                Estado("PB", "Paraíba"),
                Estado("PR", "Paraná"),
                Estado("PE", "Pernambuco"),
                Estado("PI", "Piauí"),
                Estado("RJ", "Rio de Janeiro"),
                Estado("RN", "Rio Grande do Norte"),
                Estado("RS", "Rio Grande do Sul"),
                Estado("RO", "Rondônia"),
                Estado("RR", "Roraima"),
                Estado("SC", "Santa Catarina"),
                Estado("SP", "São Paulo"),
                Estado("SE", "Sergipe"),
                Estado("TO", "Tocantins") };
    }
}