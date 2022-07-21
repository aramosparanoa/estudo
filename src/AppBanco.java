//@aramos.paranoa Amanda Ramos de Siqueira

package bancoparanoa;

import testeBanco.Conta;

import java.util.Scanner;

public class AppBanco {

        private static float valor;
        public static void main(String[] args){
            Conta.conta minhaConta = new Conta.conta();
            Scanner leitura = new Scanner(System.in);
            String nome;
            int num, op, numa;
            float valor;
            do{
                System.out.println("----BancoParanoa----");
                System.out.println("-------*MENU*-------");
                System.out.println("--------------------");
                System.out.println("1- Inserir dados:");
                System.out.println("2- Mostrar dados");
                System.out.println("3- Depositar valor");
                System.out.println("4- Sacar valor");
                System.out.println("5- Mostrar saldo");
                System.out.println("0 - Sair");
                System.out.println("--------------------");
                leitura.nextLine();
                op = leitura.nextInt();
                switch(op){

                    case 1 :
                        System.out.println("Entre com o nome:");
                        nome = leitura.next();

                        System.out.println("Entre com a Agencia: ");
                        numa = leitura.nextInt();

                        System.out.println("Entre com a Conta: ");
                        num = leitura.nextInt();
                        System.out.println("Dados salvos com sucesso!");
                        System.out.println("====================");



                        minhaConta.inseredados(nome, numa, num);

                        break;
                    case 2 :
                        minhaConta.mostrardado();
                        break;
                    case 3 :
                        System.out.println("Valor do deposito: ");
                        valor = leitura.nextFloat();
                        minhaConta.deposita(valor);
                        break;
                    case 4:
                        minhaConta.mostrarsal();
                        System.out.println("Valor do saque: ");
                        valor = leitura.nextFloat();
                        minhaConta.saca(valor);
                        System.out.println("====================");
                        break;
                    case 5:
                        minhaConta.mostrarsal();
                        System.out.println("====================");
                        break;
                }
            }while(op != 0);
        }
    }

