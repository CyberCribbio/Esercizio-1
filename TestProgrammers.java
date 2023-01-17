public class TestProgrammers {
public static void main(String[] args) {
    programmer prog1 = new programmer();
    programmer prog2 = new programmer();

    prog1.name = "Giovanni";
    prog2.name = "Filippo";

    prog1.age = 22;
    prog2.age = 21;

    prog1.wearsGlasses = true;
    prog2.wearsGlasses = false;

    prog1.drinkCoffee();
    prog1.printDetails();

    System.out.println("-----------");

    prog2.drinkCoffee();
    prog2.printDetails();




}
}
