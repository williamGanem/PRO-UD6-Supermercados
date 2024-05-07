import com.supermercado.acessorio.Cesta;
import com.supermercado.cliente.Cliente;

public class App {
    
    public static void main(String[] args) {
        
       Cesta cesta = new  Cesta(null, 0);
       System.out.println(cesta);
       Cliente cliente =new Cliente(null, cesta);
       System.out.println(cliente);
    }
}
