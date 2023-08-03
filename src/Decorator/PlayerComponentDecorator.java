package Decorator;

public interface PlayerComponentDecorator extends PlayerComponent
{
	public PlayerComponent getPlayerComponent();
	public void setPlayerComponent(PlayerComponent playerComponent);
}
