package Module1;

public class Logger {

    //2 (a) : placeholder to hold a Logger object
    private static Logger instance;

    //2 (b)
    private Logger(){

    }

    //2(c)
    public static synchronized Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }    
}
