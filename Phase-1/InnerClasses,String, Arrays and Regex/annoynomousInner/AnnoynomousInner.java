package annoynomousInner;

public class AnnoynomousInner {
	
public static void main(String[] args) {
		
		Car bmwCustomModel= new Car() {

			public void stop() {
				System.out.println("Special Implementation of stop");
				
			}
			
			public void start() {
				System.out.println("Special Implementation of start");
				
			}
		};
		
		bmwCustomModel.start();
		bmwCustomModel.stop();
	}
}
