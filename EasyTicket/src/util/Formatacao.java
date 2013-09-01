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
    
    public static Date transformarStringEmDate(String dataString){ 
        DateFormat formatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
        formatter.setLenient(false);
        java.util.Date data = null;
        try {
            
            data = (java.util.Date)formatter.parse(dataString);
            
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }  
        return data;
    }
    
    public static String transformarDateEmString(Date data){
        java.text.DateFormat formatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
        formatter.setLenient(false);
        String str = formatter.format(data);
        
        return str;       
    }
    
    
    
    
    public static String formatarData(Date data){
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        return df.format(data);
    }
    
    
    
}
