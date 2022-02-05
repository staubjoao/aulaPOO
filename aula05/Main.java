package aula05;

import javax.swing.JOptionPane;

class Main {

    public static void main(String[] args) {
        // agregação
        Fisica f1 = new Fisica();
        Banco b1[] = new Banco[5];
        b1[0] = new Banco();
        b1[1] = new Banco();
        b1[2] = new Banco();
        b1[3] = new Banco();
        b1[4] = new Banco();

        Banco b2[] = new Banco[5];
        b2[0] = new Banco();
        b2[1] = new Banco();
        b2[2] = new Banco();
        b2[3] = new Banco();
        b2[4] = new Banco();

        b1[0].insereBanco("Caixa Federal", "UEM");
        b1[1].insereBanco("Santander", "Av. Sao Paulo");
        b1[2].insereBanco("BB", "Av. Duque Caxias");
        b1[3].insereBanco("Bradesco", "Av. Brasil");
        b1[4].insereBanco("Itaú", "Rua das Flores");

        System.out.println("***********BANCOS**********");
        System.out.println(b1[0].getNome());
        System.out.println(b1[1].getNome());
        System.out.println(b1[2].getNome());
        System.out.println(b1[3].getNome());
        System.out.println(b1[4].getNome());
        System.out.println("******************************");

        b2[0].insereBanco(b1[0].getNome(), b1[0].getEndereco());
        b2[2].insereBanco(b1[1].getNome(), b1[1].getEndereco());
        f1.insereFisica("Joao", "Rua x", "57575757", "9999999", 1100, "25/02/2002", b2);

        System.out.println("***********BANCOS DO CLIENTE**********");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("End.:" + f1.getEndereco());
        System.out.println("Sal.:" + f1.getSalario());
        System.out.println("cpf.:" + f1.getCpf());

        System.out.println("Banco 1:" + f1.getBanco()[0].getNome());
        System.out.println("Banco 2:" + f1.getBanco()[1].getNome());
        System.out.println("Banco 3:" + f1.getBanco()[2].getNome());
        System.out.println("******************************");
    }
}
