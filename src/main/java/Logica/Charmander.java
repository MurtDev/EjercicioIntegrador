
package Logica;


public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy un Charmander y este es mi ataque placaje");
        
        
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy un Charmander y este es mi ataque Araniazo");
           
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy un Charmander y este es mi ataque Mordisco");
        
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy un Charmander y este es mi ataque Puño Fuego");
        
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy un Charmander y este es mi ataque LanzaLLamas");
        
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy un Charmander y este es mi ataque Ascuas");
        
    }
    
}
