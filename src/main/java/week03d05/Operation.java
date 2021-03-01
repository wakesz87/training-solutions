//Írj egy Operation osztályt, mely konstruktorban kap egy összeadást, pl. 68+12!
// A getResult() metódus visszaadja a művelet eredményét.
// Egy belső leftOperand és rightOperand attribútumba dolgozz!
package week03d05;

import java.sql.SQLOutput;

public class Operation {
    private int leftValue;
    private int rightValue;

  public Operation(String operation) {
      leftValue = Integer.parseInt(operation.substring(0, operation.indexOf("+")).trim());
      rightValue = Integer.parseInt(operation.substring(operation.indexOf("+") + 1).trim());
  }
  public int getResults(){
      return leftValue + rightValue ;
  }

    public int getLeftValue() {
        return leftValue;
    }

    public int getRightValue() {
        return rightValue;
    }

    public static void main(String[] args) {
        Operation sum = new Operation("68+12");
        System.out.println(sum.leftValue);
        System.out.println("+");
        System.out.println(sum.rightValue);
        System.out.println(sum.getResults());
    }
}