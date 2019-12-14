package logicadenegocios;
import logicadenegocios.Chip;
import java.util.Random;

/**
 * @author Óscar Trejos y Maria Paula Rodriguez
 * @version 11/12/19
 */
public class Navegacion {
    
  private String paginaWeb = null;
  private double cantidadKilobytes=0;

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
  
  
  public  int setCantidadKilobytes(int min,int max){
      
    Random random=new Random();
    int cantidadKilobytes=random.nextInt(max-min)+min;
    return cantidadKilobytes;
    
  }
  
  
  /**
   * Método que permite visitar una página web específica.
   * 
   * @param pPaginaWeb y pChip.
   * @return devuelve un mensaje con la cantidad de megabytes disponibles.          
   */ 
  public String navegar(String pPaginaWeb,Chip pChip){
    
    double pCantidadMegabytes;  
    paginaWeb=pPaginaWeb;
    setCantidadKilobytes(1, 8);
    pCantidadMegabytes=pChip.getCantidadMegabytes();
    pCantidadMegabytes-=((cantidadKilobytes*1)/1000);
    pChip.setCantidadMegabytes(pCantidadMegabytes);
    return "La cantidad de megabytes disponibles es de: "+pChip.getCantidadMegabytes();    
      
  } 
  
}