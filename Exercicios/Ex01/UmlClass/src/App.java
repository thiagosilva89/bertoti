
public class App {
    static String nome = "Thiago";


    public static void main(String[] args) throws Exception {
        System.out.println(nome);

        alteraNome("Thais");

        System.out.println(nome);
        
    }

    public static void alteraNome(String recebeNome){
        nome = recebeNome;
    }

}
