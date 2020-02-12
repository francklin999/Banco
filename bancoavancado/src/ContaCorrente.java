public class ContaCorrente extends Conta {
    private Cliente cliente;
    private double chequeEspecial;

    public ContaCorrente(Cliente cliente,double abertura,double chequeEspecial) {
        this.cliente = cliente;
        this.chequeEspecial = chequeEspecial;
        super.setSaldo(abertura);
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

    public void depositar(double deposito){
        double armazenar = getSaldo();
        armazenar += deposito;
        setSaldo(armazenar);
        System.out.println("Deposito Feito!! Saldo Atual:"+getSaldo());
    }

    public void depositarCheque(double valorCheque,String banco, String datapg){
        System.out.println("Valor do cheque: "+valorCheque+"|| Banco Emissor: "+banco+"|| Data do Pagamento:"+datapg);
        double armazenar = getSaldo();
        armazenar+=valorCheque;
        setSaldo(armazenar);
        System.out.println("Cheque Depositado! Saldo Atual:"+getSaldo());
    }
     @Override
    public void saque(double sacar){
        if (sacar >= getSaldo()){
            System.out.println("Valor do saque: "+sacar);
            System.out.println("Você utilizou seu Cheque Especial");
            setSaldo((getChequeEspecial()+getSaldo()) - sacar);
        }else{
            System.out.println("Valor do saque: "+sacar);
        }
    }

    public void verSaldo(){

        System.out.println("Saldo Final: "+getSaldo());
    }
}
