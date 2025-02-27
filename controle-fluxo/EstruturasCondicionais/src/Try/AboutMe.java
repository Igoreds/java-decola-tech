package Try;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
 public static void main(String[] args) {
   try { 
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Diginte seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.next();

    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();

    System.out.println("Digite sua altura");
    double altura = scanner.nextDouble();
    scanner.close();


    System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos");
    System.out.println("Minha altura é " + altura + " com");
   } 
   catch (InputMismatchException e) {
    System.out.println("Os Campos Idade e Altura precisam serem númericos");
   }
 }   
}
