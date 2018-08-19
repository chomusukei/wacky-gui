/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Logging.Logging;
import java.io.IOException;

public class Water
{
    public Logging log = new Logging();
    
    public void water(int water) throws IOException,Exception
    {       
        if (water == 1)
            log.writeFileWater("Coca-Cola");
        if (water == 2)
            log.writeFileWater("Mineral Water");
    }
}
