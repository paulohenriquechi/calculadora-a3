public class Orcamento {
    public static double calculoOrcamento(String nome, int totalHoras, double valorHora) {
        double custo = totalHoras*valorHora;
        double custoProjeto = custo+(custo*0.30);
        System.out.println("Nome: "+nome+"\nTotal de horas: "+totalHoras+"\nValor da Hora: "+valorHora+"R$"+"\nCusto Total do projeto: "+custoProjeto+"R$");
        return custoProjeto;
    }
    public static double calculoValor(int totalHoras, double valorHora) {
        double custo = totalHoras*valorHora;
        double custoProjeto = custo+(custo*0.30);
        return custoProjeto;
    }

}
