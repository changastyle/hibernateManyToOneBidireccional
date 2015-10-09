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
public class ContactosDAO
{
    public static ArrayList<model.Contacto> findAll()
    {
        ArrayList<model.Contacto> arr = new ArrayList<model.Contacto>();
        List<Object> lista = daos.AbstractDAO.findAll(model.Contacto.class);
        
        for(Object o : lista)
        {
            model.Contacto aux = (model.Contacto) o;
            arr.add(aux);
        }
        return arr;
    }
}
