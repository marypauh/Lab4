package logicadenegocios;

import logicadenegocios.Chip;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @author Óscar Trejos y Maria Paula Rodriguez
 * @version 11/12/19
 */
public class Mensaje {
    
  protected int costoMensaje = 20;
  protected String texto = null;
  protected String numDestino = null;
  protected Date fechaHora;

  
  /**
   * Constructor de objetos para la clase Mensaje
   * 
   * @param pTexto y pChip. 
   */
  public Mensaje(String pTexto, String pNumDestino) {
      
    this.texto = pTexto;
    this.numDestino = pNumDestino;
    
  }

  
  public String getNumDestino(){
    
    return numDestino;  
      
  }
  
  
  public String getFechaHora(){
      
    SimpleDateFormat nuevaFecha= new SimpleDateFormat("dd/MM/yy");
    return nuevaFecha.format(fechaHora);
      
  }
  
  
  public String getTexto(){
      
    return texto;
          
  }
  
}
