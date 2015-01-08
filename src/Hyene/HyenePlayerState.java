package Hyene;

public enum HyenePlayerState {
	START,
	MOTHER_TRAVEL,
	MOTHER_WELL,
	MOTHER_RETURN,
	VILLAGE,
	HYENE_VILLAGE,
	HYENE_TRAVEL,
	HYENE_WELL,
	HYENE_RETURN;
	
	public HyenePlayerState next(){
		if(this.ordinal() > HyenePlayerState.values().length - 1)
			return this;
		return HyenePlayerState.values()[this.ordinal() + 1];
	}
}
