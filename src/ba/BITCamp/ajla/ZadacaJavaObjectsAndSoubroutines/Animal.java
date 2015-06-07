package ba.BITCamp.ajla.ZadacaJavaObjectsAndSoubroutines;

public class Animal {
	
	private String type;
	private String soundsLike;

	public Animal(String type) {
		super();
		this.type = type;
	}
	
	public void setSound(String soundsLike){
		this.soundsLike = soundsLike;
	}
	
	@Override
	public String toString() {
		return "Animal [type=" + type + ", soundsLike=" + soundsLike + "]";
	}
	
}
