public class Main {
    public static void main(String[] args) {
        Cliente meiguins = new Cliente();
        meiguins.setNome("meiguins");

        Conta cc = new ContaCorrente(meiguins);
        Conta poupanca = new ContaPoupanca(meiguins);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.verificarSaldo();
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
