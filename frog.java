import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner input=new Scanner(System.in);
    
      String line1=input.next();
      String line2=input.next();
      String[] array1 = line1.split(" ");
      String[] array2 = line2.split(" ");
      ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(array1));
      ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(array2));
      Collections.sort(list1); //ordenar
      Collections.sort(list2); //ordenar
      int jogador = Integer.parseInt(list1.get(list1.size()-1));
      int canos = Integer.parseInt(list2.get(list2.size()-1));
      if ( jogador > canos)  System.out.println("YOU WIN");
      else System.out.println("GAME OVER");
  }
}
