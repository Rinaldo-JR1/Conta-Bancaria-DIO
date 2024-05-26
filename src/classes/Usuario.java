package classes;

public class Usuario {
    private int numero;
    private String nome;
    private String agencia;
    private float saldo;

    public void depositar(float valor) {
        saldo += valor;
    }
    public void sacar(float valor) {
        saldo -= valor;
    }
    public void verSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
    public void minhasInformacoes(){
        System.out.println("Número da conta: " + numero + "\nNome do titular: " + nome + "\nAgência: " + agencia + "\nSaldo: R$ " + saldo);
    }
    public Usuario(int numero, String nome, String agencia, float saldo) {
        this.numero = numero;
        this.nome = nome;
        this.agencia = agencia;
        this.saldo = saldo;
    }
}
