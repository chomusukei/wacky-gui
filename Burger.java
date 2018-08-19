package Menu;

import Logging.Logging;
import java.io.IOException;

public class Burger 
{
    public Logging log = new Logging();
    
    public void burger(int burger) throws Exception,IOException
    {
        if (burger == 1)
        {
            log.writeFile("Wack-A-Chicken");
        }
        if (burger == 2)
        {
            log.writeFile("Wack-A-Beef");
        }
    }
}
