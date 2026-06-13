package bot.javacore.POO1.metodo;

public class Pessoa {
    private int dinheiro;
    private String nome;
    private int level;
    private int xp;
    private int bonusDinheiroXP;
    private int quantiaXPUparLevel;

    public Pessoa(int dinheiro, String nome, int level, int xp, int bonusDinheiroXP, int quantiaXPUparLevel) {
        this.dinheiro = dinheiro;
        this.nome = nome;
        this.level = level;
        this.xp = xp;
        this.bonusDinheiroXP = bonusDinheiroXP;
        this.quantiaXPUparLevel = quantiaXPUparLevel;
    }

    public void upgradeXP(){
        if(xp >= quantiaXPUparLevel){
            level += 1;
            xp = 0;
            bonusDinheiroXP +=10;
            quantiaXPUparLevel *=2;
        }
    }

    public int getQuantiaXPUparLevel() {
        return quantiaXPUparLevel;
    }

    public int getLevel() {
        return level;
    }

    public int getBonusDinheiroXP() {
        return bonusDinheiroXP;
    }

    public String getNome() {
        return nome;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
