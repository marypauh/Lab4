package logicadenegocios;

import logicadenegocios.Llamada;
import logicadenegocios.Mensaje;
import logicadenegocios.Navegacion;


/**
 * @author Óscar Trejos y María Paula Rodríguez
 * @version 11/12/19
 */
public class Chip{
    
  protected double saldo=0; 
  protected String codigoPais=null; 
  protected String numTelefono=null;
  private boolean estado=false;
  private String dueño=null;
  private double cantidadMegabytes=0;
  private static int contadorSalvame=0;
  private static int cantidadLineasPrepago=0;
  protected Llamada llamadas[] = new Llamada[10];
  protected Mensaje mensajes[] = new Mensaje[10];
  private static int cantidadMensajes = 1;
  private static int cantidadLlamadas = 1;
  
  
  /**
  * Constructor de objetos para la clase Chip
  */
  public Chip(String pNumTelefono){ 
      
    this.numTelefono=pNumTelefono;
    cantidadLineasPrepago++;
        
  }
  
  
  public String getCodigoPais(){
    
    return codigoPais;  
        
  }
  
  
  public String getDueño(){
    
    return dueño;  
        
  }
  
  
  public boolean getEstado(){
    
    return estado;  
        
  }
  
  
  public double getCantidadMegabytes(){
    
    return cantidadMegabytes;    
        
  }
  
  
  public void setCantidadMegabytes(double pCantidadMegabytes){
    
    cantidadMegabytes=pCantidadMegabytes;    
        
  }
  
  
  public String getNumTelefono(){
    
    return numTelefono;    
        
  }
  
  
  /**
   * 
   */
  public String activarChip(String pDueño,double pCantidadMegabytes){
      
    if(estado==false){
        
      this.dueño=pDueño;
      this.cantidadMegabytes=pCantidadMegabytes;
      this.saldo=1000;
      this.estado=true;
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
  
  
  public double consultarSaldo(){
    
    return saldo;  
        
  }
  
  
  public String consultarActividad(){ //listado mensajes y llamadas de un numero
    
    return "";  
        
  }
  
  
  public String recargar(int pMonto){
    
    if(pMonto>0){        
        
      this.saldo+=pMonto;
      return "Se realizó exitosamente, el saldo actual es: "+saldo;
    
    } else{
        
        return"Monto de recarga inválido";
       
      }  
        
  }
  
  
  public String salvar(int pMonto){
    
    if(contadorSalvame<=3){        
        
      if(saldo==0){
          
        this.saldo+=100;
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
  
  
  public int consultarCantidadLineas(){
    
    return cantidadLineasPrepago;
    
  }
  
  public String consultarMesActual(){
    
    return "";  
        
  }
  
  
  public String consultarMes(String pMes){
    
    return "";  
        
  }  
  

  public void agregarMensaje(Mensaje pMensaje) {
  
    if (cantidadMensajes <=10) {
      
      mensajes[cantidadMensajes] = pMensaje;
      cantidadMensajes++;
      //toString mensajes
    } else {
    
      cantidadMensajes = 1;
      
    }
    
  }
  
  
  public void agregarLlamada(Llamada pLlamada) {
  
    if (cantidadLlamadas <=10) {
      
      llamadas[cantidadLlamadas] = pLlamada;
      cantidadLlamadas++;
      //toString llamadas
    } else {
    
      cantidadLlamadas = 1;
      
    }
    
  }
 
}
