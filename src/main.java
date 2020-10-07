
public class main {
    
    public static void main (String [] args){
    Directorio directorio=new Directorio();
    Cliente Nahuel=new Cliente(41272923,"Diaz","Pedro","Ciudad de la punta","Licitacion 4/02"); 
    Cliente Carmen=new Cliente(41272928,"Rodiguez","Carlos","Ciudad de la punta","Licitacion 4/02");
    Cliente Cliente1=new Cliente(25272923,"Zarate","Juan","Ciudad de la punta","Licitacion 4/02");
    Cliente Cliente2=new Cliente(26272923,"Galvo","Ezequiel","Suyuque","Licitacion 4/02");
    Cliente Cliente3=new Cliente(27272923,"Fernandez","Pablo","Suyuque","Licitacion 4/02");
    directorio.agregarCliente(162251,Nahuel);
    directorio.agregarCliente(644662, Carmen);
    directorio.agregarCliente(445687,Cliente1);
    directorio.agregarCliente(983216,Cliente2);
    directorio.agregarCliente(142213,Cliente3);
    directorio.buscarClientes("Suyuque");
    directorio.borrarCliente(41272923);
    directorio.listar();
    directorio.buscarCliente(142213);
    
    
    }
}
