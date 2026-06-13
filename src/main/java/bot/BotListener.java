package bot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BotListener extends ListenerAdapter {
    // Map<String, Integer> money = new HashMap<>();

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;

        String msg = event.getMessage().getContentRaw();

        switch (msg.toLowerCase()) {
            case "!help":
                event.getChannel().sendMessage("Comandos : !help, !run, !stop, !sing, !death, !roll, !dice, !falas, !links, !wired ").queue();
                break;
            case "!run":
                event.getChannel().sendMessage("CORRENDO :O").queue();
                break;
            case "!stop":
                event.getChannel().sendMessage("PAREI DE CORRER!").queue();
                break;
            case "!sing":
                event.getChannel().sendMessage("MAMA JUST KILL A MAN").queue();
                break;
            case "!death":
                event.getChannel().sendMessage("OHHH OH ESTOU MORRENDO").queue();
                break;
            case "!roll":
                int dado = (int) (Math.random() * 10) + 1;
                event.getChannel().sendMessage("\uD83C\uDFB2 Você tirou: " + dado).queue();
        }
    }
}