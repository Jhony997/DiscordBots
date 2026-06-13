package bot;

import bot.javacore.POO1.teste.BotJogo;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {

    public static void main(String[] args) throws Exception {

        String token = StringTokenNAOPOSTAGITHUBSEUANIMAL.token;

        JDA jda = JDABuilder.createDefault(token)
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(new BotListener(),new JogoDado(), new FrasesBender(), new WiredCatalogo(), new BotJogo())
                .build();


        jda.updateCommands().addCommands(
                Commands.slash("say", "bot fala")
                                .addOption(OptionType.STRING, "content", "text", true)
        ).queue();

        jda.updateCommands().addCommands(
                Commands.slash("hi","diz ola")
                        .addOption(OptionType.STRING,"hellou","text",true)
        ).queue();

        System.out.println("Bot ligado!");
    }

}