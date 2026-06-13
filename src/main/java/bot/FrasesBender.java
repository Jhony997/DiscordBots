package bot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class FrasesBender extends ListenerAdapter {
    private int falas = -1;

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event){
        if (event.getAuthor().isBot()) return;

        String msg = event.getMessage().getContentRaw();

        if(msg.equalsIgnoreCase("!links")){
            event.getChannel().sendMessage("Link de estudo de java : ").queue();
            event.getChannel().sendMessage("1. Playlist DevDojo : " + "https://www.youtube.com/playlist?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW").queue();
            event.getChannel().sendMessage("2. MSQL : " + "https://www.youtube.com/playlist?list=PLOPt_yd2VLWHGsaSIdpE3z76o5HbTfftl").queue();
            event.getChannel().sendMessage("3. Logaritmo ( matematica ) : " + "https://www.youtube.com/playlist?list=PLGyv8aUrOlzA9SnHx_PAGmbvfsCcGslnt").queue();
            event.getChannel().sendMessage("4. JDA bot discord java : " + "https://www.youtube.com/playlist?list=PLPjSeSDYEKNG7hH0J0Kxb339ctB_Nu7pr").queue();
            event.getChannel().sendMessage("5. HTTP em java : " + "https://www.youtube.com/playlist?list=PLAuGQNR28pW56GigraPdiI0oKwcs8gglW").queue();
        }

        if(msg.equalsIgnoreCase("!falas")){
            falas +=  1;
            switch (falas){
                case 1:
                    event.getChannel().sendMessage("Morda meu brilhante traseiro metálico!").queue();
                    break;
                case 2:
                    event.getChannel().sendMessage("Cala a boca, neném, eu sei").queue();
                    break;
                case 3:
                    event.getChannel().sendMessage("Comparem suas vidas com a minha e depois se matem").queue();
                    break;
                case 4:
                    event.getChannel().sendMessage("Eu amo roubar, eu amo pegar as coisas...").queue();
                    break;
                case 5:
                    event.getChannel().sendMessage("Eu sou o Bender, meu bem! Ai meu Deus, por favor, coloque bebida alcoólica!").queue();
                    break;
                case 6:
                    event.getChannel().sendMessage("Ah, agora eu entendi! Agora eu saquei! Agora todas as peças se encaixaram!").queue();
                    break;
                case 7:
                    event.getChannel().sendMessage("Eu decidi, depois de pouco pensar. Vou pegar um desses... como se chama? Uma dor de cabeça com imagens?").queue();
                    break;
                case 8:
                    event.getChannel().sendMessage("O número que eu estava pensando era a letra M").queue();
                    break;
                case 9:
                    event.getChannel().sendMessage("Vou criar meu próprio parque de diversões, com cassinos e prostitutas!").queue();
                    falas = 0;
                    break;
            }
        }
    }
}
