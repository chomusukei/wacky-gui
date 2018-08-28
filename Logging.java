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
import java.io.FileNotFoundException;

public class Logging
{
    /*
      Create object for class File.
      The file is then named as Log.txt.
    */
    public File log = new File("Log.txt"); 
    
    private static final String newLine = System.getProperty("line.separator"); //Create a new line when called. same as \n
    String burger; //Create variable burger
    String water; // Create variable water
    
    public Logging()
    {
        burger = ""; //Initialise it as empty string
        water = ""; //Initialise it as empty string
    }
    
    //Log for if customer order burger
    public void writeFile(String burger) throws Exception
    {              
        GregorianCalendar cal = new GregorianCalendar(); //Create object for class GregorianCalendar
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss"); //Create object for class SimpleDateFormat
        Date date = new Date(); //Create object for Date.
        FileWriter fw = new FileWriter("Log.txt",true); //Create object for class FileWriter.
        /*
            FileWriter is used to write characters to a file.
            FileWriter works much like the FileOutPutStream except that a
            FileOutPutStream is byte based, whereas FileWriter is character
            based. Simply put, FileWriter is intended to write text.
        */
        
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
        try
        {           
            FileReader fileReader = new FileReader(log);
            /*
                Created an object for class FileReader.
                FileReader read file from "log" which is the object of File created
                earlier. 
            */

            /* 
                Always wrap FileReader in BufferedReader.
                Wrapping a BufferedReader around a FileReader prevents reading of 
                data from the file over and over again. BufferedReader buffers the 
                input.
            */
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) 
            {
                length = length + line + newLine;
            }   

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException fnf)
        {
           File test = new File("Log.txt");
        }
        return length;
    }
}
