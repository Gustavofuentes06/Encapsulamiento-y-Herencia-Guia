public class camion extends vehiculodecarga {
    private int numEjes;

    public camion (String marca,String modelo, int año, int kilometraje, int capacidaddecarga,int numEjes){
        super(marca, modelo, año, kilometraje, capacidaddecarga);
        this.numEjes=numEjes;

    }
    public int getnumEjes (){
        return numEjes;
    }
    public void setnumEjes(int numEjes){
        this.numEjes=numEjes;
    
    }

    public void mostrainfo (){
        super.mostrarinfo();
        System.out.println(" La cantidad de ejes es de: "+ numEjes);
    }

public void realizarMantenimiento(){
    super.realizarMantenimiento();
    System.out.println("-Verifica los otros fluidos");
    System.out.println("-Rota tus neumáticos");
    System.out.println("-Limpia el exterior de tu camión");
    System.out.println("-Lleva tu camión a las revisiones técnicas");
}
}
