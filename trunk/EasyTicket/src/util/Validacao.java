/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nanda
 */
public class Validacao {
    private static final String EMAIL_REGEX = "^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$" ;

    public static boolean isEmailValido(String email){
        Pattern p = Pattern.compile(EMAIL_REGEX);

        Matcher matcher = p.matcher(email);

        return matcher.matches();
    }
    
    public static boolean validaCPF(String strCpf){
        int iDigito1Aux = 0, iDigito2Aux = 0, iDigitoCPF;
        int iDigito1 = 0, iDigito2 = 0, iRestoDivisao = 0;
        String strDigitoVerificador, strDigitoResultado;

        if (! strCpf.substring(0,1).equals("")){
            try{
                strCpf = strCpf.replace('.',' ');
                strCpf = strCpf.replace('-',' ');
                strCpf = strCpf.replaceAll(" ","");
                for (int iCont = 1; iCont < strCpf.length() -1; iCont++) {
                    iDigitoCPF = Integer.valueOf(strCpf.substring(iCont -1, iCont)).intValue();
                    iDigito1Aux = iDigito1Aux + (11 - iCont) * iDigitoCPF;
                    iDigito2Aux = iDigito2Aux + (12 - iCont) * iDigitoCPF;
                }
                iRestoDivisao = (iDigito1Aux % 11);
                if (iRestoDivisao < 2) {
                    iDigito1 = 0;
                } else {
                    iDigito1 = 11 - iRestoDivisao;
                }
                iDigito2Aux += 2 * iDigito1;
                iRestoDivisao = (iDigito2Aux % 11);
                if (iRestoDivisao < 2) {
                    iDigito2 = 0;
                } else {
                    iDigito2 = 11 - iRestoDivisao;
                }
                strDigitoVerificador = strCpf.substring(strCpf.length()-2, strCpf.length());
                strDigitoResultado = String.valueOf(iDigito1) + String.valueOf(iDigito2);
                return strDigitoVerificador.equals(strDigitoResultado);
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }
    
  public static boolean validaData(String Dt) {  
      //variaveis que recebem o valor  
      Integer Dia,Mes;  
      Integer Ano;   
      //retorno padrão  

      //Se a data estiver completa  
      if(Dt.trim().length()==10) {  
         //quebra a string  
        Dia = Integer.parseInt(Dt.substring(1,2));  
        Mes = Integer.parseInt(Dt.substring(3,5));  
        Ano = Integer.parseInt(Dt.substring(3,5));  
         //verifica variaveis  
        if(  
            ( (Mes.equals(1) || Mes.equals(3) || Mes.equals(5) || Mes.equals(7) || Mes.equals(8) || Mes.equals(10) || Mes.equals(12)) && (Dia>=1 && Dia <=31))  
            ||  
            ( (Mes.equals(4) || Mes.equals(6) || Mes.equals(9) || Mes.equals(11)) && (Dia>=1 && Dia <=30))  
            ||  
            ( (Mes.equals(2)) && (AnoBissexto(Ano)) && (Dia>=1 && Dia <=29))  
            ||  
            ( (Mes.equals(2)) && !(AnoBissexto(Ano)) && (Dia>=1 && Dia <=28))  
          ){  
            return true;  
         }else{
            return false;
         }  
      }else{  
            return false;
   }  

    }  
  
  private static boolean AnoBissexto (int ano){     
    return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;     
  }

}
