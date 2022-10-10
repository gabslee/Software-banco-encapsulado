public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(23332,2332);
        Conta conta2 = new Conta(23332, 80809);
        Conta conta3 = new Conta(23332, 40254);


        System.out.println(Conta.getTotal());
    }

}
