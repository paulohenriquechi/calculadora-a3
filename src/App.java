import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite a quantidade de horas disponiveis no dia: ");
        int horasDisponiveis = input.nextInt();

        System.out.println("Digite seu valor mensal desejado: ");
        double valorMensal = input.nextDouble();

        Desenvolvedor pessoa = new Desenvolvedor(nome, horasDisponiveis, valorMensal);
        pessoa.calculadora();

        System.out.println("Selecione uma opção: \n1 - Solicitar novo serviço \n2 - Sair");
        int opcao = input.nextInt();

        Items info = new Items();
        int horasTotais = 0;
        while(opcao!=2){
            System.out.println("Selecione uma opção: \n1 - Telas com entradas e saídas de dados;\n2 - Telas de consultas com informação de dados;\n3 - Gravação de dados;\n4 - Algoritmos com processamentos;");
            int item = input.nextInt();
            while(item<0||item>4){
                System.out.println("Opção inválida, tente novamente");
                System.out.println("Selecione uma opção: \n1 - Telas com entradas e saídas de dados;\n2 - Telas de consultas com informação de dados;\n3 - Gravação de dados;\n4 - Algoritmos com processamentos;");
                item = input.nextInt();
            }
            info.setItem(item);
            
            System.out.println("Agora selecione um grau de dificuldade entre 1 e 3: ");
            int dificuldade = input.nextInt();

            while(dificuldade<=0||dificuldade>3){
                System.out.println("Opção inválida, tente novamente");
                System.out.println("Selecione um grau de dificuldade entre 1 e 3: ");
                dificuldade = input.nextInt();
            }
            info.setHoras(dificuldade);
            horasTotais += info.getHoras();

            System.out.println("Deseja adicionar outro serviço?\n1- Sim\n2 - Não");
            opcao = input.nextInt();
        }
        double valorHora = pessoa.getValorHora();
        double total = Orcamento.calculoValor(horasTotais, valorHora);

        Orcamento.calculoOrcamento(nome, horasTotais, valorHora);

        ConexaoMySQL db = new ConexaoMySQL();
        String inicio = " create table orcamentos "+" ( nome varchar(100),totalHoras int,valorHora double,custoOrcamento double )";
        db.OpenDatabase();
        db.ExecutarQuery(inicio);
        String infos = String.format("insert into orcamentos (nome, totalHoras, valorHora, custoOrcamento) values('%s', %s, %s, %s);", nome, horasTotais, valorHora, total);
        db.ExecutarQuery(infos);
        db.CloseDatabase();

        input.close();
    }
}
