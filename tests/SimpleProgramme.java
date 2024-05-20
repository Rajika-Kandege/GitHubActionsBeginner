
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
    reverseString("hey");
    reverseNumber(909034);
    compareTwoArrays(new int[] {2,4 ,6}, new int[] {6,4,2});
    removeDuplicates(Arrays.asList(6,8,8,9,5,6,7,5,6,3));


  }
   public static void removeDuplicates(List<Integer> list){
    Set<Integer> uniqueValues = new HashSet<>();
    uniqueValues.addAll(list);
    System.out.println(uniqueValues);
  }
public static void compareTwoArrays(int[] arrayOne , int[] arrayTwo){

    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
   boolean value =  Arrays.equals(arrayTwo,arrayOne);

   if (value == true){
     System.out.println("true");
   }
   else {
     System.out.println("false");
   }
  }
   public static void reverseNumber(int number){
    String convertToString = String.valueOf(number);

    String reversedString = "";

    for (int i = convertToString.length()-1; i >= 0 ; i--) {

      reversedString = reversedString + convertToString.charAt(i);

    }

    int updatedNumber = Integer.parseInt(reversedString);

    System.out.println(updatedNumber);
  }

   public static void reverseString(String name){
    String reversedName = new StringBuilder(name).reverse().toString();
    System.out.println(reversedName);
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
