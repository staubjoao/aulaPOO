package aula04;

import aula04.Juridica;

class Main {

    public static void main(String[] args) {
        Juridica j1 = new Juridica();
        Cliente c1 = new Cliente();
        j1.setCnpj("0001");
        j1.cadastrarPessoa("UEM", "3545-5161", "Av. Colombo");
        c1.setJuridica(j1);

        System.out.println("Empresa: " + j1.getNome());
        System.out.println("Endereço: " + j1.getEndereco());
        System.out.println("Telefone: " + j1.getTelefone());
        System.out.println("CNPJ: " + j1.getCnpj());

        c1.alterarFone("999999");
        System.out.println("");
        System.out.println("Telefone alterado: " + c1.getJuridica().getTelefone());

    }
}
