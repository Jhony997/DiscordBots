package bot.javacore.POO1.metodo;

public class Banco {
    private int quantia;

    public Banco(int quantia) {
        this.quantia = quantia;
    }

    public void sacarDinheiroBanco(Pessoa p){
        p.setDinheiro(p.getDinheiro() + 10);
        p.setXp(p.getXp() + 1);
    }
}
