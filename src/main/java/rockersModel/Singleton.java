package rockersModel;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	private Long wiproID = 0L;
	
	private Singleton() {}
	
	public static Singleton getInstance(){
		
		return instance;
	}
	
	public Long getWiproId() {
		
		//wiproID++;
		return ++wiproID;
	}
}
