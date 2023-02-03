public abstract class Human {
     String name;
     String surname;
     int age;

    final void  printInformatopn() {
          System.out.println( name +" ");
          System.out.print(surname+" ");
          System.out.print(age +" ");
          System.out.println( work()+" ");
          System.out.println(hobby());

     }

     abstract String work();
     abstract String hobby();

}
