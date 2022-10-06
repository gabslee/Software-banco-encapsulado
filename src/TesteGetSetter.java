public class TesteGetSetter {
    public static void main(String[] args) {
        Conta conta = new Conta(2424,2424);
        conta.setNumero(1300);

        Conta contaDoGabriel = new Conta(23332,2332);
        Cliente Gabriel = new Cliente();
        contaDoGabriel.setNumero(1331456);
        contaDoGabriel.setAgencia((001));
        contaDoGabriel.deposita(25000);
        contaDoGabriel.setTitular(Gabriel);
        Gabriel.setNome("Gabriel Menezes");
        Gabriel.setCpf("402.612.458.48");
        Gabriel.setProfissao("Estágiario em Tecnologia");

        System.out.println(contaDoGabriel.getTitular().getProfissao());
        contaDoGabriel.getTitular().setProfissao("Programador Java Junior");
        System.out.println(contaDoGabriel.getTitular().getProfissao());

    }
}
