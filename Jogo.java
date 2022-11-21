package Dominópoo;
import java.util.Scanner;
import java.util.Random;

public class Jogo {
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

   // int i = 0;
    //while(i<3){

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

    int peça [] = new int [6];
    peça[0] = number0;
    peça[1] = number1;
    peça[0] = number2;
    peça[1] = number3;
    peça[0] = number4;
    peça[1] = number5;

    // métodos aqui :
    
    int valorAvaliacao1 = p.avaliar(number0, number1);
    int valorAvaliacao2 = p.avaliar(number2, number3);
    int valorAvaliacao3 = p.avaliar(number4, number5);

    System.out.println(nome1 + ":"+"\n" + "Peça : "+"[" +number0+":"+number1+"]");
    System.out.println("Pontuação : "+valorAvaliacao1);
      
    System.out.println(" ");

    System.out.println(nome2 + ":"+"\n" +"Peça : "+"[" +number2+":"+number3+"]");
    System.out.println("Pontuação : "+valorAvaliacao2);

    System.out.println(" ");

    System.out.println(nome3 + ":"+"\n" +"Peça : "+"[" +number4+":"+number5+"]");
    System.out.println("Pontuação : "+valorAvaliacao3);

    int valorNome1 = valorAvaliacao1;
    int valorNome2 = valorAvaliacao2;
    int valorNome3 = valorAvaliacao3;
    
    System.out.println("");

         // ver qual ganhou mais pontos

    if (valorNome1 > valorNome2 && valorNome1> valorNome3 ){
      System.out.println(nome1 + " Ganhou 3 pontos");
    }
    else if(valorNome2 > valorNome1 && valorNome2 > valorNome3){
      System.out.println(nome2 + " Ganhou 3 pontos");
    }
    else if(valorNome3 > valorNome2 && valorAvaliacao3 > valorNome1){
      System.out.println(nome3 + " Ganhou 3 pontos");

    } else if (valorNome1 > valorNome2 && valorNome1 == valorNome3) {
      System.out.println(nome1 + " e " + nome3 + " ganharam 3 pontos");

    } else if (valorNome1 > valorNome3 && valorNome1 == valorNome2) {
      System.out.println(nome1 + " e " + nome2 + " ganharam 3 pontos");

    } else if (valorNome2 > valorNome1 && valorNome2 == valorNome3) {
      System.out.println(nome2 + " e " + nome3 + " ganharam 3 pontos");

    } else if (valorNome1 == valorNome2 && valorNome1 == valorNome3) {
      System.out.println(nome1 + ", " + nome2 + " e " + nome3 + " ganharam 3 pontos");
    }

      

    //i++;
 // }
  System.out.println("________________________________");
}    
}
