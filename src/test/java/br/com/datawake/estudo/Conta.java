package testeBanco;

public class Conta {

    public static class Conta {
        private int Numero;
        public int op;

        private int NumAg;
        public int ag;
        private String Dono;
        private double Saldo;
        private double Limite;

        public Conta() {
            this.Numero=0;
            this.Dono=" ";
            this.Saldo=0;
            this.Limite=0;
        }
        public int getNumero() {
            return Numero;
        }
        public void setNumero(int Numero) {
            this.Numero = Numero;
        }
        public int getNumAg() {
            return NumAg;
        }
        public void setNumAg(int NumAg) {
            this.NumAg = NumAg;
        }


        public String getDono() {
            return Dono;
        }
        public void setDono(String Dono) {
            this.Dono = Dono;
        }
        public double getSaldo() {
            return Saldo;
        }
        public void setSaldo(double Saldo) {
            this.Saldo = Saldo;
        }
        public double getLimite() {
            return Limite;
        }
        public void setLimite(double Limite) {
            this.Limite = Limite;
        }
        boolean saca(double quantidade) {
            if (this.Saldo<quantidade)
                return false;
            else {
                this.Saldo = this.Saldo - quantidade;
                return true;
            }
        }
        void deposita(double quantidade) {
            this.Saldo = this.Saldo + quantidade;
        }
        void inseredados(String a, int b, int c, float s, float l){
            this.Dono = a;
            this.NumAg = b;
            this.Numero = c;
            this.Saldo = s;
            this.Limite = l;
        }
        void mostrardado(){
            System.out.println("Dono da Conta: " + this.getDono());
            System.out.println("Numero da Agencia: " + this.getNumAg());
            System.out.println("Numero da Conta: " + this.getNumero());
            System.out.println("Saldo atual: " + this.getSaldo());
            System.out.println("Limite: " + this.getLimite());
        }
        void mostrarsal(){
            System.out.println("Saldo Atual: " + this.getSaldo());

        }
    }
}
