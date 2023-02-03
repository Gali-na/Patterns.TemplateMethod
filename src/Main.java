public class Main {
    public static void main(String[] args) {
        Human student = new Stusent();
        student.name="Sasha";
        student.surname="Ivanov";
        student.age= 19;

        Human worker= new Worker();
        worker.name="Sergey";
        worker.surname="Com";
        worker.age = 34;
        student.printInformatopn();
        System.out.println("******************");
        worker.printInformatopn();
        System.out.println("Hello world!");
    }
}