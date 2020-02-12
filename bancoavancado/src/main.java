public class main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Beto");
        cliente1.setCpf("027.613.058-84");
        cliente1.setRg("50.519.001-2");
        cliente.setNome("luis");
        cliente.setCpf("123.321.988-72");
        cliente.setRg("00.890.008-X");
        ContaPoupanca poupanca = new ContaPoupanca(465.98, 789, cliente);
        ContaCorrente corrente = new ContaCorrente(cliente1, 6437, 300, 500);

        System.out.println("---Cliente 01---");
        System.out.println(poupanca.getCliente().getNome());
        poupanca.deposito(500.02);
        poupanca.saque(200);
        poupanca.recolherJuros();
        poupanca.verSaldo();
        System.out.println("---Cliente 02---");
        System.out.println(corrente.getCliente().getNome());
        corrente.depositarCheque(100, "Trindade", "12/02/2020");
        corrente.saque(450);
        corrente.verSaldo();
    }
}
