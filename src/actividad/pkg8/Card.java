package actividad.pkg8;

public class Card {

    public static void main(String[] args) {
    }
    public Card(String palos, String color, String valor) {

            this.palos = palos;
            this.color = color;
            this.valor = valor;


        }

    @Override
    public String toString() {
        return "" + palos +   " " + color +  " " + valor ;
    }

    private String palos;

    private String color;

    private String valor;


    }