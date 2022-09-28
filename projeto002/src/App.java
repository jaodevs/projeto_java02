import entidades.Cliente;
import entidades.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente obj1 = new Cliente("354.800.118-12");
        obj1.setNome("João");
        obj1.setScoreCredito(1000);
        
        Funcionario obj2 = new Funcionario("354.800.118-12");
        obj2.setNome("Maria");
        obj2.setSalario(1000);        

        Util.info(obj1);
        Util.info(obj2);
    }

    

    // public static void info(Cliente cliente){
    //     System.out.println("JSON do " + cliente.toJson());
    // }
    
}
