package dev.chernykh.interactor.listeners;

import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InteractorListener implements Listener {
    private static final Logger logger = Logger.getLogger("Interactor");

    @EventHandler
    public void onCraft(CraftItemEvent event) {
        final HumanEntity entity = event.getWhoClicked();
        final ItemStack item = event.getRecipe().getResult();

        if (entity instanceof Player) {

            event.setCancelled(true);
            Player user =  (Player) entity;
            user.sendMessage("Этот крафт недоступен");
            logger.log(Level.INFO, user.getName() + " пытается сделать крафт " + item.getType() );


        }
    }
}
