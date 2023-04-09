public class Car
{
     private int weight;
     private String name;

     public Car()
     {
         setWeight(500);
         setName("TestExample car");
     }

     public Car(int weight, String name)
     {
         setWeight(weight);
         setName(name);
     }
     
     public void setWeight(int weight)
     {
         this.weight = weight;
     }
     
     public void setName(String name)
     {
         this.name = name;
     }

     public int getWeight()
     {
         return weight;
     }

     public String getName()
     {
         return name;
     }

     public void printCar()
     {
         System.out.println("Car " + getName() + " has weight " + getWeight() + "kg");
     }

     public static double plus(double a, double b)
     {
         return a + b;
     }

     public static double minus(double a, double b)
     {
         return a - b;
     }

     public static double multiply(double a, double b)
     {
         return a * b;
     }

     public static double divide(double a, double b)
     {
         return a / b;
     }
     
     public static boolean condition1 (double a, double b, double c)
     {
         if (a > b && a > c)
           return true;
         else
           return false;
     }
     
     public static boolean condition2 (double a, double b, double c)
     {
         if (a > b || a > c)
           return true;
         else
           return false;
     }

     public static boolean condition3 (double a, double b, double c)
     {
         if (((a > b) && (a < c)) || ((a < b) && (a > c)))
           return true;
         else
           return false;
     }

     public static void main(String[] args) 
     {
         Car car = new Car(1500, "Volvo");
         car.printCar();

         Car car2 = new Car();
         car2.printCar();
         
         System.out.println("3+19=" + car.plus(3, 19));
         System.out.println("7-23=" + car.minus(7, 23));
         System.out.println("14*0.5=" + car.multiply(14, 0.5));
         System.out.println("28/4=" + car.divide(28, 4));

         System.out.println("Condition 1 example: 5 is more than 3 and more than 2 = " + car.condition1 (5, 3, 2));
         System.out.println("Condition 2 example: 10 is more than any of those numbers: 17; 7 = " + car.condition2 (10, 17, 7));
         System.out.println("Condition 3 example: 23 is more than only one of those numbers: 15; 4; = " + car.condition3 (23, 15, 4));
     }
}
