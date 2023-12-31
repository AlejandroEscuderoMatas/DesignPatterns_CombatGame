package Decorator;

import Characters.Player;

public class FireSword implements PlayerComponentDecorator
{
	PlayerComponent playerComponent;
	
	public FireSword(PlayerComponent playerComponent)
	{
		this.playerComponent = playerComponent;
		this.playerComponent.getPlayer().setPower(this.playerComponent.getPlayer().getPower()+10);
	}
	
	public String getDescription()
	{
		return this.playerComponent.getDescription() + "Fire Sword ";
	}

	public PlayerComponent getPlayerComponent()
	{
		return this.playerComponent;
	}

	public void setPlayerComponent(PlayerComponent playerComponent)
	{
		this.playerComponent = playerComponent;
	}
	
	public Player getPlayer()
	{
		return this.playerComponent.getPlayer();
	}
	
}
