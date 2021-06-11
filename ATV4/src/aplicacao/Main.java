package aplicacao;

import entidades.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(35, "Pedro Augusto", "09651925477");
        Gerente gerente = new Gerente(35,"José Bonifácio","11122233345","Gerente Regional",5525.50, 0.15,"Norte-Nordeste",0); //Criando gerente
        Vendedor vendedor = new Vendedor(25,"Mauro Jorge","66677788890","Vendedor Interno", 1550.50, gerente,0,0.05,0);//Criando vendedor
        Vendedor vendedor2 = new Vendedor(25,"Pedro Barros","12345678910","Vendedor Externo", 1550.50, gerente,0,0.05,0);//Criando outro vendedor


        List<Vendas> vendas = new ArrayList<>();//Criando lista de vendas
        List<Vendas> vendas02 = new ArrayList<>();//Criando outra lista de vendas
        List<Vendedor> vendedores = new ArrayList<>();//Criando lista de vendedores

        //Adicionando 2 vendedores a lista de vendedores
        vendedores.add(vendedor);
        vendedores.add(vendedor2);

        //Designando os vendedores ao gerente
        gerente.setVendedores(vendedores);

        //Criando vendas
        Vendas vendas1 = new Vendas(500);
        Vendas vendas2 = new Vendas(650);
        Vendas vendas3 = new Vendas(725);
        Vendas vendas4 = new Vendas(400);
        Vendas vendas5 = new Vendas(300);
        Vendas vendas6 = new Vendas(1000);
        Vendas vendas7 = new Vendas(800);
        Vendas vendas8 = new Vendas(725);
        Vendas vendas9 = new Vendas(900);
        Vendas vendas10 = new Vendas(999);

        //Adicionando vendas a primeira lista de vendas
        vendas.add(vendas1);
        vendas.add(vendas2);
        vendas.add(vendas3);
        vendas.add(vendas4);
        vendas.add(vendas5);

        //Adicionando vendas a segunda lista de vendas
        vendas02.add(vendas6);
        vendas02.add(vendas7);
        vendas02.add(vendas8);
        vendas02.add(vendas9);
        vendas02.add(vendas10);

        vendedor.setVendas(vendas);//Designando a primeira lista de venda ao primeiro vendedor

        vendedor2.setVendas(vendas02);//Designando a segunda lista de venda ao segundo vendedor

        vendedor.getTotalVendas();//Calculando o total de todas as vendas do primeiro vendedor
        vendedor.getTotalComissao();//Calculando o total de comissão gerado a partir das vendas

        vendedor2.getTotalVendas();//Calculando o total de todas as vendas do segundo vendedor
        vendedor2.getTotalComissao();//Calculando o total de comissão gerado a partir das vendas

        gerente.getComissaoTotalGerente();//Calculando a comissão do gerente com base nas vendas dos vendedores

        System.out.println();
        System.out.println(vendedor.getNome()+" "+vendedor.getVendas()+ " " + vendedor.getSalario());//Primeiro vendedor
        System.out.println();
        System.out.println(vendedor2.getNome()+" "+vendedor2.getVendas()+ " " + vendedor2.getSalario());//Segundo vendedor
        System.out.println();
        System.out.println(gerente.getNome()+" "+gerente.getSalario());//Gerente
        System.out.println();
        System.out.println(pessoa);
        System.out.println();
        System.out.println(gerente);
        System.out.println();
        System.out.println(vendedor);

        }




    }

