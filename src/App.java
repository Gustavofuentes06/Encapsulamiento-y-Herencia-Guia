public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        auto Auto= new auto("toyota", "corola", 2024, 15000, 5, "gaslina");
        camion Camion= new camion("volvo", "FH", 2019, 75000, 20000, 4);


        System.out.println("Informacion del auto");
        Auto.mostrarinfo();
        System.out.println("");
        System.out.println("informacion del camion");
        Camion.mostrarinfo();
    }
}
