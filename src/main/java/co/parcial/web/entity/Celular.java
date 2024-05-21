package co.parcial.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Celular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String serial;
    private Date fechaCompra;
    private int anoLanzamiento;
    private double precio;
    private String sistemaOperativo;
    private String gama;
    public void setMarca(String marca2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMarca'");
    }
    public void setSerial(String serial2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSerial'");
    }
    public void setFechaCompra(Date fechaCompra2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFechaCompra'");
    }
    public void setAnoLanzamiento(int anoLanzamiento2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAnoLanzamiento'");
    }
    public void setPrecio(double precio2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrecio'");
    }
    public void setSistemaOperativo(String sistemaOperativo2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSistemaOperativo'");
    }
    public String getGama() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGama'");
    }
    public String getSistemaOperativo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSistemaOperativo'");
    }
    public double getPrecio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrecio'");
    }
    public int getAnoLanzamiento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAnoLanzamiento'");
    }
    public Date getFechaCompra() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFechaCompra'");
    }
    public String getSerial() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSerial'");
    }
    public Object getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
    public void setId(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

    
}
