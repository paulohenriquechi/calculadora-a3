public class Items {
    private String item;
    private int horas;

    public String getItem() {
        return item;
    }

    public int getHoras() {
        return horas;
    }
    
    public void setItem(int opcao) {
        switch (opcao) {
            case 1:
                this.item = "Telas com entradas e saídas de dados";
                break;
            case 2:
                this.item = "Telas de consultas com informação de dados";
                break;
            case 3:
                this.item = "Gravação de dados";
                break;
            case 4:
                this.item = "Algoritmos com processamentos";
                break;
            default:
                System.out.println("Opção inválida, tente novamente");
                break;
        }
    }
    public void setHoras(int dificuldade) {
        switch (this.item) {
            case "Telas com entradas e saídas de dados":
                this.horas = 4+(dificuldade*4);
                break;
            case "Telas de consultas com informação de dados":
                this.horas = 2+(dificuldade*2);
                break;
            case "Gravação de dados":
                if(dificuldade==1){
                    this.horas = 16;
                }else if(dificuldade==2) {
                    this.horas = 24;
                }else if(dificuldade==3){
                    this.horas = 36;
                }
                break;
            case "Algoritmos com processamentos":
                this.horas = 20;
                break;
            default:
                break;
        }
    }

    


    
    

}
