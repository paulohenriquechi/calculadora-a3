public class Desenvolvedor {
    private String nome;
    private int horasDisponiveis;
    private double valorMensal;
    private double valorHora;

    public Desenvolvedor(String nome, int horasDisponiveis, double valorMensal) {
        this.nome = nome;
        this.horasDisponiveis = horasDisponiveis;
        this.valorMensal = valorMensal;
    }

    public String getNome() {
        return nome;
    }
    public int getHorasDisponiveis() {
        return horasDisponiveis;
    }
    public double getValorMensal() {
        return valorMensal;
    }
    
    public double getValorHora() {
        return valorHora;
    }
    
    public void calculadora() {
        this.valorHora = this.valorMensal/(20*this.horasDisponiveis);
    }

}
