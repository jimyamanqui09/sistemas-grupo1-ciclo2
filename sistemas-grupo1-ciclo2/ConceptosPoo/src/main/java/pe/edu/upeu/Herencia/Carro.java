package pe.edu.upeu.Herencia;

public class Carro extends Vehiculo{
    String modelo="mustang";
    String placa="PE-14454";
    String color="Negro";


    void caracteristicas(){
        System.out.println("las carcateristicas de este carro son:");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Placa: "+placa);
        System.out.println("Color: "+color);

    }


    public void main(String[] args){
        Carro carro = new Carro();
        carro.caracteristicas();
        carro.sonido();
    }
}
