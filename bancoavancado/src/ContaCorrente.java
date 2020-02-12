public class ContaCorrente extends Conta {
    private Cliente cliente;
    private double chequeEspecial;
    private int numeroCliente;

    public ContaCorrente(Cliente cliente, int numeroCliente, double abertura, double chequeEspecial) {
        this.numeroCliente = numeroCliente;
        this.cliente = cliente;
        this.chequeEspecial = chequeEspecial;
        super.setSaldo(abertura);
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double deposito) {
        double armazenar = getSaldo();
        armazenar += deposito;
        setSaldo(armazenar);
        System.out.println("Deposito Feito!!");
    }

    public void depositarCheque(double valorCheque, String banco, String datapg) {
        if (valorCheque == 0){
            System.out.println("INSIRA UM VALOR");
        }else{
            System.out.println("Valor do cheque: " + valorCheque + " || Banco Emissor: " + banco + " || Data do Pagamento:" + datapg);
            double armazenar = getSaldo();
            armazenar += valorCheque;
            setSaldo(armazenar);
            System.out.println("Cheque Depositado!");
        }
    }

    @Override
    public void saque(double sacar) {
        double saldo = getSaldo();
        if (saldo >= sacar) {
            saldo -= sacar;
            setSaldo(saldo);
            System.out.println("Valor do saque: " + sacar);
        } else if(sacar <= (saldo + this.chequeEspecial)) {
            //diferença
            double diferenca = sacar - saldo;
            chequeEspecial -= diferenca;
            //negativando
            setSaldo(saldo-sacar);
            System.out.println("Valor do saque: " + sacar);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void verSaldo() {

        System.out.println("Saldo Final: " + getSaldo());
    }
}
