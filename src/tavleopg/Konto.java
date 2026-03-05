package tavleopg;

public class Konto {
    private int nr;
    private int saldo;

    public Konto(int nr, int saldo) {
        this.nr = nr;
        this.saldo = saldo;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Konto{" +
                "nr=" + nr +
                ", saldo=" + saldo +
                '}';
    }
}
