public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("João", 2000);
        Funcionario gerente = new Gerente("Maria", 5000);
        Funcionario estagiario = new Estagiario("Pedro", 1200);

        System.out.println(func.nome + " - Salário: R$" + func.calcularSalario());
        System.out.println(gerente.nome + " - Salário: R$" + gerente.calcularSalario());
        System.out.println(estagiario.nome + " - Salário: R$" + estagiario.calcularSalario());
    }
}
