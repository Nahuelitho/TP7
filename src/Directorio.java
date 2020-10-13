
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Directorio {

    private TreeMap<Long, Cliente> listaClientes = new TreeMap<>();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void agregarCliente(long telefono, Cliente c) {
        Cliente cliente = listaClientes.put(telefono, c);
        if (cliente != null) {
            System.out.println("No se pudo agregar el cliente");
        } else {
            System.out.println("Se pudo agregar");
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void buscarCliente(long telefono) {
        System.out.print("\n");
        Set<Long> claves = listaClientes.keySet();
        //Pensaba hacer un for pero recorde que un telefono solo puede pertenecer a una persona
        if (listaClientes.containsKey(telefono)) {
            System.out.println("El Dueño de este celular es: " + listaClientes.get(telefono).getNombre() + " " + listaClientes.get(telefono).getApellido());
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public HashSet<Long> buscarTelefono(String apellido) {
        //    public Set<Long> buscarTelefono(String apellido) {
//        System.out.print("\n");
//        Cliente c;
//        HashSet<Long> telefonos = new HashSet<>();
//        for (Long telefono : listaClientes.keySet()) {
//            c = listaClientes.get(telefono);
//            if (c.getApellido().equals(apellido)) {
//                telefonos.add(telefono);
//            }     
//        }
//        return telefonos; 
//    }
        System.out.print("\n");
        HashSet<Long> telefonos = new HashSet<>();
        Set<Long> claves = listaClientes.keySet();

        Iterator it = claves.iterator();

        while (it.hasNext()) {
            Long Ntelefono = (Long) it.next();
            Cliente c = listaClientes.get(Ntelefono);

            if (c.getApellido().equals(apellido)) {
                telefonos.add(Ntelefono);
            }
            
        }
        System.out.print("Los telefonos del cliente son " + telefonos);    
        return telefonos;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    

    public Set<Cliente> buscarClientes(String ciudad) {
        System.out.println("\n");
        HashSet<Cliente> clientesxCiudad=new HashSet<>();

        Set<Long> claves = listaClientes.keySet();

        for (Long it : claves) {
            if (listaClientes.get(it).getCiudad() == ciudad) {
                clientesxCiudad.add(listaClientes.get(it));
            }
        }
        System.out.println("Los clientes por ciudad son: "+clientesxCiudad.toString());    
        return clientesxCiudad;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void borrarCliente(long dni) {
        System.out.print("\n");
        Set<Long> claves = listaClientes.keySet();
        Iterator<Long> it = claves.iterator();
        long key = -1;
        
        //for(Long it:claves){ es necesario sacar esto y crear un iterator para seguir recorriendo y ver si hay dos objetos con el mismo dni
        while (it.hasNext()) {
            key = it.next();
            if (listaClientes.get(key).getDni() == dni) {

                it.remove();//remuevo la clave, si la clave no existe el dato asociado tampoco
                //como variablre aqui podria poner un break pero eso solo me borraria un solo cliente y si hay otro con el mismo numero no me lo borra por eso hacemos un iterator
            }
        }
        System.out.println("Se borro un cliente con dni: " + dni);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //aqui muestro todos los elementos de la lista

    public void listar() {
        System.out.print("\n");
        for (Long it : listaClientes.keySet()) {
            System.out.println(listaClientes.get(it).getNombre() + " " + listaClientes.get(it).getApellido());
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
