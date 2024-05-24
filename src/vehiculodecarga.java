public class vehiculodecarga extends vehiculo {

    private int capacidaddecarga;

    //constructor

    public vehiculodecarga (String marca,String modelo, int año, int kilometraje, int capacidaddecarga){
    super(marca, modelo, año, kilometraje);
    this.capacidaddecarga=capacidaddecarga;
    }
    public int getcapacidaddecarga (){
        return capacidaddecarga;
    }
    public void setcapacidaddecarga (int capacidaddecarga){
        this.capacidaddecarga=capacidaddecarga;
    }    
        public void mostrainfo(){
            super.mostrarinfo();
            System.out.println("capacidad de carga "+ capacidaddecarga+ "kg");
        }
}
