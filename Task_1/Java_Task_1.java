public class Java_Task_1 
{
   public static byte a;
   public static short b;
   public static int c;
   public static long d;
   public static char e;

   public static float f;
   public static double g;

   public static boolean h;
     
 
   public static void main(String[] args) 
   {
      byte a;
      short b;
      int c;
      long d;
      char e;    
      
      float f;
      double g;

      boolean h;
      
      Scanner sc = new Scanner(System.in);
     
      System.out.println("Enter the value for global byte a");
      Java_Task_1.a = sc.nextByte();

      System.out.println("Enter the value for global short b");
      Java_Task_1.b = sc.nextShort();
   
      System.out.println("Enter the value for global int c");
      Java_Task_1.c = sc.nextInt();

      System.out.println("Enter the value for global long d");
      Java_Task_1.d = sc.nextLong();

      System.out.println("Enter the value for global char e");
      Java_Task_1.e = sc.next().charAt(0);

      System.out.println("Enter the value for global float f");
      Java_Task_1.f = sc.nextFloat();

      System.out.println("Enter the value for global double g");
      Java_Task_1.g = sc.nextDouble();

      System.out.println("Enter the value for global boolean h");
      Java_Task_1.h = sc.nextBoolean();


      System.out.println("Enter the value for local byte a");
      a = sc.nextByte();
      
      System.out.println("Enter the value for local short b");
      b = sc.nextShort();

      System.out.println("Enter the value for local int c");
      c = sc.nextInt();

      System.out.println("Enter the value for local long d");
      d = sc.nextLong();

      System.out.println("Enter the value for local char e");
      e = sc.next().charAt(0);;

      System.out.println("Enter the value for local float f");
      f = sc.nextFloat();

      System.out.println("Enter the value for local double g");
      g = sc.nextDouble();

      System.out.println("Enter the value for local boolean h");
      h = sc.nextBoolean();
      
      System.out.println("Table with no formatting:");
      System.out.println("|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|");
      System.out.println("|---global byte a----|---global short b---|----global int c----|---global long d----|---global char e----|---global float f---|--global double g---|--global boolean h--|");
      System.out.println("|---------" + Java_Task_1.a + "---------|" + "---------" + Java_Task_1.b + "---------|" + "---------" + Java_Task_1.c + "---------|" + "---------" + Java_Task_1.d + "---------|" + "----------" + Java_Task_1.e + "---------|" + "------" + Java_Task_1.f + "-------|" + "-------" + Java_Task_1.g + "------|" + "-----" + Java_Task_1.h + "-----|");
      System.out.println("|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|"); 

      System.out.println("Table with formatting:");
      System.out.println("|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|");
      System.out.println("|----local byte a----|----local short b---|-----local int c----|----local long d----|----local char e----|----local float f---|---local double g---|---local boolean h--|");
      System.out.printf("|%20d|%20d|%20d|%20d|%20c|%20.2f|%20.2f|%20b|\n", a, b, c, d, e, f, g, h);
      System.out.println("|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|");
   }
}
