import java.util.Scanner;

public class Greeting {
    private String name;

    public void askName() {
        Scanner sc = new Scanner(System.in);
        System.out.print(":");
        this.name = sc.next();
    }

    public void sayHello() {
        System.out.println("Hi " + this.name + "! How you doing?");
    }


}
