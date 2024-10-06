public class ContaTerminal
{
    public int num;
    public String agencia;
    public String nomeCliente;
    public double Saldo;

    public ContaTerminal() {
    }

    public ContaTerminal(int num, String agencia, String nomeCliente, double saldo) {
        this.num = num;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.Saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco" +
                ", sua agencia e " + agencia +
                ",conta " + num +
                ",e seu Saldo " + Saldo +
                " ja esta desponivel";
    }
}


