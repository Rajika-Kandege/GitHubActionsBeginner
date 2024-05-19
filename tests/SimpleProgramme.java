
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
