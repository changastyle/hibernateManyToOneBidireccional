/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="localidad")
public class Localidad implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLocalidad;
    private String nombre;
    @OneToMany (cascade=javax.persistence.CascadeType.ALL)
    @JoinColumn(name="fkLocalidad")
    private List<Contacto> contactos;

    @Override
    public String toString()
    {
        return "Localidad{" + "idLocalidad=" + idLocalidad + ", nombre=" + nombre + '}';
    }
    
    
}
