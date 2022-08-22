import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    void setUp() {
        System.out.println("Opening Browser");
    }

    @Test(priority = 2)
    void logIn() {
        System.out.println("This is login a test");
    }

    @Test(priority = 3)
    void tearDown() {
        System.out.println("Closing Browser");
    }
}
