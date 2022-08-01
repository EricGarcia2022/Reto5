package Modelo;

public class Sucursal {
    private int idSucursal;
    private String nombresucursal;

    public Sucursal() {
        this.idSucursal = 0;
        this.nombresucursal = "";
        
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreSucursal() {
        return nombresucursal;
    }

    public void setNombreSucursal(String nombresucursal) {
        this.nombresucursal = nombresucursal;
    }

    @Override
    public String toString() {
        return getNombreSucursal();
    }
    
    
}
