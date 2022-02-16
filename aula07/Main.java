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

        estado[0] = Estado("AC", "Acre");
        estado[1] = Estado("AL", "Alagoas");
        estado[2] = Estado("AP", "Amapá");
        estado[3] = Estado("AM", "Amazonas");
        estado[4] = Estado("BA", "Bahia");
        estado[5] = Estado("CE", "Ceará");
        estado[6] = Estado("DF", "Distrito Federal");
        estado[7] = Estado("ES", "Espírito Santo");
        estado[8] = Estado("GO", "Goiás");
        estado[9] = Estado("MA", "Maranhão");
        estado[10] = Estado("MT", "Mato Grosso");
        estado[11] = Estado("MS", "Mato Grosso do Sul");
        estado[12] = Estado("MG", "Minas Gerais");
        estado[13] = Estado("PA", "Pará");
        estado[14] = Estado("PB", "Paraíba");
        estado[15] = Estado("PR", "Paraná");
        estado[16] = Estado("PE", "Pernambuco");
        estado[17] = Estado("PI", "Piauí");
        estado[18] = Estado("RJ", "Rio de Janeiro");
        estado[19]  = Estado("RN", "Rio Grande do Norte");
        estado[20]  = Estado("RS", "Rio Grande do Sul");
        estado[21]  = Estado("RO", "Rondônia");
        estado[22]  = Estado("RR", "Roraima");
        estado[23]  = Estado("SC", "Santa Catarina");
        estado[24]  = Estado("SP", "São Paulo");
        estado[25]  = Estado("SE", "Sergipe");
        estado[26]  = Estado("TO", "Tocantins");
    }
}