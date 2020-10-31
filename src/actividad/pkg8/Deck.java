
package actividad.pkg8;

import java.util.*;
import java.lang.*;

public class Deck {

    List<Card> cartas;
    Scanner input = new Scanner(System.in);
    public void crearBaraja(String[]palo,String[] valores){ 
        
        cartas = new ArrayList<>();
        
        for( int i = 0; i<palo.length; i++){
        for(int j=0;j<valores.length;j++){
        Card carta =new Card ();
        if (palo[i].equals("corazon") || palo[i].equals("diamante")){
            carta.color="rojo";
        }else{
            carta.color="Negro";
        }
        carta.palo=palo[i];
        carta.valor=valores[j];
        cartas.add(carta);
        }
        }
            
        System.out.println("El tamaño de la baraja son " + cartas.size());



}
    public void mezclar(){
        Collections.shuffle(cartas);
        System.out.println("se mezclo el deck");
    }
    public void head(){
    Card carta =cartas.get(0);
    System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(0);
    System.out.println("tamaño"+cartas.size());
    }
    
    public void pick(){
    Card carta=cartas.get(5);
     System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(5);
    Collections.shuffle(cartas);
    System.out.println("tamaño"+cartas.size());
    }
    
    
    public void hand(){
    
        {Card carta=cartas.get(8);
    System.out.println ("Carta numero 4");
    System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(8);
    Collections.shuffle(cartas);
    System.out.println("tamaño"+cartas.size());}
    
        {Card carta=cartas.get(6);
    System.out.println ("Carta numero 4");
    System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(6);
    Collections.shuffle(cartas);
    System.out.println("tamaño"+cartas.size());}
    
    {Card carta=cartas.get(10);
    System.out.println ("Carta numero 3");
    System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(10);
    Collections.shuffle(cartas);
    System.out.println("tamaño"+cartas.size());}
    
    {Card carta=cartas.get(15);
    System.out.println ("Carta numero 2");
    System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(15);
    Collections.shuffle(cartas);
    System.out.println("tamaño"+cartas.size());}
    
    {Card carta=cartas.get(12);
    System.out.println ("Carta numero 1");
    System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(12);
    Collections.shuffle(cartas);
    System.out.println("tamaño"+cartas.size());}
   
   
    }
    
    
    
    
    public void showMenu(){
        boolean salir=true;
        while (salir){
           String opcion;
            System.out.println("");
            System.out.println("Bienvenido a poker!");
            System.out.println("");
            System.out.println("Selecciona una opcion:");
            System.out.println("");
            System.out.println("1 Mezclar Deck");
            System.out.println("");
            System.out.println("2 Saca la carta");
            System.out.println("");
            System.out.println("3 Carta al azar");
            System.out.println("");
            System.out.println("4 Generar mano de 5 cartas");
            System.out.println("");
            System.out.println("0 Salir");
            System.out.println("");
            opcion = input.nextLine();
            switch (opcion){
                case "1":
                    mezclar();
                    break;
                case "2":
                    head();
                    break;
                case "3":
                    pick();
                    break;
                case "4":
                    hand();
                    break;              
                default:
                    System.out.println("");
                    System.out.println("Opción no válida");
                    System.out.println("");
                    break;                    
                case "0":
                    System.out.println("El juego a finalizado");
                    break;
                    
            }

        try{ 
        if(cartas.size() <= 0){
            throw new Exception("Se han agotado las cartas");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
           break;
        }    
  
        
        }
               
    } 
}
