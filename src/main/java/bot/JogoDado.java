package bot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class JogoDado extends ListenerAdapter{
    private int dado_6;

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;

        String msg = event.getMessage().getContentRaw();

        if(msg.equalsIgnoreCase("!dice")) {
            dado_6 = (int) (Math.random() * 5) + 1;

            event.getChannel().sendMessage("\uD83C\uDFB2 Você tirou : " + dado_6).queue();
            switch (dado_6) {
                case 1:
                    event.getChannel().sendMessage("Evento : [ Térrivel ]").queue();
                    break;
                case 2:
                    event.getChannel().sendMessage("Evento : [ Péssimo ]").queue();
                    break;
                case 3:
                    event.getChannel().sendMessage("Evento : [ Ruim ]").queue();
                    break;
                case 4:
                    event.getChannel().sendMessage("Evento : [ Bom ]").queue();
                    break;
                case 5:
                    event.getChannel().sendMessage("Evento : [ Incrível ]").queue();
                    break;
                case 6:
                    event.getChannel().sendMessage("Evento : [ Its Perfect ]").queue();
                    break;
            }
        }
    }

    public int getDado_6() {
        return dado_6;
    }

    public void setDado_6(int dado_6) {
        this.dado_6 = dado_6;
    }
}
