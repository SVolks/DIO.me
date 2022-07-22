public class Main {

    public static void main(String[] args) {

        Cliente jose = new Cliente();
        jose.setNome("José");

        Conta cc = new ContaCorrente(jose);
    // cc.depositar(100);

        Conta poupanca = new ContaPoupanca(jose);
    // cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}