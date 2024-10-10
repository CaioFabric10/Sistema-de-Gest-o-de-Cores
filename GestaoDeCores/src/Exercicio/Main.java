package Exercicio;

public class Main {
    public static void main(String[] args) {
        FormaManager formaManager = new FormaManager();

        formaManager.addForma("Vermelho", "0,0", 10);
        formaManager.addForma("Verde", "1,1", 15);
        formaManager.addForma("Azul", "2,2", 20);

        formaManager.addForma("Vermelho", "3,3", 25);
        formaManager.addForma("Verde", "4,4", 30);
        formaManager.addForma("Azul", "5,5", 35);

        formaManager.apresentar();
    }
}
