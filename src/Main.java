
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Conta cCorrente = new ContaCorrente();
        Conta cPoupaca = new ContaPoupanca();
        

        Scanner input = new Scanner(System.in);

        System.out.printf("***************** MENU *****************%n%n");
        System.out.printf("--------> SACAR [S]%n");
        System.out.printf("--------> TRANSFERIR [T]%n");
        System.out.printf("--------> DEPOSITAR [D]%n");
        System.out.printf("--------> EXTRATO [X]%n");
        System.out.printf("--------> SAIR [F]%n%n");
        System.out.printf("****************************************%n%n");

        
        
        
        while (true) {
            System.out.print("Digite uma opcao: ");
            String opcao = input.next();
            
            if("d".equals(opcao)){
                System.out.print("\ndDigite o valor do deposito ");
                double valor = input.nextDouble();
                if(valor > 0.0){
                    cCorrente.depositar(valor);
                }else{
                    System.out.println("Valor inválido");
                    break;
                }
                
            }else if("s".equals(opcao)){
                System.out.print("Digite o valor para sacar: ");
                double valor = input.nextDouble();
                if(valor > 0.0){
                    cCorrente.sacar(valor);
                }else{
                    System.out.println("Operação inválida");
                }
            }else if("t".equals(opcao)){
                System.out.println(("Digite o valor da transferência"));
                double valor = input.nextDouble();
                if(valor > 0.0){
                    cCorrente.transferir(valor, cPoupaca);
                }
            }else if("e".equals(opcao)){
                cCorrente.imprimirExtrato();
                cPoupaca.imprimirExtrato();
            }else if("f".equals(opcao)){
                break;
            }
        }
        input.close();
    }
}