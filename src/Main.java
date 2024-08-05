public class Main {
    public static void main(String[] args) {
        Cliente mirelly = new Cliente();
        mirelly.setNome("Mirelly");
        ContaCorrente cc = new ContaCorrente(mirelly);
        ContaPoupanca cp = new ContaPoupanca(mirelly);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
