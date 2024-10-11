public class Main {
    public static void main(String[] args) {
        FormaManager formaManager = new FormaManager();

        formaManager.addForma("Vermelho", "0,9", 10);
        formaManager.addForma("Verde", "1,12", 20);
        formaManager.addForma("Vermelho", "21,27", 15);
        formaManager.addForma("Azul", "52,34", 25);
        formaManager.addForma("Verde", "40,14", 30);

        formaManager.apresentar();
    }
}
