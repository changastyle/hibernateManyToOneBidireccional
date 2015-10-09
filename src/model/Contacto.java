package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contactos")
public class Contacto implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private int fkLocalidad;
    @ManyToOne
    @JoinColumn(name="fkLocalidad", insertable=false, updatable=false)
    private Localidad loca;

    public Contacto()
    {
        loca = new Localidad();
    }

    @Override
    public String toString()
    {
        return "Contacto{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fkLocalidad=" + fkLocalidad + ", localidad=" + loca + '}';
    }
    
    
    
}
