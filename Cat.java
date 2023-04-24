public class Cat
{
     private int age;
     private double weight;
     private String name;

     public Cat(int age, double weight, String name)
     {
         setAge(age);
         setWeight(weight);
         setName(name);
     }
     
     public void setAge(int age)
     {
         this.age = age;
     }

     public void setWeight(double weight)
     {
         this.weight = weight;
     }
     
     public void setName(String name)
     {
         this.name = name;
     }
    

     public int getAge()
     {
         return age;
     }

     public double getWeight()
     {
         return weight;
     }

     public String getName()
     {
         return name;
     }


     public void printCat()
     {
         System.out.println("Cat's age: " + getAge() + "\nCat's weight: " + getWeight() + " kg\nCat's name " + getName());
     }
}
