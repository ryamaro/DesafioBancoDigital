package model;

public abstract class Conta {

    private final int AGENCIA = 001;
    private static int SEQUENCIAL = 1;
    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected int saldo;

    public Conta(Cliente cliente, int saldo) {
        this.cliente = cliente;
        this.agencia = AGENCIA;
        this.saldo = saldo;
        this.numero = SEQUENCIAL;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void Sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.print("O valor desejado é maior que o saldo atual");
        }

    }

    public void Depositar(double valor) {
        saldo += valor;

    }

    public void Transferir(double valor, Conta contaDestino) {

        if (saldo >= valor) {
            this.Sacar(valor);
            contaDestino.Depositar(valor);
        } else
            System.out.println(
                    "O valor digitado para a transferencia é menos doque o saldo atual, Transferencia negada!");
    }

    public void ConsultarSaldo() {
        System.out.println(saldo);
    }

    public void ConsultaInformacoes() {
        System.out.println("Titula: " + cliente + ".\nAgencia: " + agencia + ".\nNúmero: " + numero
                + ".\nSaldo Atual: " + saldo);
    }

}
