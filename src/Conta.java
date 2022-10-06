public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <=0) {
            System.out.println("Não pode valor <= 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <=0) {
            System.out.println("Não pode valor <= 0");
            return;
        }
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
    public Conta(int agencia,int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma nova conta" + this.agencia);
    }
}


