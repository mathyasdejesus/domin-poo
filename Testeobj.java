package Dominópoo;
import java.util.Scanner;
import java.util.Random;

public class Testeobj {
  public static void main(String[]args){
    Jogador j1 = new Jogador();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome dos jogadores :");
    System.out.print("1°: ");
    String nome1 = scanner.nextLine();
    j1.setNome(nome1);
    System.out.print("2°: ");
    String nome2 = scanner.nextLine();
    j1.setNome(nome2);
    System.out.print("3°: ");
    String nome3 = scanner.nextLine();
    j1.setNome(nome3);

   

    System.out.println("________________________________");
    System.out.println("");
    System.out.println("Nessa rodada :");

    
    Peça p = new Peça();
    
    
    Random random = new Random();
    int number0 = random.nextInt(6);
    int number1 = random.nextInt(6);
    int number2 = random.nextInt(6);
    int number3 = random.nextInt(6);
    int number4 = random.nextInt(6);
    int number5 = random.nextInt(6);

    // System.out.println(number0 );
    // System.out.println(number1);
    // System.out.println(number2);
   // System.out.println(number3);

    //p.setNumber(number0,number1,number2,number3);

    int peça [] = new int [6];
    peça[0] = number0;
    peça[1] = number1;
    peça[0] = number2;
    peça[1] = number3;
    peça[0] = number4;
    peça[1] = number5;
    System.out.println(nome1 + ":"+"\n" + "Peça : "+"[" +number0+":"+number1+"]");

    //p.Avaliation1(number0, number1);
    System.out.println(" ");

   System.out.println(nome2 + ":"+"\n" +"Peça : "+"[" +number2+":"+number3+"]");

   /// p.Avaliation2(number2, number3);
    System.out.println(" ");

    System.out.println(nome3 + ":"+"\n" +"Peça : "+"[" +number4+":"+number5+"]");

//p.Avaliation2(number4, number5);

  
  
  System.out.println("________________________________");
}
}
