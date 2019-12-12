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
  
  
  public String consultarActividad(Chip pChip){ //listado mensajes y llamadas de un numero
    
    int contador=0;
    String resultado="";
    resultado+="Las llamadas son: "+consultarLlamadasActividad(pChip)+"\n";
    resultado+="Los mensajes son: "+consultarMensajesActividad(pChip)+"\n";
    return resultado;
        
  }
  
  
  public String consultarLlamadasActividad(Chip pChip){ 
    
    int contador=0;
    String resultado="";
    while(contador<llamadas.length){
        
      if(llamadas[contador].numDestino.equals(pChip.numTelefono)){
          
        resultado+="Duracion: "+llamadas[contador].duracion+"\n";
        resultado+="Número de Destino: "+llamadas[contador].numDestino+"\n";
        resultado+="Fecha y hora: "+llamadas[contador].fechaHora+"\n"+"\n";
        
      }
      
      contador+=1;    
    
    }
    
    return resultado;
        
  }
  
  
  public String consultarMensajesActividad(Chip pChip){ 
    
    int contador=0;
    String resultado="";
    while(contador<mensajes.length){
        
      if(mensajes[contador].numDestino.equals(pChip.numTelefono)){
          
        resultado+="Contenido: "+mensajes[contador].texto+"\n";
        resultado+="Número de Destino: "+mensajes[contador].numDestino+"\n";
        resultado+="Fecha y hora: "+mensajes[contador].fechaHora+"\n"+"\n";
        
      }
      
      contador+=1;    
    
    }
    
    return resultado;
        
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
  
  
  public String consultarMensajesEnviados(){
    
    int contador=0;
    String resultado="";
    while(contador<mensajes.length){
        
      resultado+="Contenido: "+mensajes[contador].texto+"\n";
      resultado+="Número de Destino: "+mensajes[contador].numDestino+"\n";
      resultado+="Fecha y hora: "+mensajes[contador].fechaHora+"\n"+"\n";
      contador+=1;    
    
    }
    
    return resultado; 
        
  }
  
  
  public String consultarLlamadasEnviadas(){
    
    int contador=0;
    String resultado="";
    while(contador<llamadas.length){
        
      resultado+="Duracion: "+llamadas[contador].duracion+"\n";
      resultado+="Número de Destino: "+llamadas[contador].numDestino+"\n";
      resultado+="Fecha y hora: "+llamadas[contador].fechaHora+"\n"+"\n";  
      contador+=1;    
    
    }
    
    return resultado;  
        
  }
  
  
  public String transferir(Chip pChip, int pMonto){
      
      
    if(pMonto>0){        
      
      if(verificarSaldo()==true){
        
        if(consultarSaldo()>=pMonto){
        
          pChip.saldo+=pMonto;
          saldo-=(pMonto+5);
          return "Se realizó la transferencia de manera exitosa por un monto de: "+pMonto;
        
        } else{
        
            return "No posee el monto que desea transferir";
         
          }
    
      } else{
    
        return "No posee saldo disponible para realizar la transacción!";
    
        }         

    } else{
    
         return "Monto de transferencia inválido!";
    
      }  
    
        
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
