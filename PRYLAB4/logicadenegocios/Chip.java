package logicadenegocios;

import logicadenegocios.Llamada;
import logicadenegocios.Mensaje;
import logicadenegocios.Navegacion;


/**
 * Write a description of class Chip here.
 *
 * @author Óscar Trejos y Maria Paula Rodriguez
 * @version 11/12/19
 */
public class Chip{
    
  private double saldo=0; //lo puse cero para asignarle el bono cuando se active
  private int codigoPais=506; //ver si es int o String
  private int numTelefono=0;
  private boolean estado=false;
  private String dueño=null;
  private double cantidadMegabytes=0;
  private static int contadorSalvame=0;
  private static int cantidadLineasPrepago=0;
  

  /**
  * Constructor de objetos para la clase Chip
  */
  public Chip(int pNumTelefono){ //ver si se asigna el numero o lo agrega con contador
      
    numTelefono=pNumTelefono;
    cantidadLineasPrepago++;
        
  }
  
  
  public int getCodigoPais(){
    
    return codigoPais;  
        
  }
  
  
  public String getDueño(){
    
    return dueño;  
        
  }
  
  
  public boolean getEstado(){
    
    return estado;  
        
  }
  
  
  public void setCantidadMegabytes(){//utilizar random
    
    cantidadMegabytes=0;    
        
  }
  
  
  public double getCantidadMegabytes(){
    
    return cantidadMegabytes;    
        
  }
  
  
  public int getNumTelefono(){
    
    return numTelefono;    
        
  }
  
  
  public int getCantidadLlamadas(){//No se si es igual al de consultar llamadas
    
    return numTelefono;    
        
  }
  
  
  public String activarChip(String pDueño,double pCantidadMegabytes){
    
    if(estado==false){
        
      dueño=pDueño;
      cantidadMegabytes=pCantidadMegabytes;
      saldo=1000;
      estado=true;
      return "Se ha activado con éxito el chip";    
    
    } else{
        
        return "El chip ya se encuentra activado!";  
        
      }   
        
  }
  
  
  public boolean verificarSaldo(){
    
    if(saldo>0){
    
      return true;
    
    }  else{
    
          return false;
      
       }
        
  }
  
  
  public double consultarSaldoDisponible(){
    
    return saldo;  
        
  }
  
  
  public String consultarActividad(){
    
    return "";  
        
  }
  
  
  public String recargar(int pMonto){
    
    if(pMonto>0){        
        
      saldo+=pMonto;
      return "Se realizó exitosamente, el saldo actual es: "+saldo;
    
    } else{
        
        return"Monto de recarga inválido";
       
      }  
        
  }
  
  
  public String salvar(int pMonto){
    
    if(contadorSalvame<=3){        
        
      if(saldo==0){
          
        saldo+=100;
        return "Te han salvado de forma correcta!";        
        
      } else{
        
          return "Su saldo no corresponde a 0";       
        
        }
      
    
    } else{
        
        return"Ha superado la cantidad de veces que puede utilizar salvame";
       
      }  
        
  }
  
  
  public String consultarLlamadasEnviadas(){
    
    return "";  
        
  }
  
  
  public String consultarMensajesEnviados(){
    
    return "";  
        
  }
  
  
  public String transferir(Chip pChip, int monto){
    
    return "";  
        
  }
  
  
  public String consultarMensajesRecibidos(){
    
    return "";  
        
  }
  
  
  public String consultarMesActual(){
    
    return "";  
        
  }
  
  
  public String consultarMes(String pMes){
    
    return "";  
        
  }  
  


}
