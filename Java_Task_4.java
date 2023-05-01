import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Java_Task_4
{
     public static Integer[] myArray = new Integer[10];

     public static void main(String[] args) 
     {
         for(int i = 0; i < Java_Task_4.myArray.length; i++)
         {
           Java_Task_4.myArray[i] = 0;
         }
         print_array();
         insert_into_array(4, 234);
         print_array();
         insert_into_array(0, 13);
         print_array();
         insert_into_array(7, 3);
         print_array();
         insert_into_array(9, 1);
         print_array();
         insert_into_array(3, 93);
         print_array();
         insert_into_array(1, 102);
         print_array();

         delete_value_from_array(5);
         print_array();
       
         search_value_array(234);
         search_value_array(892);

         sort_array();
         print_array();
     }
    
     public static void insert_into_array (int index, int newElement)
     {
         List<Integer> list = new ArrayList<>(Arrays.asList(Java_Task_4.myArray));
         list.add(index, newElement);
         Java_Task_4.myArray = list.toArray(new Integer[0]);
         System.out.println("\nInsert into array newElement " + newElement + " at index " + index + "\n");
     }
     
     public static void delete_value_from_array(int index)
     {
         List<Integer> list = new ArrayList<>(Arrays.asList(Java_Task_4.myArray));
         list.remove(index);
         Java_Task_4.myArray = list.toArray(new Integer[0]);
         System.out.println("\nDelete element from array at index " + index + "\n");
     }

     public static void sort_array()
     {
         List<Integer> list = new ArrayList<>(Arrays.asList(Java_Task_4.myArray));
         Collections.sort(list);
         Java_Task_4.myArray = list.toArray(new Integer[0]);
         System.out.println("\nArray is sorted\n");
     }

     public static void search_value_array(int elementToSearch)
     {
         for (int i = 0; i < Java_Task_4.myArray.length; i++) {
           if (Java_Task_4.myArray[i] != null && Java_Task_4.myArray[i] == elementToSearch) {
            System.out.println("\nElement " + elementToSearch + " is found at index " + i + "\n");
            return;
           }
         }
         System.out.println("\nElement " + elementToSearch + " wasn't found\n");
     }

     public static void print_array()
     {
         for (int i = 0; i < Java_Task_4.myArray.length; i++) {
           System.out.println("[" + i + "]: " + Java_Task_4.myArray[i]);
         }
     }
}

