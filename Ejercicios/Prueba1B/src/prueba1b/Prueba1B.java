package prueba1b;

public class Prueba1B {

    public static void main(String[] args) {
        Auto carro1 = new Auto();
        Auto carro2 = new Auto();
        Auto carro3 = new Auto();
        Auto carro4 = new Auto();

        carro1.preguntarDatos();
        carro2.preguntarDatos();
        carro3.preguntarDatos();
        carro4.preguntarDatos();

        carro1.calcularTiempo(carro1.getTiempo());
        carro2.calcularTiempo(carro2.getTiempo());
        carro3.calcularTiempo(carro3.getTiempo());
        carro4.calcularTiempo(carro4.getTiempo());

        carro1.calcularEspacio(carro1.getMetros());
        carro2.calcularEspacio(carro2.getMetros());
        carro3.calcularEspacio(carro3.getMetros());
        carro4.calcularEspacio(carro4.getMetros());

        carro1.presentarDatos();
        carro2.presentarDatos();
        carro3.presentarDatos();
        carro4.presentarDatos();

        carro1.hallarMenorTiempo(carro1.getPromtiempo(), carro2.getPromtiempo(), carro3.getPromtiempo(), carro4.getPromtiempo());
        carro1.hallarMayorEspacio(carro1.getPromespacio(), carro2.getPromespacio(), carro3.getPromespacio(), carro4.getPromespacio());

    }

}
