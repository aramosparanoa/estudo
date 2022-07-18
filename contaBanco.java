package bancoteste;


public class contaBanco {

    private double taxa;
    private double saldo;

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }


    public static class Conta {

            //atributos
            public int numConta;

            public int numAgencia;
            protected String tipo;
            private String dono;
            private double saldo;

            private double taxa;
            private boolean status;
            String linha = "------------------------";

            //estado atual
            /*
            public void estadoAtual() {
                System.out.println(linha);
                System.out.println("Conta: ag "+this.numAgencia+"   "+this.getnumConta());
                System.out.println("Tipo: " + this.getTipo());
                System.out.println("Dono(a): " + this.getDono());
                System.out.println("Saldo: " + this.getSaldo());
                System.out.println("Status: " + this.getStatus());
                System.out.println(linha);
            }*/

            //Status
            public void Status() {
                System.out.println(linha);
                System.out.println("-----DADOS DA CONTA-----");
                System.out.println("Numero da conta: ag"+this.getNumAgencia()+"  "+this.getnumConta());
                System.out.println("Tipo de conta: " + this.getTipo());
                System.out.println("Dono: " + this.getDono());
                System.out.println("Saldo: " + this.getSaldo());
                System.out.println("Status: " + this.getStatus());
                System.out.println(linha);
            }

            //metodos
            public void abrirConta(String t) {
                this.setTipo(t);
                this.setStatus(true);

                if (t == "CC||cc") {
                    this.setSaldo(20);
                } else if (t == "CP||cp") {
                    this.setSaldo(50);
                }
                System.out.println("Conta aberta com sucesso!");
            }

            public void fecharConta() {

                if (this.saldo > 0) {
                    System.out.println("Nao e possivel encerrar a conta. Ha saldo disponivel.");
                } else if (this.saldo < 0) {
                    System.out.println("Debito pendente. Nao e possivel encerrar conta.");
                } else if (this.status == false) {
                    System.out.println("Conta fechada com sucesso.");
                }
                this.status = false;
            }

            public double depositar(double valorD){
                saldo=saldo+valorD;
                return saldo;
            }

            public void sacar(double valorS) {
                if (valorS<saldo){
                    saldo=saldo-valorS;
                    System.out.println("Saque realizado!");
                }else{
                    System.out.println("Saldo insuficiente!");
                }
            }

            public void pagarMensal() {
                int v = 0;
                if (this.getTipo() == "CC") {
                    v = 12;
                } else if (this.getTipo() == "CP") {
                    v = 20;
                }
                if (this.getStatus()) {
                    this.setSaldo((float) (this.getSaldo() - v));
                    System.out.println("Mensalidade paga com sucesso por " + this.getDono());
                } else {
                    System.out.println("Conta fechada, impossivel pagar.");
                }
            }


            //get and set


            //numConta
            public int getnumConta() {
                return this.numConta;
            }

            public void setNumConta(int nc) {
                this.numConta = nc;
            }

            //numAgencia
            public int getNumAgencia(){
                return this.numAgencia;
            }

            public void setNumAgencia(int na){
                this.numAgencia = na;
            }

            //tipo
            public String getTipo() {
                return this.tipo;
            }

            public void setTipo(String t) {
                this.tipo = t;
            }

            //dono da conta
            public String getDono() {
                return this.dono;
            }

            public void setDono(String d) {
                this.dono = d;
            }

            //saldo
            public double getSaldo() {
                return this.saldo;
            }

            public void setSaldo(double s) {
                this.saldo = s;
            }

            //taxa
            public double getTaxa() {
                return this.saldo;
            }

            public void setTaxa(double t) {
                this.taxa = t;
            }

            //status
            public boolean getStatus() {
                return this.status;
            }

            public void setStatus(boolean st) {
                this.status = st;
            }





        }
    }

