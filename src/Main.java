public class Main
{
    public static void main(String args[])
    {
        System.out.println(daos.AbstractDAO.findAll(model.Localidad.class).size());
        
        for(model.Localidad  localidad : daos.LocalidadDAO.findAll())
        {
            System.out.println(localidad.toString());
        }
        for(model.Contacto contacto : daos.ContactosDAO.findAll())
        {
            System.out.println( contacto.toString());
        }
    }
}
