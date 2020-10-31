
package actividad.pkg8;
import java.util.*;
import java.lang.*;
public class Actividad8 {
  
    public static void main(String[] args) {
     
    String [] valores ={"A","2","3","4","5","6","7","8","9","10","J","K","Q"};
        String [] palo = {"corazones","pika","diamante","trebol"};
       Deck baraja=new Deck();
       baraja.crearBaraja(palo,valores);
       baraja.showMenu();
       baraja.mezclar();
       baraja.head();
       baraja.pick();
       baraja.hand();           
  }
}
