import java.util.Scanner;

public class Greeting {
    private String name;

    public void askName(String input) {
        this.name = input;
    }

    public String sayHello() {
        String helloString = "Hi " + this.name + "! Hope you are doing good";
        return helloString;
    }


}
