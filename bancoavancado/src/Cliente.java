public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;

    public Cliente(){

    }

    public void Cliente(String nomeCliente, String sobrenome,String cpfCliente,String rg) {
        this.nome = nomeCliente;
        this.cpf = cpfCliente;
        this.rg = rg;
        this.sobrenome = sobrenome;

    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeCliente) {
        this.nome = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpfCliente) {
        this.cpf = cpfCliente;
    }

}
