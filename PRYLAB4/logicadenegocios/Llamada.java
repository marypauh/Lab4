package logicadenegocios;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Random;
import logicadenegocios.Chip;


/**
 * @author Óscar Trejos y Maria Paula Rodriguez
 * @version 11/12/19
 */
public class Llamada{
    
  protected double duracion=0; 
  private int costoMinuto=30; 
  protected String numDestino=null;
  protected Date fechaHora;
 
  
  /**
  * Constructor de objetos para la clase Llamada
  * 
  * @param PnumDestino y pDestino
  */
  public Llamada(String pNumDestino,double pDuracion){ 
      
    this.numDestino=pNumDestino;
    this.duracion=pDuracion;
        
  }
  
  
  public String getNumDestino(){
    
    return numDestino;  
      
  }
  
  
  public void setFechaHora(){
      
    Calendar calendario=Calendar.getInstance();
    fechaHora=calendario.getTime();
          
  }
  
  
  public String getFechaHora(){
      
    SimpleDateFormat nuevaFecha= new SimpleDateFormat("dd/MM/yy");
    return nuevaFecha.format(fechaHora);
      
  }
  
  
  public double getDuracion(){
      
    return duracion;
          
  }
  
  
   /**
   * Método que permite realizar una llamada.
   * 
   * @param pChip y pDuracion.
   * @return Un mensaje con el saldo actual del chip.
   */
  public double llamar(double pDuracion, Chip pChip){
      
    this.numDestino = pChip.numTelefono;
    if (numDestino != "911"){
     
      pChip.saldo -= (costoMinuto * pDuracion);
      setFechaHora();
      return pChip.saldo;
     
    } else {
    
      return pChip.saldo;    
        
    }
    
  }
  
}