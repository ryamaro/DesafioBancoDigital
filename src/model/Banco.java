package model;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Cliente> listaDeClientes = new ArrayList<Cliente>();

    static protected void adicionarClinte(Cliente cliente){
        listaDeClientes.add(cliente);
    } 

    static public void ExibirClientes(){
        System.out.println("Clientes do banco:");
        listaDeClientes.forEach(System.out::println);
    }

}
