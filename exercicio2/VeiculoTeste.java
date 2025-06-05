public class VeiculoTeste {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Honda", "CG 160", 2021, 160);

        System.out.println("=== Carro ===");
        carro.exibirDados();

        System.out.println("\n=== Moto ===");
        moto.exibirDados();
    }
}
