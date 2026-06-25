package Module1;
public class LoggerTest {
    public static void main(String[] args) {
        // Get two references to the Logger instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        
        logger1.log("First log message.");
        logger2.log("Second log message.");

        
        if (logger1 == logger2) {
            System.out.println("SUCCESS: Both variables point to the exact same instance.");
        } else {
            System.out.println("FAILURE: Multiple instances exist.");
        }
    }
}
