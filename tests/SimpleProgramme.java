
import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.jayway.jsonpath.JsonPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class SimpleProgramme  {

  public static void main(String[] args) throws IOException {
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
      compareTwoStringsAreAnagram("hey how", "heyhow");  
      checkVowelIsPresent("galle",'a');
    readJsonFileValues();


  }

  public static void readJsonFileValues() throws IOException {

    String jsonFilePath = "tests/resources/jsonvalues.json";
    String jsonData = new String(Files.readAllBytes(Paths.get(jsonFilePath)));

    // Extract strings from JSON using JSONPath
    List<String> eachWords = JsonPath.read(jsonData, "$.sentences[*]");
    System.out.println(eachWords);
    
  }
  
   public static void checkVowelIsPresent(String name , char vowel){
      List<Character> items = new ArrayList<>();
        for (int i = 0; i < name.length() ; i++) {
            items.add(name.charAt(i));
        }
            if(items.contains(vowel)){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
    }
    public static void compareTwoStringsAreAnagram(String one , String two){
     String updatedOne =  one.toLowerCase().replaceAll(" ","");
      String updatedTwo =  two.toLowerCase().replaceAll(" ","");

    char[] arrayOne = updatedOne.toCharArray();
    char[] arrayTwo = updatedTwo.toCharArray();
    Arrays.sort(arrayTwo);
    Arrays.sort(arrayOne);

   boolean value =  Arrays.equals(arrayTwo,arrayOne);
   if (value == true){
       System.out.println("true");
   }
   else {
       System.out.println("false");
   }
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
