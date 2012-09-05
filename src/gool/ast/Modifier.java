package gool.ast;

public enum Modifier {
	PUBLIC, PRIVATE, PROTECTED, STATIC, ABSTRACT, FINAL, OVERRIDE, VIRTUAL;
	
	public String toString() {
		return name().toLowerCase();
	};
}
