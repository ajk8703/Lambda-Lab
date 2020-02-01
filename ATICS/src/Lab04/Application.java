package Lab04;

public class Application implements Expression {
	// made of two expressions
	// linked list properties (left and right for tree)
	String name;
	Expression left;
	Expression right;
	
	public Application(String name, Expression l, Expression r) {
		left = l;
		right = r;
	}
	
	
	
	// a b c d
	// (((a b) c) d )
	public static Application applicate(Expression expr) {
		
		
		
		return new Application("thd", new Expression(), new Expression());
	}
	
	public String toString() {
		return "(" + this.left + " " + this.right + ")";
	}
	
	
}


