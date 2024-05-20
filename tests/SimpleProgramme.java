
import java.util.*;

public class SimpleProgramme {

  public static void main(String[] args) {
    sortNumbersInAnArray(new int[] {2,4,1,3,5,2,3,45,23});
    sortList(Arrays.asList(2,4,5,1,2,23,12,34,4,6));

    Set<Integer> values = new HashSet<>();
    values.add(3);
    values.add(4);
    values.add(4);
    values.add(45);
    values.add(43);
    sortSet(values);
countVowels("Micheal");
        oddOrEven(90);


  }

  public static void oddOrEven(int number){
    if(number % 2 == 0){
      System.out.println("Number is even");
    }

    else {
      System.out.println("Number is odd");
    }
  }

public static void countVowels(String name){

    List<Character> items = new ArrayList<>();
    List<Character> vowels = new ArrayList<>();

    for (int i = 0; i < name.length() ; i++) {
      items.add(name.charAt(i));

    }

    for(char eachChar : items){
    if(eachChar == 'a' | eachChar == 'e' | eachChar == 'i' | eachChar == 'o' | eachChar == 'u'){
      vowels.add(eachChar);

    }}
    System.out.println(vowels.size());
  }

 public static void sortSet(Set<Integer> values){

    List<Integer> items = new ArrayList<>(values);
    Collections.sort(items);
   System.out.println(items);
 }
  public static void sortList(List<Integer> items){

    Collections.sort(items);
    System.out.println("sorted list " + items);
  }
  public static void sortNumbersInAnArray(int[] items) {

    Arrays.sort(items);
    for (int eachNumber : items) {
      System.out.print(eachNumber + " | ");
    }
  }
  }
