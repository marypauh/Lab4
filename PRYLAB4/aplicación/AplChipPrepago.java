package aplicación;
import logicadenegocios.Chip;
import logicadenegocios.Llamada;
import logicadenegocios.Mensaje;
import logicadenegocios.Navegacion;

/**
 * @author Óscar Trejos y María Paula Rodríguez
 * @version 14/12/2019
 */
public class AplChipPrepago {
    
  /**
   * Constructor for objects of class AplChipPrepago
   */
  public AplChipPrepago() {
   
  }

  
  public static void main(){
  
    Chip chip1 = new Chip("123");
    Chip chip2 = new Chip("456");
    Chip chip3 = new Chip("789");
    
    System.out.println(chip1.activarChip("Daniel", 5));
    System.out.println(chip2.activarChip("Kevin", 8));
    System.out.println(chip2.activarChip("Kevin", 8));
    System.out.println(chip1.consultarSaldo());
    
    System.out.println(chip1.consultarActividad(chip2));
    
  }
}
