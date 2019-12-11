package logicadenegocios;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Random;
import logicadenegocios.Chip;


/**
 * Write a description of class Llamada here.
 *
 * @author Óscar Trejos y Maria Paula Rodriguez
 * @version 11/12/19
 */
public class Llamada{
    
  private double duracion=0; 
  private int costoMinuto=30; //ver si es int o String
  private int numDestino=0;
  private Date fechaHora;
 
  

  /**
  * Constructor de objetos para la clase Llamada
  */
  public Llamada(int pNumDestino,double pDuracion){ //ver si se asigna el numero o lo agrega con contador
      
    numDestino=pNumDestino;
    duracion=pDuracion;
        
  }
  
  
  public void setFechaHora(){
      
    Calendar calendario=Calendar.getInstance();
    fechaHora=calendario.getTime();
          
  }
  
  
  public String getFechaCompra(){
      
    SimpleDateFormat nuevaFecha= new SimpleDateFormat("dd/MM/yy");
    return nuevaFecha.format(fechaHora);
      
  }
  
  
  public double getDuracion(){
      
    return duracion;
          
  }
  
  
  public double llamar(double duracion, Chip pChip){
      
    return duracion;
          
  }
  
  
  
  
  
}