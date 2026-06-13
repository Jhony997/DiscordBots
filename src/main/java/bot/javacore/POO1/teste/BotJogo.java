package bot.javacore.POO1.teste;

import bot.javacore.POO1.metodo.Banco;
import bot.javacore.POO1.metodo.Pessoa;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BotJogo extends ListenerAdapter {
    Banco se = new Banco(15_000);
    Pessoa pe = new Pessoa(0,"Jonas",1,0,0,12);
    int botLembraXP = 1;

    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        if (event.getAuthor().isBot()) return;

        String msg = event.getMessage().getContentRaw();

        if(msg.equalsIgnoreCase("!sacar")){
            se.sacarDinheiroBanco(pe);
            event.getChannel().sendMessage("Valor farmado 10$ | Saldo total : " + pe.getDinheiro() +"$").queue();
            pe.upgradeXP();
        }else if (pe.getLevel() > botLembraXP){
            botLembraXP +=1;
            event.getChannel().sendMessage(pe.getNome() + " Upou para level : " + pe.getLevel() + " | Bonus atual de dinheiro : " + pe.getBonusDinheiroXP() + "$").queue();
            event.getChannel().sendMessage("Necessário próximo level : " + pe.getQuantiaXPUparLevel()).queue();
        }

        if(msg.equalsIgnoreCase("!xp")){
            event.getChannel().sendMessage(pe.getNome() + " | Seu level : " + pe.getLevel() + " | Seu xp : " + pe.getXp() + " | Necessário para upar de level : " + pe.getQuantiaXPUparLevel() + "| Bonus dinheiro : " + pe.getBonusDinheiroXP()).queue();
        }

    }
}
