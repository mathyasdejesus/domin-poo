package Dominópoo;

public class Peça {
  int number;

  public int avaliar(int num1, int num2) {
     // números iguais
     if (num1 == num2){
      return (2*(num1 + num2));
    }

    // dois impares diferentes
    if ( num1 != num2 && num1 % 2 == 1 && num2 % 2 == 1){
        return (2*num2)-num1;
    }

    // dois pares ok

    if (num1 != num2 && num1 % 2 == 0 && num2 % 2 == 0 ){
        return (num1 + num2);
    }



    // ímpar e par ok
    if (num1 % 2==1 && num2 % 2 == 0){
        return (num1 + num2);

    }

    // par e impar
    if (num1 % 2 == 0 && num2 % 2 == 1){
        return (num1 + num2);
    }

    return 0;
  }

    
    
}
