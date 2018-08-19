package Logging;

//Logging for each item that customer buy.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Logging
{
    public File log = new File("Log.txt");
    private static final String newLine = System.getProperty("line.separator");
    String burger;
    String water;
    
    public Logging()
    {
        burger = "";
        water = "";
    }
    
    //Log for if customer order burgera
    public void writeFile(String burger) throws Exception
    {              
        GregorianCalendar cal = new GregorianCalendar();
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        FileWriter fw = new FileWriter("Log.txt",true);
        
        fw.write((cal.get(Calendar.MONTH)+1)+"/"+ cal.get(Calendar.DATE)+ "/" + cal.get(Calendar.YEAR)+ " "
                + df.format(date) + " " + burger + newLine);
        fw.close();
    }
    
    
    //Log for if customer order water
    public void writeFileWater (String water) throws Exception
    {
        GregorianCalendar cal = new GregorianCalendar();
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        FileWriter fw = new FileWriter("Log.txt",true);
        
        fw.write((cal.get(Calendar.MONTH)+1)+"/"+ cal.get(Calendar.DATE)+ "/" + cal.get(Calendar.YEAR)+ " "
                + df.format(date) + " " + water + newLine);
        fw.close();
    }
    
    public String readLog() throws Exception
    {
        String line = null;
        String length = "";
        
        FileReader fileReader = new FileReader(log);

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) 
        {
            length = length + line + newLine;
        }   

        // Always close files.
        bufferedReader.close();
        return length;
    }
}
