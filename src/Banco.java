package bancoparanoa;

public class Banco {

    public static class conta {
        private int Numero;
        public int op;

        private int NumAg;
        public int ag;
        private String Dono;
        private double Saldo;


        public conta() {
            this.Numero=0;
            this.Dono=" ";
            this.Saldo=0;

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
        boolean saca(double quantidade) {
            if (this.Saldo<quantidade) {
                System.out.println("Saldo insuficiente");
            }else {
                this.Saldo = this.Saldo - quantidade;
                System.out.println("Sucesso, saque de R$"+quantidade+" realizado!");
                return true;
            }
            return false;
        }
        void deposita(double quantidade) {
            this.Saldo = this.Saldo + quantidade;
            System.out.println("Deposito de R$"+quantidade+" realizado com sucesso!");
            System.out.println("====================");
        }
        void inseredados(String a, int b, int c){
            this.Dono = a;
            this.NumAg = b;
            this.Numero = c;
            //this.Saldo = s;

        }
        void mostrardado(){
            System.out.println("====================");
            System.out.println("Dono da Conta: " + this.getDono());
            System.out.println("Agencia: " + this.getNumAg());
            System.out.println("Conta: " + this.getNumero());
            System.out.println("Saldo atual: R$" + this.getSaldo());
            System.out.println("====================");
        }
        void mostrarsal(){
            System.out.println("Saldo Atual: R$" + this.getSaldo());

        }
    }
}
