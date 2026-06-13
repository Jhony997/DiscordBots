package bot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class WiredCatalogo extends ListenerAdapter {
    private int valor;

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;

        String msg = event.getMessage().getContentRaw();

        if(msg.equalsIgnoreCase("!wired")){
            event.getChannel().sendMessage("Comandos : !ativadores, !condicao, !variavel").queue();

        }

        switch (msg.toLowerCase()){
            case "!ativadores":
                event.getChannel().sendMessage("Usuário click mobi : ativa funçao quando click na mobília").queue();
                event.getChannel().sendMessage("Diz algo : ativa funçao usuário diz algo").queue();
                event.getChannel().sendMessage("Estado mobi é alterado : mobi muda de @state").queue();
                event.getChannel().sendMessage("Keybind : ativa com as tecla!").queue();
                break;
            case "!condicao":
                event.getChannel().sendMessage("Estado e posiçao combina : @state , @posi X ou Y,  mobi é igual").queue();
                event.getChannel().sendMessage("Ativador está no mobi : usuário mobi selecionado").queue();
                event.getChannel().sendMessage("Ter mobi em cima : se tiver mobilia em cima no mobi selecionado").queue();
                event.getChannel().sendMessage("Membro do grupo : se tiver no grupo escolhido!").queue();
                break;
                case  "!variavel":
                    event.getChannel().sendMessage("Valor variável : " + this.valor).queue();
                    event.getChannel().sendMessage("Digite :v+ (somar) | :v- (diminuir) | :v* (multiplica 2)").queue();
                    break;
            case ":v+":
                valor+=1;
                event.getChannel().sendMessage("Valor alterado!").queue();
                break;
            case ":v-":
                valor-=1;
                event.getChannel().sendMessage("Valor alterado!").queue();
                break;
            case ":v*":
                valor *=2;
                event.getChannel().sendMessage("Valor alterado!").queue();
                break;
        }

    }
}
