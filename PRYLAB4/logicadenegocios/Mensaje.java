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
    
  private int costoMensaje = 20;
  protected String texto = null;
  protected String numDestino = null;
  protected Date fechaHora;

  
  /**
   * Constructor de objetos para la clase Mensaje
   * 
   * @param pTexto y pChip. 
   */
  public Mensaje(String pTexto, Chip pChip) {
      
    this.texto = pTexto;
    this.numDestino = pChip.numTelefono;
    setFechaHora();
    
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
  
  
  public String getTexto(){
      
    return texto;
          
  }
  
  
  /**
   * Método que permite realizar un mensaje .
   * 
   * @param pChip y pTexto.
   * @return Un mensaje de éxito o fallo de la transacción.
   */
  public String enviarMensaje(String pTexto, Chip pChip){
      
    this.numDestino = pChip.numTelefono;
    char digito = pTexto.charAt(128);
    if (Character.toString(digito) == null) { 
        
      pChip.saldo -= costoMensaje;
      setFechaHora();
      return "El mensaje ha sido enviado! Su saldo: " + pChip.saldo;
      
    } else {
    
      return "El texto no puede exceder los 128 caracteres";
    }
    
   }
   
  
} 
