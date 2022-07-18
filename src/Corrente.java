package bancoteste;

public class Corrente extends contaBanco {

    /* conta corrente: taxa de manutenção 27 reais, não é necessario valor para abrir
    */

     Corrente(){
         this.setSaldo(0);
         this.setTaxa(27);
     }

    public void setTaxa(double t) {
    }

    public void setSaldo(double s) {
    }


}
