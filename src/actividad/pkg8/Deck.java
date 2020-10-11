
package actividad.pkg8;

import java.util.LinkedList;
import java.util.Random;

public class Deck {

    public void deck(){
        
            Card C1 = new Card("Trébol", "Negro", "Ace");
            Card C2 = new Card("Trébol", "Negro", "2");
            Card C3 = new Card("Trébol", "Negro", "3");
            Card C4 = new Card("Trébol", "Negro", "4");
            Card C5 = new Card("Trébol", "Negro", "5");
            Card C6 = new Card("Trébol", "Negro", "6");
            Card C7 = new Card("Trébol", "Negro", "7");
            Card C8 = new Card("Trébol", "Negro", "8");
            Card C9 = new Card("Trébol", "Negro", "9");
            Card C10 = new Card("Trébol", "Negro", "10");
            Card CJ = new Card("Trébol", "Negro", "Jack");
            Card CQ = new Card("Trébol", "Negro", "Queen");
            Card CK = new Card("Trébol", "Negro", "King");

            Card HA = new Card("Corazon", "rojo", "Ace");
            Card H2 = new Card("Corazon", "rojo", "2");
            Card H3 = new Card("Corazon", "rojo", "3");
            Card H4 = new Card("Corazon", "rojo", "4");
            Card H5 = new Card("Corazon", "rojo", "5");
            Card H6 = new Card("Corazon", "rojo", "6");
            Card H7 = new Card("Corazon", "rojo", "7");
            Card H8 = new Card("Corazon", "rojo", "8");
            Card H9 = new Card("Corazon", "rojo", "9");
            Card H10 = new Card("Corazon", "rojo", "10");
            Card HJ = new Card("Corazon", "rojo", "Jack");
            Card HQ = new Card("Corazon", "rojo", "Queen");
            Card HK = new Card("Corazon", "rojo", "King");

            Card PA = new Card("Picas", "negro", "Ace");
            Card P2 = new Card("Picas", "negro", "2");
            Card P3 = new Card("Picas", "negro", "3");
            Card P4 = new Card("Picas", "negro", "4");
            Card P5 = new Card("Picas", "negro", "5");
            Card P6 = new Card("Picas", "negro", "6");
            Card P7 = new Card("Picas", "negro", "7");
            Card P8 = new Card("Picas", "negro", "8");
            Card P9 = new Card("Picas", "negro", "9");
            Card P10 = new Card("Picas", "negro", "10");
            Card PJ = new Card("Picas", "negro", "Jack");
            Card PQ = new Card("Picas", "negro", "Queen");
            Card PK = new Card("Picas", "negro", "King");

            Card DA = new Card("Diamantes", "rojo", "Ace");
            Card D2 = new Card("Diamantes", "rojo", "2");
            Card D3 = new Card("Diamantes", "rojo", "3");
            Card D4 = new Card("Diamantes", "rojo", "4");
            Card D5 = new Card("Diamantes", "rojo", "5");
            Card D6 = new Card("Diamantes", "rojo", "6");
            Card D7 = new Card("Diamantes", "rojo", "7");
            Card D8 = new Card("Diamantes", "rojo", "8");
            Card D9 = new Card("Diamantes", "rojo", "9");
            Card D10 = new Card("Diamantes", "rojo", "10");
            Card DJ = new Card("Diamantes", "rojo", "Jack");
            Card DQ = new Card("Diamantes", "rojo", "Queen");
            Card DK = new Card("Diamantes", "rojo", "King");


            LinkedList<Card> cartas = new LinkedList<>();

            cartas.add(C1);
            cartas.add(C2);
            cartas.add(C3);
            cartas.add(C4);
            cartas.add(C5);
            cartas.add(C6);
            cartas.add(C7);
            cartas.add(C8);
            cartas.add(C9);
            cartas.add(C10);
            cartas.add(CJ);
            cartas.add(CQ);
            cartas.add(CK);

                    cartas.add(HA);
                    cartas.add(H2);
                    cartas.add(H3);
                    cartas.add(H4);
                    cartas.add(H5);
                    cartas.add(H6);
                    cartas.add(H7);
                    cartas.add(H8);
                    cartas.add(H9);
                    cartas.add(H10);
                    cartas.add(HJ);
                    cartas.add(HQ);
                    cartas.add(HK);

                            cartas.add(PA);
                            cartas.add(P2);
                            cartas.add(P3);
                            cartas.add(P4);
                            cartas.add(P5);
                            cartas.add(P6);
                            cartas.add(P7);
                            cartas.add(P8);
                            cartas.add(P9);
                            cartas.add(P10);
                            cartas.add(PJ);
                            cartas.add(PQ);
                            cartas.add(PK);

                                    cartas.add(DA);
                                    cartas.add(D2);
                                    cartas.add(D3);
                                    cartas.add(D4);
                                    cartas.add(D5);
                                    cartas.add(D6);
                                    cartas.add(D7);
                                    cartas.add(D8);
                                    cartas.add(D9);
                                    cartas.add(D10);
                                    cartas.add(DJ);
                                    cartas.add(DQ);
                                    cartas.add(DK);

            System.out.println();
            System.out.println("Hay: " + cartas.size());

            Random numsaleatorio = new Random();
            int r = numsaleatorio.nextInt(cartas.size());

            System.out.println("Se mezclo el Deck");
            System.out.println("La carta numero uno es: " + cartas.get(r));
            cartas.remove(r);
            System.out.println("Solo quedan: " + cartas.size());

            Random numaleatorio = new Random();
            int n = numaleatorio.nextInt(cartas.size());

            //System.out.println(n);
            System.out.println("La carta es: " + cartas.get(n));

            cartas.remove(n);

            System.out.println("Solo quedan: " + cartas.size());

            Random numaleatorio1 = new Random();
            int j = numaleatorio1.nextInt(cartas.size());

            Random numaleatorio2 = new Random();
            int k = numaleatorio2.nextInt(cartas.size());

            Random numaleatorio3 = new Random();
            int l = numaleatorio3.nextInt(cartas.size());

            Random numaleatorio4 = new Random();
            int o = numaleatorio4.nextInt(cartas.size());

            Random numaleatorio5 = new Random();
            int p = numaleatorio5.nextInt(cartas.size());

            System.out.println("Shuffle de cartas");
            System.out.println(cartas.get(j));
            cartas.remove(j);
            System.out.println(cartas.get(k));
            cartas.remove(k);
            System.out.println(cartas.get(l));
            cartas.remove(l);
            System.out.println(cartas.get(o));
            cartas.remove(o);
            System.out.println(cartas.get(p));
            cartas.remove(p);

            System.out.println("Solo quenda: " + cartas.size());
        
    }
}
