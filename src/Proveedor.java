public class Proveedor {
    private String nombre;
    private String ciudad;

    public Proveedor(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getCiudad(){
        return this.ciudad;
    }
}
