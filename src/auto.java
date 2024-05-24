public class auto extends vehiculopasajeros {
    private String tipodecombustibe;

    public auto(String marca, String modelo, int año, int kilometraje, int numpasajero,String tipodecombustibe){
        super(marca, modelo, año, kilometraje, numpasajero);
        this.tipodecombustibe=tipodecombustibe;
    }
    public String gettipodecombustible(){
        return tipodecombustibe;
    }
    public void settipodecombustible (String tipodecombustible){
        this.tipodecombustibe=tipodecombustible;
    }
    @Override
    public void mostrainfo() {
        // TODO Auto-generated method stub
        super.mostrarinfo();
        System.out.println(" El tipo de combustible es: "+tipodecombustibe);
    }




}
