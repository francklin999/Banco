public class Conta {
    private Cliente cliente;
    private double saldo;

    public Conta() {

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        saldo += deposito;
        System.out.println("Deposito Feito!! Saldo Atual:" + saldo);
    }

    public void depositarCheque(double valorCheque, String banco, String datapg) {
        System.out.println("Valor do cheque: " + valorCheque + "|| Banco Emissor: " + banco + "|| Data do Pagamento:" + datapg);
        saldo += valorCheque;
        System.out.println("Cheque Depositado! Saldo Atual:" + saldo);
    }

    public void saque(double sacar) {
        if (sacar <= saldo) {
            System.out.println("Valor do saque: " + sacar);
            System.out.println("Saldo final: " + (saldo - sacar));
        }
    }
}
