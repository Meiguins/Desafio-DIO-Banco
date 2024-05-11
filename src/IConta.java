public interface IConta {
    void sacar(double valor){
        saldo -= valor;
    }

    void depositar(double valor){
        saldo += valor;
    }

    void transferir(double valor, Conta contaDestino){

    }
}
