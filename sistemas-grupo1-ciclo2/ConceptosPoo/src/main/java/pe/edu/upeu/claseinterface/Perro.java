package pe.edu.upeu.claseinterface;

public class Perro implements Animal {
    @Override
    public void emitirSonido() {
        System.out.println("guau..guau");
    }

    @Override
    public void dormir() {
        System.out.println("zzzzz...zzzz....");
    }
}
