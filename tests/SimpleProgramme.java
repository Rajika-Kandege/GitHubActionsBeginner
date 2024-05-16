import org.testng.annotations.Test;

public class SimpleProgramme {

    public static void main(String[] args) {
        printTheseInYourMachine();

    }

    @Test
    public static void printTheseInYourMachine() {
        System.out.println("Hi there");
        System.out.println("I am on windows");
        System.out.println("I am on macbook pro");
        System.out.println("Hey suning");
    }
}
