import java.util.Scanner;

public class Java_Task_3
{
     public static String globalVar;

     public static void main(String[] args) 
     {
         // cycle "while"
         int i = 1;
         while (i < 11) {
            System.out.println(i);
            i++;
         }

         // cycle "for"
         for (i = 1; i < 11; i++) {
           System.out.println(i);
         }

         // cycle "do while"
         i = 1;
         do {
           System.out.println(i);
           i++;
         }
         while (i < 11);
         
         System.out.println(equality (4, 4)); // method for checking if 2 given to the method numbers are equal

         // method for setting value of global variable
         System.out.println("Value of global variable before executing setGlobalVar() method: " + globalVar);
         setGlobalVar();
         System.out.println("Value of global variable after executing setglobalvar() method: " + globalVar);
  
         Cat cat = new Cat(2, 7, "Kis-kis");
         cat.printCat();
     }
    

     public static boolean equality (double a, double b)
     {
         if (a == b)
           return true;
         else
           return false;
     }
     
     public static void  setGlobalVar()
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter a value for globalVar");
         globalVar  = sc.nextLine();
     }
}

