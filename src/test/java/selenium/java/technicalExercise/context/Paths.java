package selenium.java.technicalExercise.context;

public class Paths {

    //Working directory
    public static final String DIRECTORY = System.getProperty("user.dir");

    //Properties file
    public final static String TEST_PROPERTIES_PATH = DIRECTORY + "/src/test/resources/config/test.properties";

    //Chrome drive path
    public final static String CHROME_DRIVER_PATH = DIRECTORY + "/src/test/resources/drivers/chromedriver.exe";
}
