package logicadenegocios;
import logicadenegocios.Chip;
import java.util.Random;

/**
 * @author Óscar Trejos y Maria Paula Rodriguez
 * @version 11/12/19
 */
public class Navegacion {
    
  protected String paginaWeb = null;
  protected double cantidadKilobytes=0;

  /**
   * Constructor de objetos para la clase Navegacion
   * 
   * @param pPaginaWeb y pCantidadKilobytes.
   */
  public Navegacion(String pPaginaWeb, double pCantidadKilobytes) {
      
    this.paginaWeb = pPaginaWeb;
    this.cantidadKilobytes = pCantidadKilobytes;
    
  }
  
  
  public String getPaginaWeb(){
    
    return paginaWeb;  
      
  }
  
  
  public double getCantidadKilobytes(){
    
    return cantidadKilobytes;  
      
  }
  
  
  public int setCantidadKilobytes(int min,int max){
      
    Random random=new Random();
    int cantidadKilobytes=random.nextInt(max-min)+min;
    return cantidadKilobytes;
    
  }
   
  
}