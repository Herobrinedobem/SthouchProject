package org.sthouch.api.player;

import org.sthouch.api.server.Location;
import org.sthouch.api.world.World;

/**
 * <p>Essa interface � onde fica todas as informa��es de um jogador, como por exemplo seu nick, level, vida e etc.</p>
 * <p>Podemos pegar valores e setar valores.</p>
 * 
 * @author AtomGamers
 * @author Herobrinedobem
 * @version 1.2
 * 
 */
public interface Player {

	/**
	 * <p>Pega o nickname de um determinado Jogador.</p>
	 */
	public String getName();

	/**
	 * <p>Retorna a Localiza��o do Jogador.</p>
	 * @return Location
	 */
	public Location getPlayerLocation();
	
	/**
	 *<p>Manda uma mensagem no chat para um determinado Jogador.</p>
	 * 
	 * @param message 
	 */
	public void sendMessage(String message);
	
	/**
	 *<p>Teletransporta um determinado jogador para uma localiza��o.</p>
	 * 
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 */
	public void teleportTo(World world, Integer x, Integer y, Integer z);

	/**
	 *<p>Teletransporta um determinado jogador para uma localiza��o.</p>
	 * 
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @param yaw
	 * @param pitch
	 */
	public void teleportTo(World world, Integer x, Integer y, Integer z, Float yaw, Float pitch);

	/**
	 *<p>Teletransporta um determinado jogador para uma localiza��o.</p>
	 * 
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 */
	public void teleportTo(Location location);
	
	/**
	 *<p>Pega a quantidade atual de vida de um determinado jogador.</p>
	 */
	public Integer getHealth();
	
	/**
	 *<p>Seta a quantidade de vida para um determinado jogador.</p>
	 * 
	 * @param health
	 */
	public void setHealth(Integer health);
	
	/**
	 *<p>Pega a quantidade de "fome" atual de um determinado jogador.</p>
	 */
	public Integer getFoodLevel();
	
	/**
	 *<p>Seta a quantidade de "fome" de um determinado jogador.</p>
	 * 
	 * @param foodLevel
	 */
	public void setFoodLevel(Integer foodLevel);

}