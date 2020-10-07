
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
        System.out.println("\n");
        Set<Long> claves = listaClientes.keySet();
        //Pensaba hacer un for pero recorde que un telefono solo puede pertenecer a una persona
        if (listaClientes.containsKey(telefono)) {
            System.out.println("El Dueño de este celular es: "+ listaClientes.get(telefono).getNombre()+" "+ listaClientes.get(telefono).getApellido());
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Correjir incompleto

    public void buscarTelefono(String apellido) {
        System.out.println("\n");
        Set<Long> claves = listaClientes.keySet();
       for (Long it : claves) {
            if (listaClientes.get(this).getApellido()==apellido) {
                System.out.println("El numero de telefono de este cliente es: " + listaClientes.keySet());
            } }
        
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    

    public void buscarClientes(String ciudad) {
        System.out.println("\n");
        Set<Long> claves = listaClientes.keySet();
        for (Long it : claves) {
            if (listaClientes.get(it).getCiudad() == ciudad) {
                System.out.println("Los clientes de la ciudad: -" + ciudad + "- Es " + listaClientes.get(it).getNombre() + " " + listaClientes.get(it).getApellido());
            }
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void borrarCliente(long dni) {
        Set<Long> claves = listaClientes.keySet();
        Iterator<Long> it = claves.iterator();
        long key = 0;
        //for(Long it:claves){ es necesario sacar esto y crear un iterator para seguir recorriendo y ver si hay dos objetos con el mismo dni
        while (it.hasNext()) {
            key = it.next();
            if (listaClientes.get(key).getDni() == dni) {

                it.remove();//remuevo la clave, si la clave no existe el dato asociado tampoco
                //como variablre aqui podria poner un break pero eso solo me borraria un solo cliente y si hay otro con el mismo numero no me lo borra por eso hacemos un iterator

            }
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //aqui muestro todos los elementos de la lista
    public void listar() {
        System.out.println("\nLos clientes del directorio son: ");
        for (Long it : listaClientes.keySet()) {
            System.out.println(listaClientes.get(it).getNombre() + " " + listaClientes.get(it).getApellido());

        }
    }

}
