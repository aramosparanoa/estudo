package bancoteste;
import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;
public class Banco{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int op;
        int oc = 0;
        int sq=0;
        Corrente cc = new Corrente();
        Poupança cp = new Poupança();


        do {
            System.out.println("----BancoParanoa----");
            System.out.println("-------*MENU*-------");
            System.out.println("--------------------");
            System.out.println("1- Abrir conta");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("4- Saldo");
            System.out.println("0- sair");
            System.out.println("--------------------");
            op = input.nextInt();


            if (op == 1) {

                System.out.println("Que tipo de conta?\n1.Corrente\n2.Poupança");
                if (oc == 1) {
                    cc = new Corrente();
                } else {
                    cp = new Poupança();
                }
                System.out.println("Conta criada com sucesso!");
            }


            //Depositar
            if (op == 2) {

            }
            //Sacar
            if (op == 3) {
                System.out.println("Qual o valor do saque?\n1.R$20,00\n2.R$40,00\n3.R$50,00" +
                        "\n4.R$60,00\n5.R$80,00\n6.R$90,00\n7.R$100,00");
                if(sq==1){


                    // cc.getSaldo() -= 20;
                }

            }
            //Saldo
            if (op == 4) {
                System.out.println("Que tipo de conta?\n1.Corrente\n2.Poupança");
                if (oc == 1) {
                    System.out.println("Saldo da sua conta Corrente é: R$"+cc.getSaldo());
                } else {
                    System.out.println("Saldo em conta Poupança: R$"+cp.getSaldo());
                }

            }

        }while (op!=5) ;
    }
}






          /*  switch (op){

                case 1:
                    System.out.println("Nome: ");
            }
        }
        */

        /*//criando conta 1
        contaBanco.Conta conta1=new contaBanco.Conta();
        conta1.setNumConta(260031);
        conta1.setNumAgencia(243);
        conta1.setDono("Amanda Ramos");
        conta1.abrirConta("CC");
        conta1.setSaldo(0);

        //criando conta 2
        /*contaBanco.Conta conta2=new contaBanco.Conta();
        conta2.setNumConta(0243);
        conta2.setNumAgencia(26203-1);
        conta2.setDono("Carolyne Silva");
        conta2.abrirConta("CC");

        //criando conta 3
        contaBanco.Conta conta3=new contaBanco.Conta();
        conta3.setNumConta(0243);
        conta3.setNumAgencia(26000-1);
        conta3.setDono("Diego Maradini");
        conta3.abrirConta("CP");
        */

       /* //deposito
        conta1.depositar(100,4,6);
        //conta2.depositar(800f);
        //conta3.depositar(850f);

        //saque
        conta1.sacar(20);

        //saldo
        //conta1.setSaldo(10);
*/


