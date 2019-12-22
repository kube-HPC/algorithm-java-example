import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wrapper.IAlgorithm;
import wrapper.Wrapper;

import java.io.IOException;

class AlgorithmExample {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        IAlgorithm algorithm = new Algorithm();
        Wrapper wrapper = new Wrapper(algorithm);
        try {
            while(true){
                System.in.read();
            }
        }catch(IOException ex){
            logger.error(ex);
        }
        System.out.println("Hello, World.");
    }
}