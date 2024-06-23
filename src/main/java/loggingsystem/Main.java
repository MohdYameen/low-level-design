package loggingsystem;

public class Main {

    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(new InfoLogProcessor(null))));

        logger.log(LogProcessor.ERROR, "Exception happens");
        logger.log(LogProcessor.DEBUG, "Needs to debug this");
        logger.log(LogProcessor.INFO, "Just for your information");
    }
}
