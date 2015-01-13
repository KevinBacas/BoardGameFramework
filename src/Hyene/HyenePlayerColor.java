package Hyene;

public enum HyenePlayerColor {
	RED,
	BLUE,
	GREEN,
	YELLOW;
	
	public HyenePlayerColor setColor(int value){
		return HyenePlayerColor.values()[this.ordinal() + value];
	}
}
