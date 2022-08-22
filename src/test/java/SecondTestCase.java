import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void setUp() {
        System.out.println("Opening Browser");
    }

    @Test(priority = 2)
    void searchCustomer() {
        System.out.println("This is search customer test");
    }

    @Test(priority = 3)
    void addCustomer() {
        System.out.println("This is add customer test");
    }

    @Test(priority = 4)
    void tearDown() {
        System.out.println("Closing Browser");
    }
}
