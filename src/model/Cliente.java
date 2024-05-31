package model;

public class Cliente {

    private String nome;


    public Cliente(String nome){
        this.nome = nome;
        Banco.adicionarClinte(this);
        
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
