
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
           String valor = leitor.next();
           int open=0;
           
           for(int i=0;i<valor.length();i++) {
              if (valor.charAt(i) == ')' && open == 0 ) {
                 open--;
                 break;
              }
               
              if (valor.charAt(i) == '(') open++;
              if (valor.charAt(i) == ')') open--;
           }
           if (open==0) System.out.println("correct");
           else System.out.println("incorrect");
        }	
	}

}
















