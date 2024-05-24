public class vehiculopasajeros extends vehiculo {
    private int numpasajero;

    public vehiculopasajeros(String marca, String modelo, int año, int kilometraje, int numpasajero){
        super(marca, modelo, año, kilometraje);
        this.numpasajero=numpasajero;
    }
    public int getnumpasajero(){
        return numpasajero;
    }
    public void setnumpasajero(int numpasajero){
        this.numpasajero=numpasajero;
    }

    public void mostrainfo(){
        super.mostrarinfo();
        System.out.println("Numero de pasajeros : "+ numpasajero);
    }
}
