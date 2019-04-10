package net.zerobuddys.core.main;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class Main extends PluginBase implements Listener {

    private static String CBPrefix = "[§eCityBuild§r] §7| ";
    private static String HelpList = "§7[§a+§r§7] | ";
    private static String ClearPrefix = "[§cClear§r] §7| ";

    @Override
    public void onEnable() {
        getLogger().info(TextFormat.GREEN + "Das Core System Ist am Starten....");
        getLogger().info(TextFormat.GRAY + "---------------------------");
        getLogger().info(TextFormat.GOLD + "Das System : CBSystem");
        getLogger().info(TextFormat.GOLD + "Der Developer : ZeroBuddys");
        getLogger().info(TextFormat.GOLD + "Die Version : 1.2.3");
        getLogger().info(TextFormat.GRAY + "---------------------------");
        getLogger().info(TextFormat.AQUA + "Der Developer Vom Core System Ist ZeroBuddysYT");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (command.getName().toLowerCase()){
            case "cbdev":
                if (!(sender instanceof Player)){
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider bist Du kein Spieler! Du musst aber Ein Spieler Sein um diesen Comamnd Nutzen Zu können!");
                    break;
                }
                Player p = (Player) sender;
                if (p.hasPermission("command.cb.dev")){
                    sender.sendMessage(CBPrefix + TextFormat.AQUA + "Der Developer vom CityBuild Core System ist ZeroBuddysYT");
                    break;
                } else {
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider hast du Keine Recht dafür!");
                }
                break;
            case "cbrang":
                if (!(sender instanceof Player)){
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider bist Du kein Spieler! Du musst aber Ein Spieler Sein um diesen Comamnd Nutzen Zu können!");
                    break;
                }
                Player player = (Player) sender;
                if (player.hasPermission("command.cb.rang")){
                    sender.sendMessage(CBPrefix + TextFormat.AQUA + "Du möchtest Ein Rang Haben? Denn Schribe ZeroBuddys#4852 Auf Discord An!");
                    sender.sendMessage(CBPrefix + TextFormat.GOLD + "Den Premium 5 Euro PSC");
                    sender.sendMessage(CBPrefix + TextFormat.BLUE + "Den Suprem 10 Euro PSC");
                    sender.sendMessage(CBPrefix + TextFormat.GREEN + "Und der Der Lord 10 Euro PSC");
                    sender.sendMessage(CBPrefix + TextFormat.AQUA + "Und Sag Ihm Welchen Rang Du Möchtest!");
                } else {
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider hast du Keine Recht dafür!");
                }
                break;
            case "cbping":
                if (!(sender instanceof Player)){
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider bist Du kein Spieler! Du musst aber Ein Spieler Sein um diesen Comamnd Nutzen Zu können!");
                    break;
                }
                Player players = (Player) sender;
                if (players.hasPermission("cb.command.ping")){
                    sender.sendMessage(CBPrefix + TextFormat.YELLOW + "Pong Ping Pong!");
                } else {
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider hast du Keine Recht dafür!");
                }
                break;

            case "cbmode":
                if (!(sender instanceof Player)){
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider bist Du kein Spieler! Du musst aber Ein Spieler Sein um diesen Comamnd Nutzen Zu können!");
                    break;
                }
                Player pl = (Player) sender;
                if (pl.hasPermission("cb.command.mode")){
                    sender.sendMessage(CBPrefix + TextFormat.GOLD + "CityBuild Mode Trollolollololol");
                    break;
                } else {
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider hast du Keine Recht dafür!");
                }
                break;

            case "cbsystem":
                if (!(sender instanceof Player)){
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider bist Du kein Spieler! Du musst aber Ein Spieler Sein um diesen Comamnd Nutzen Zu können!");
                    break;
                }
                Player player3 = (Player) sender;
                if (player3.hasPermission("command.cb.system")){
                    sender.sendMessage(CBPrefix + TextFormat.BLUE + "Das CityBuild System wurde Für den Server ClayLordMC Gecodet Von Den Developer ZeroBuddysYT");
                    break;
                } else  {
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider hast du Keine Recht dafür!");
                }
                break;

            case "cbclear":
                if (!(sender instanceof Player)){
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider bist Du kein Spieler! Du musst aber Ein Spieler Sein um diesen Comamnd Nutzen Zu können!");
                    break;
                }
                Player player1 = (Player) sender;
                if (player1.hasPermission("cb.command.clear")){
                    sender.sendMessage(ClearPrefix + TextFormat.GOLD + "Dein Inv, Wurde Geleert!");
                    ((Player) sender).getInventory().clearAll();
                } else {
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider hast du Keine Recht dafür!");
                }
                break;

            case "cbheal":
                if (!(sender instanceof Player)){
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider bist Du kein Spieler! Du musst aber Ein Spieler Sein um diesen Comamnd Nutzen Zu können!");
                    break;
                }
                Player spieler = (Player) sender;
                if (sender.hasPermission("cb.command.heal")){
                    sender.sendMessage(CBPrefix + TextFormat.BLUE + "Du Wurdest Gehealt!");
                    ((Player) sender).setMaxHealth(20);
                } else {
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider hast du Keine Recht dafür!");
                }
                break;

            case "cbfeed":
                if (!(sender instanceof Player)){
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider bist Du kein Spieler! Du musst aber Ein Spieler Sein um diesen Comamnd Nutzen Zu können!");
                    break;
                }
                Player s =  (Player) sender;
                if (sender.hasPermission("cb.command.feed")){
                    sender.sendMessage(CBPrefix + TextFormat.BLUE + "Du Bist Wieder Voll!");
                    ((Player) sender).getFoodData().reset();
                } else {
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider hast du Keine Recht dafür!");
                }
                break;

            case "cbfeedback":
                if (!(sender instanceof Player)){
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider bist Du kein Spieler! Du musst aber Ein Spieler Sein um diesen Comamnd Nutzen Zu können!");
                    break;
                }
                Player sp = (Player) sender;
                if (sender.hasPermission("cb.command.feedback")){
                    sender.sendMessage(CBPrefix + TextFormat.AQUA + "Du Hast Ein Paar Ideen Für diese System? Wenn ja Schribe Mal ZeroBuddysYT Auf Discord An! -> ZeroBuddys#4852");
                } else {
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider hast du Keine Recht dafür!");
                }
                break;

            case "cbhelp":
                if (!(sender instanceof Player)){
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider bist Du kein Spieler! Du musst aber Ein Spieler Sein um diesen Comamnd Nutzen Zu können");
                    break;
                }
                Player ps = (Player) sender;
                if (sender.hasPermission("cb.command.help")){
                    sender.sendMessage(CBPrefix + TextFormat.AQUA + "Alle Commands Für Dich in einer Liste!");
                    sender.sendMessage(HelpList + TextFormat.YELLOW + "/cbdev" + TextFormat.GRAY + "Der System Developer Vom CityBuild Core System");
                    sender.sendMessage(HelpList + TextFormat.YELLOW + "/cbrang" + TextFormat.GRAY + "Du möchtest Gerne Ein Rang Haben? Den Schaue Mal Welchen Rang Du haben Willst!");
                    sender.sendMessage(HelpList + TextFormat.YELLOW + "/cbping" + TextFormat.GRAY + "FunCommand | Ping Pong Ping");
                    sender.sendMessage(HelpList + TextFormat.YELLOW + "/cbmode" + TextFormat.GRAY + "FunCommand | CbMode :)");
                    sender.sendMessage(HelpList + TextFormat.YELLOW + "/cbsystem" + TextFormat.GRAY + "Die System Infos Über Das Plugin");
                    sender.sendMessage(HelpList + TextFormat.YELLOW + "/cbclear" + TextFormat.GRAY + "Leere Dein Inventroy!");
                    sender.sendMessage(HelpList + TextFormat.YELLOW + "/cbheal" + TextFormat.GRAY + "Du Musst Dich Mal Healen? Den Test Mal den Command ;)");
                    sender.sendMessage(HelpList + TextFormat.YELLOW + "/cbfeed" + TextFormat.GRAY + "Du Braust Etwas Zu Essen? Den Test Mal Command!");
                    sender.sendMessage(HelpList + TextFormat.YELLOW + "/cbfeedback" + TextFormat.GRAY + "Du Möchtest Uns Gerne Idden Geben oder Du Hast Fragen Den Test den Command!");
                    sender.sendMessage(HelpList + TextFormat.YELLOW + "/cbhelp" + TextFormat.GRAY + "Alle Commands Für Dich in einer Liste");
                    sender.sendMessage(HelpList + TextFormat.YELLOW + "/allsystems" + TextFormat.GRAY + "Alle System Für Dich in einer Liste");
                    sender.sendMessage(CBPrefix + TextFormat.AQUA + "Alle Commands Für Dich in einer Liste!");
                }
                break;

            case "allsystems":
                if (!(sender instanceof Player)){
                    sender.sendMessage(CBPrefix + TextFormat.RED + "Leider bist Du kein Spieler! Du musst aber Ein Spieler Sein um diesen Comamnd Nutzen Zu können!");
                    break;
                }
                Player player2 = (Player) sender;
                if (sender.hasPermission("system.command.all")){
                    sender.sendMessage(CBPrefix + TextFormat.AQUA + "Alle System In einer Liste Für Dich!");
                    sender.sendMessage(TextFormat.GRAY + "-> " + TextFormat.AQUA + "CityBuild System v1.2.3");
                    sender.sendMessage(TextFormat.GRAY + "-> " + TextFormat.AQUA + "Trolling System v1.0");
                    sender.sendMessage(TextFormat.GRAY + "-> " + TextFormat.AQUA + "Mood System v1.0");
                    sender.sendMessage(TextFormat.GRAY + "-> " + TextFormat.AQUA + "ClayCast System v1.0");
                    sender.sendMessage(TextFormat.GRAY + "-> " + TextFormat.AQUA + "Tipp System v1.0");
                    sender.sendMessage(TextFormat.GRAY + "-> " + TextFormat.AQUA + "KitForAll System v1.0");
                    sender.sendMessage(TextFormat.GRAY + "->" + TextFormat.AQUA + "Main CoreSystem v1.0");
                    sender.sendMessage(CBPrefix + TextFormat.AQUA + "Alle System In einer Liste Für Dich!");
                }
                break;
        }
        return true;
    }

    @Override
    public void onDisable() {
        getLogger().info(TextFormat.RED + "Das Core System Wird grade Gestoppt....");
        getLogger().info(TextFormat.GREEN + "Wenn das Plugin Nicht Am Starten Ist Reloade Mal den Server!");
    }
}
