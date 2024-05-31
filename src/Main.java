import model.Banco;
import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Conta;

public class Main {

    public static void main(String[] args) throws Exception {
        Cliente clinte = new Cliente("Ryan");
        Cliente clinte1 = new Cliente("Maico");
        Cliente clinte2 = new Cliente("Bruno");
        Cliente clinte3 = new Cliente("Carlos");

        Conta contaCorrente = new ContaCorrente(clinte, 1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(clinte, 2000);


        contaCorrente.ConsultarSaldo();

        contaPoupanca.ConsultarSaldo();

        contaPoupanca.ConsultarJuros();

        contaCorrente.Transferir(700, contaPoupanca);

        contaCorrente.ConsultarSaldo();

        contaPoupanca.ConsultarSaldo();

        contaCorrente.ConsultaInformacoes();
        System.out.println();
        contaPoupanca.ConsultaInformacoes();
        System.out.println();

        Banco.ExibirClientes();


    }
}
