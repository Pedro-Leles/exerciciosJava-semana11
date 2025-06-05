public class AnimalTeste {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 4);
        Animal gato = new Gato("Mimi", 2);

        System.out.println("Cachorro: " + cachorro.nome + ", Idade: " + cachorro.idade);
        cachorro.emitirSom();

        System.out.println("\nGato: " + gato.nome + ", Idade: " + gato.idade);
        gato.emitirSom();
    }
}
