package gool.ast;

import gool.ast.type.IType;


public abstract class InitCall extends MethCall {
	protected InitCall(IType type, Expression target) {
		super(type, target);
	}
}
