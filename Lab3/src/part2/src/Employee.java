package part2.src;
// super class Employee


public class Employee {
   protected String name;
   
   // Constructor
   public Employee(String name ) {
      this.name = name;
   }
   
   public Employee() {
	   
   }

   public String getName()
      { return name; }
   
   public   double earnings(){return 0.0;}
}

