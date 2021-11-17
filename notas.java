import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner input=new Scanner(System.in);
      String count=input.next();
      int result = Integer.valueOf(count);
      ArrayList<String> listaFinal = new ArrayList<>();
      for(int i=1; i<=result;i++){
         String name=input.next();
         String difficult=input.next();
         String evaluated1=input.next();
         String evaluated2=input.next();
         String evaluated3=input.next();
         String evaluated4=input.next();
         String evaluated5=input.next();
         String evaluated6=input.next();
         String evaluated7=input.next();
        
         ArrayList<String> lista = new ArrayList<String>();
         lista.add(evaluated1);
          lista.add(evaluated2);
          lista.add(evaluated3);
          lista.add(evaluated4);
          lista.add(evaluated5);
          lista.add(evaluated6);
          lista.add(evaluated7);
         Collections.sort(lista); //ordenar
        // lista.remove(6);//maior
        // lista.remove(0);  //menor
         
         double total=0;
         for (int j = 1; j < lista.size()-1; j++) {
               double item = Double.parseDouble(lista.get(j));
               total=total + item;
   
         }
         double nota_dif = Double.parseDouble(difficult);
         double finalnota = total*nota_dif;
         System.out.println(name+" "+String.format("%.2f",finalnota));
         
      }
     
    }
}