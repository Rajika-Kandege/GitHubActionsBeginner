import org.testng.annotations.Test;
import java.util.Arrays;


public class SimpleProgramme {

    public static void main(String[] args) {
        printTheseInYourMachine();
        sortNumbersInAnArray(new int[] {2,4,1,3,5,2,3,45,23});


    }

    @Test
    public static void printTheseInYourMachine() {
        System.out.println("Hi there");
        System.out.println("I am on windows");
        System.out.println("I am on macbook pro");
        System.out.println("Hey suning");
    }

     public static void sortNumbersInAnArray(int[] items){

    Arrays.sort(items);
    for(int eachNumber : items){
      System.out.println(eachNumber);
   }
     }
}
