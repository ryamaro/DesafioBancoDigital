package model;
public class ContaPoupanca extends Conta {

    private double juros = 12;

    public ContaPoupanca(Cliente cliente, int saldo) {
        super(cliente, saldo);

    }

    public void ConsultarJuros() {
        System.out.println("Sua conta esta redendendo " + juros + "% ao ano");
    }

    @Override
    public void ConsultaInformacoes() {
        System.out.println("Titula: " + cliente + ".\nAgencia: " + agencia + ".\nNúmero: " + numero
        + ".\nSaldo Atual: " + saldo + ".\nRendimento anual: " + juros);
    }
}
