public class Hello {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 10; i > 0; i--) {
			System.out.println("Bomb make boom in " + i);
			Thread.sleep(1000);
		}
		System.out.println("BOOOOM!");

	}
}
