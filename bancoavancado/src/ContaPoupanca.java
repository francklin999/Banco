import org.w3c.dom.ls.LSOutput;

import javax.crypto.Cipher;

public class ContaPoupanca extends Conta {
    private Cliente cliente;
    private int numeroCliente;


    public ContaPoupanca(double abertura,int clienteID,Cliente cliente) {
        super.setSaldo(abertura);
        this.cliente = cliente;
        this.numeroCliente = clienteID;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void deposito(double depositar) {
    double armazenar = getSaldo();
            armazenar += depositar;
            setSaldo(armazenar);
            System.out.println("Deposito feito com sucesso!! Seu Saldo Atual: " + getSaldo());

    }

    public void saque(double sacar) {

        if (sacar >= getSaldo()) {
            System.out.println("Valor do saque: "+sacar);
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Valor do saque: "+sacar);
            setSaldo(getSaldo() - sacar);
            System.out.println("Saldo final: " +getSaldo());
        }
    }
    public void recolherJuros(){

        double armazenar = getSaldo() ;
        armazenar *= 0.9;
        setSaldo(armazenar+getSaldo());
    }

    public void verSaldo(){

        System.out.println("Saldo Após rendimento: "+getSaldo());
    }

}
