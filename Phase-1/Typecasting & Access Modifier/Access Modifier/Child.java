package accessModifier;


	public class Child extends AccessModifiers{

		
		public static void main(String[] args) {
			Child c=new Child();
			//child will be able to access protected and public properties
			c.methodPublic();
			c.methodProtected();
			
			c.methodDefault();
			c.methodPrivate();
		}
}
