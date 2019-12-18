public class HelloWorld {
    String nome;
    HelloWorld(String nome){
        this.nome = nome;
    }

    public void sayHello() {
        System.out.println("Hello " + nome);
    }
}
