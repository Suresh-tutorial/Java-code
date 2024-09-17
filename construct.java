public class construct {
    int marks;           //these are class variable
    String name;
    construct(){//this is the constructor which is initialize the values for the class variables
        System.out.println("im constructor");
    }
       

      public static void main(String[] args) {
        construct ob1 =new construct();
        construct ob2=new construct();
        System.out.println(ob1.marks);
        System.out.println(ob1.name);
        System.out.println(ob2.name);
     }
    
}
