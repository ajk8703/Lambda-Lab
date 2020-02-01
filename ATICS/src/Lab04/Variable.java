package Lab04;


public class Variable implements Expression{
	protected final String varName;
	
	
	public Variable(String name) {
		varName = name;
	}
	
	public String toString() {
		return varName;
	}
	
}



class FreeVar extends Variable {

	public FreeVar(String name) {
		super(name);
	}
	
	
	
}

class BoundVar extends Variable {
	
	public BoundVar(String name) {
		super(name);
	}
	
}


class Parameter extends Variable {
	
	public Parameter(String name) {
		super(name);
	}
	
}



