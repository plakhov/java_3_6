import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOG = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int x = 5-7;
        LOG.trace("x={}, a={}",x,10);
        LOG.debug("x={}, a={}",x,10);
        LOG.info("x={}, a={}",x,10);
        LOG.warn("x={}, a={}",x,10);
        LOG.error("x={}, a={}",x,10);
        LOG.fatal("x={}, a={}",x,10);
    }

}
