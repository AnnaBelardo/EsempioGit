public class HelloWorld {
    private String nome;
    HelloWorld(String nome){
        this.nome = nome;
    }

    public void sayHello() {
        System.out.println("Hello " + nome);
    }
    
    public void sayBye() {
        System.out.println("Bye Bye " + nome + nome + nome + nome);
    }
    
    public void sayGoodBye() {
        System.out.println("Addio, addio, amici addio.");
    }
    
}
