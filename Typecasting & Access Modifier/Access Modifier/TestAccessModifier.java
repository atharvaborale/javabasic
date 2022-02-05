package accessModifier;

public class TestAccessModifier {
	
	//another class same package 
			public static void main(String[] args) {
				AccessModifiers c=new AccessModifiers();
				c.methodPublic();
				c.methodDefault();
				c.methodPrivate();
				c.methodProtected();
			}

}
