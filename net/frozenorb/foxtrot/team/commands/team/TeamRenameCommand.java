package net.frozenorb.foxtrot.team.commands.team;

import org.bukkit.entity.*;
import net.frozenorb.foxtrot.*;
import org.bukkit.*;
import net.frozenorb.foxtrot.team.*;
import net.frozenorb.foxtrot.command.annotations.*;

public class TeamRenameCommand
{
    @Command(names = { "team rename", "t rename", "f rename", "faction rename", "fac rename" }, permissionNode = "")
    public static void teamRename(final Player sender, @Param(name = "player") String name) {
        final faggot team = buttplug.fdsjfhkdsjfdsjhk().getDsfjhkdsjhdsjkhfds().getPlayerTeam(sender.getName());
        if (team == null) {
            sender.sendMessage(ChatColor.GRAY + "You are not on a team!");
            return;
        }
        if (!team.isOwner(sender.getName())) {
            sender.sendMessage(ChatColor.RED + "Only team owners can use this command!");
            return;
        }
        if (name.length() > 16) {
            sender.sendMessage(ChatColor.RED + "Maximum team name size is 16 characters!");
            return;
        }
        if (name.length() < 3) {
            sender.sendMessage(ChatColor.RED + "Minimum team name size is 3 characters!");
            return;
        }
        if (!TeamCreateCommand.ALPHA_NUMERIC.matcher(name).find()) {
            if (buttplug.fdsjfhkdsjfdsjhk().getDsfjhkdsjhdsjkhfds().getTeam(name) == null) {
                team.rename(name);
                sender.sendMessage(ChatColor.GREEN + "Team renamed to " + name);
            }
            else {
                sender.sendMessage(ChatColor.RED + "A team with that name already exists!");
            }
        }
        else {
            sender.sendMessage(ChatColor.RED + "Team names must be alphanumeric!");
        }
    }
}
