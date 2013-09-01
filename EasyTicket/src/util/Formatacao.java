/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Nanda
 */
public class Formatacao {
    
    public static Date transformarEmData(String data){ 
        Date d  = new Date();
        SimpleDateFormat df = new SimpleDateFormat("DD/MM/yyyy");
        
        try {
            d = df.parse(data);
        } catch (ParseException ex) {
            ex.printStackTrace();

        }
        //System.out.println( df.format(d));
        return d;        
    }  
    
    
    public static String formatarData(Date data){
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        return df.format(data);
    }
    
}
