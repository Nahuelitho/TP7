
public class main {
    
    public static void main (String [] args){
    Directorio directorio=new Directorio();
    Cliente Cliente5=new Cliente(41365923,"Diaz","Enrique","Ciudad de la punta","Licitacion 4/02"); 
    Cliente Cliente4=new Cliente(41842923,"Sosa","Carlos","Ciudad de la punta","Licitacion 4/02");
    Cliente Cliente1=new Cliente(25272923,"Zarate","Juan","Ciudad de la punta","Licitacion 4/02");
    Cliente Cliente2=new Cliente(26272923,"Sepulveda","Luciano","Suyuque","Licitacion 4/02");
    Cliente Cliente3=new Cliente(27272923,"Fernandez","Oscar","Suyuque","Licitacion 4/02");
    
    directorio.agregarCliente(162251,Cliente4);
    directorio.agregarCliente(644662,Cliente5);
    directorio.agregarCliente(445687,Cliente1);
    directorio.agregarCliente(983216,Cliente2);
    directorio.agregarCliente(142213,Cliente3);
    directorio.agregarCliente(143265,Cliente4);
    // para agregar el mismo cliente con distinto dni directorio.agregarCliente(564738, Cliente2);
    
    directorio.listar();
    
    directorio.buscarCliente(142213);
    
    directorio.buscarTelefono("Sosa");
    
    directorio.buscarClientes("Suyuque");
    
    directorio.borrarCliente(41842923);

    directorio.listar();
    }
}