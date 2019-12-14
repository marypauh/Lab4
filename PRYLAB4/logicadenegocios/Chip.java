package logicadenegocios;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
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
  protected Mensaje mensajesR[] = new Mensaje[10];
  private static int cantidadMensajes = 1;
  private static int cantidadMensajesR = 1;
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
  
  
  public int getFecha(){
    
    Calendar fecha = Calendar.getInstance();
    int mes = fecha.get(Calendar.MONTH) + 1;
    return mes;
    
  }
  
  
  /**
   * Método que permite activar el chip.
   * 
   * @param pDueño y pCantidadMegabytes
   * @return Un mensaje indicando el resultado de la acción.
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
  
  
  /**
   * Método que permite verficar si existe saldo disponible.
   * 
   * @return valor booleano indicando la respuesta.
   */
  public boolean verificarSaldo(){
    
    if(saldo>0){
    
      return true;
    
    }  else{
    
      return false;
      
    }
        
  }  
  
  
  /**
   * Método que muestra el saldo disponible.
   * 
   * @return monto del saldo. 
   */
  public double consultarSaldo(){
    
    return saldo;  
        
  }
  
  
   /**
   * Método que permite revisar la actividad de llamadas y mensajes
   * que se han tenido con otro chip específico.
   * 
   * @param pChip
   * @return Un mensaje con la información de las llamadas y mensajes.
   */
  public String consultarActividad(Chip pChip){ 
    
    int contador=0;
    String resultado="";
    resultado+="Las llamadas son: "+consultarLlamadasActividad(pChip)+"\n";
    resultado+="Los mensajes son: "+consultarMensajesActividad(pChip)+"\n";
    return resultado;
        
  }
  
  
   /**
   * Método que permite revisar la actividad de llamadas 
   * que se han tenido con otro chip específico.
   * 
   * @param pChip
   * @return Un mensaje con la información de las llamadas y mensajes.
   */
  public String consultarLlamadasActividad(Chip pChip){ 
    
    int contador=0;
    String resultado="";
    while(contador<llamadas.length){
        
      if(llamadas[contador].numDestino.equals(pChip.numTelefono)){
          
        resultado+="Duracion: "+ pChip.llamadas[contador].duracion+"\n";
        resultado+="Número de Destino: "+llamadas[contador].numDestino+"\n";
        resultado+="Fecha y hora: "+llamadas[contador].fechaHora+"\n"+"\n";
        
      }
      
      contador+=1;    
    
    }
    
    return resultado;
        
  }
  
  
  /**
   * Método que permite revisar la actividad de mensajes 
   * que se han tenido con otro chip específico.
   * 
   * @param pChip
   * @return Un mensaje con la información de las llamadas y mensajes.
   */
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
  
  
   /**
   * Método que permite recargar un chip.
   * 
   * @param pMonto
   * @return Un mensaje indicando el saldo actual del chip.
   */
  public String recargar(int pMonto){
    
    if(pMonto>0){        
        
      this.saldo+=pMonto;
      return "Se realizó exitosamente, el saldo actual es: "+saldo;
    
    } else{
        
      return"Monto de recarga inválido";
       
    }  
        
  }
  
  
  /**
   * Método que permite recargar un 100 colones si el saldo es cero.
   * 
   * @param pMonto
   * @return Un mensaje de éxito o fallo.
   */
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
  
  
  /**
   * Método que permite revisar la actividad de mensajes enviados.
   * 
   * @return Un reporte con todos los mensajes enviados.
   */
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
  
  
   /**
   * Método que permite revisar la actividad de llamadas enviadas. 
   * 
   * @return Un reporte con todos las llamadas enviadas.
   */
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
  
  
  /**
   * Método que permite transferir un monto a otro chip.
   * 
   * @param pMonto
   * @return Un mensaje de éxito o fallo.
   */
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
  
  
  /**
   * Método que permite revisar la actividad de mensajes recibidos.
   * 
   * @return Un reporte con todos los mensajes recibidos.
   */
  public String consultarMensajesRecibidos(){
    
    int contador=0;
    String resultado="";
    while(contador<mensajesR.length){
        
      resultado+="Contenido: "+mensajesR[contador].texto+"\n";
      resultado+="Número de Destino: "+mensajesR[contador].numDestino+"\n";
      resultado+="Fecha y hora: "+mensajesR[contador].fechaHora+"\n"+"\n";
      contador+=1;    
    
    }
    
    return resultado; 
        
  }
  
  
  /**
   * Método que permite revisar la cantidad de lineas que existen.
   * 
   * @return Un reporte con la cantidad de lineas que existen.
   */
  public int consultarCantidadLineas(){
    
    return cantidadLineasPrepago;
    
  }
  
  
   /**
   * Método que permite revisar la actividad de llamadas y mensajes
   * que se han tenido en el mes actual.
   *
   * @return Un mensaje con la información de las llamadas y mensajes.
   */
  public String consultarMesActual(Chip pChip){
    
    int mes = getFecha();
    String resultado = "";
    resultado += "Llamadas : " + "\n" + consultarLlamadasMes(mes) + "\n";
    resultado += "Mensajes Enviados : " + "\n"  + consultarMensajesMes(mes) + "\n";
    resultado += "Mensajes Recibidos : " + "\n"  + consultarMensajesRMes(mes) + "\n";
    
    return resultado;
    
  }
  
  
  /**
   * Método que permite consultar las llamadas realizadas en
   * un mes específico.
   * 
   * @param mes que se desea consultar
   * @return las llamadas realizadas en ese mes
   */
  public String consultarLlamadasMes(int pMes) {
  
    int contador = 0;
    String resultado="";
    while(contador<llamadas.length){
    
      Date fecha = llamadas[contador].fechaHora;
      int mes = fecha.getMonth();
      if (mes == pMes) {  
     
        resultado+="Duracion: "+llamadas[contador].duracion +"\n";
        resultado+="Número de Destino: "+llamadas[contador].numDestino+"\n";
        resultado+="Fecha y hora: "+llamadas[contador].fechaHora+"\n"+"\n";
        contador+=1;    
  
      } else {
    
        contador+=1; 
    
      } 
    
    }
    
    return resultado; 
  
  }
  
  
  /**
   * Método que permite consultar los mensajes enviados en
   * un mes específico.
   * 
   * @param mes que se desea consultar
   * @return los mensajes enviados en ese mes
   */
  public String consultarMensajesMes(int pMes) {
  
    int contador = 0;
    String resultado="";
    while(contador<mensajes.length){
    
      Date fecha = mensajes[contador].fechaHora;
      int mes = fecha.getMonth();
      if (mes == pMes) {  
     
        resultado+="Mensaje: "+mensajes[contador].texto +"\n";
        resultado+="Número de Destino: "+mensajes[contador].numDestino+"\n";
        resultado+="Fecha y hora: "+mensajes[contador].fechaHora+"\n"+"\n";
        contador+=1;    
  
      } else {
    
        contador+=1; 
    
      } 
    
    }
    
    return resultado; 
  
  }
   
  
  /**
   * Método que permite consultar los mensajes recibidos en
   * un mes específico.
   * 
   * @param mes que se desea consultar
   * @return los mensajes recibidos en ese mes
   */
  public String consultarMensajesRMes(int pMes) {
  
    int contador = 0;
    String resultado="";
    while(contador<mensajesR.length){
    
      Date fecha = mensajesR[contador].fechaHora;
      int mes = fecha.getMonth();
      if (mes == pMes) {  
     
        resultado+="Mensaje: "+mensajesR[contador].texto +"\n";
        resultado+="Número de Destino: "+mensajesR[contador].numDestino+"\n";
        resultado+="Fecha y hora: "+mensajesR[contador].fechaHora+"\n"+"\n";
        contador+=1;    
  
      } else {
    
        contador+=1; 
    
      } 
    
    }
    
    return resultado; 
  
  }
  
  
  /**
   * Método que permite revisar la actividad de llamadas y mensajes
   * que se han tenido en un mes específico.
   * 
   * @param pMes, pChip
   * @return Un mensaje con la información de las llamadas y mensajes.
   */
  public String consultarMes(Chip pChip, int pMes){
    
    String resultado = "";
    resultado += "Llamadas : " + "\n" + consultarLlamadasMes(pMes) + "\n";
    resultado += "Mensajes Enviados : " + "\n"  + consultarMensajesMes(pMes) + "\n";
    resultado += "Mensajes Recibidos : " + "\n"  + consultarMensajesRMes(pMes) + "\n"; 
    return resultado;  
        
  }  
  
  
   /**
   * Método que permite agregar mensajes enviados al chip.
   * 
   * @param pMensaje, pChip
   * @return Un mensaje con la información de las llamadas y mensajes.
   */
  public void agregarMensajeEnviado(Chip pChip, Mensaje pMensaje) {
  
    if (cantidadMensajes <=10) {
      
      mensajes[cantidadMensajes] = pMensaje;
      cantidadMensajes++;
      
    } else {
    
      cantidadMensajes = 1;
      
    }
    
  }
  
  
   /**
   * Método que permite agregar mensajes recibidos al chip.
   * 
   * @param pMensaje, pChip
   * @return Un mensaje con la información de las llamadas y mensajes.
   */
  public void agregarMensajeRecibido(Chip pChip, Mensaje pMensaje) {
  
    if (cantidadMensajesR <=10) {
      
      mensajesR[cantidadMensajesR] = pMensaje;
      cantidadMensajesR++;
      
    } else {
    
      cantidadMensajes = 1;
      
    }
    
  }
  
  
   /**
   * Método que permite agregar llamadas al chip.
   * 
   * @param pLlamada, pChip
   * @return Un mensaje con la información de las llamadas y mensajes.
   */
  public void agregarLlamada(Chip pChip, Llamada pLlamada) {
  
    if (cantidadLlamadas <=10) {
      
      llamadas[cantidadLlamadas] = pLlamada;
      cantidadLlamadas++;
      
    } else {
    
      cantidadLlamadas = 1;
      
    }
    
  }
  
}
