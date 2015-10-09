/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NICOLAS
 */
public class LocalidadDAO
{
    
    public static ArrayList<model.Localidad> findAll()
    {
        ArrayList<model.Localidad> arr = new ArrayList<model.Localidad>();
        List<Object> lista = daos.AbstractDAO.findAll(model.Localidad.class);
        
        for(Object o : lista)
        {
            model.Localidad aux = (model.Localidad) o;
            arr.add(aux);
        }
        return arr;
    }
}
