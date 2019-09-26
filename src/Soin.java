@FunctionalInterface
public interface Soin {
	public void soigne();
	public default void toto() {
		
		System.out.println("Default method");
	}

}
