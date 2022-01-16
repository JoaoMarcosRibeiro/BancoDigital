public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("João Marcos Ribeiro");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(1500);
        cc.transferir(1500, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}