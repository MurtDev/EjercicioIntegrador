
package Logica;


public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
       System.out.println("Hola soy un Pikachu y este es mi ataque placaje");
        
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy un Pikachu y este es mi ataque Araniazo");
        
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy un Pikachu y este es mi ataque Mordisco");
        
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy un Pikachu y este es mi ataque Impactrueno");
        
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy un Pikachu y este es mi ataque Puño Trueno");
        
    }
    
}
