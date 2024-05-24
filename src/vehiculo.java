public class vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;

    //Constructor 
    public vehiculo (String marca,String modelo, int año, int kilometraje){
        this.marca= marca;
        this.modelo= modelo;
        this.año = año;
        this.kilometraje= kilometraje;
    }


    public String getmarca(){
        return marca;
    }

    public void setmarca (String marca ){
        this.marca=marca;
    }

    public String getmodelo(){
        return modelo;
    }

    public void setmdodelo(String modelo){
        this.modelo=modelo;
    }
    public int getaño (){
        return año;
    }
    public void setaño(int año){
        this.año=año;
    }
    public int getkilometraje () {
        return kilometraje;
    }
    public void setkilometraje (int kilometraje){
        this.kilometraje=kilometraje;
    }
    

    public void mostrarinfo(){
        System.out.println("marca"+marca);
        System.out.println("modelo"+modelo);
        System.out.println("año"+año);
        System.out.println("kilometraje"+kilometraje);
    }
}
