import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         System.out.println("Abra sua conta com o BastistaBank e ganhe 150");
        Scanner ler = new Scanner(System.in);
        int numero ;
        String agencia;
        String nome;
        Double saldo = 150.0;
        System.out.println("Digite seu nome:");
         nome = ler.nextLine();
        
         
      System.out.println("Digite sua Agencia");
       agencia=ler.nextLine();
       
        
        System.out.println("Crie sua conta:");
       numero=ler.nextInt();
       

      

      
      System.out.println("Obrigado por abrir uma conta com agente seu saldo ja esta disponivel para saque!! ");
      
      System.out.println("Nome: "+nome);
      System.out.println("Agencia "+agencia);
      System.out.println("Numero "+numero);
      System.out.println("Saldo "+saldo);
    }
    }

