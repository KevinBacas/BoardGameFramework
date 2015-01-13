package Hyene;

public enum HyenePlayerColor {
	BLUE,
	RED,
	GREEN,
	YELLOW;
	
	public HyenePlayerColor setColor(int value){
		return HyenePlayerColor.values()[this.ordinal() + value];
	}
}
