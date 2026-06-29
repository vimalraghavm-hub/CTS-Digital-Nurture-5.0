public class Logger {

    private static Logger instance = new Logger();

    // Private constructor prevents object creation
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    public static Logger getInstance() {
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}