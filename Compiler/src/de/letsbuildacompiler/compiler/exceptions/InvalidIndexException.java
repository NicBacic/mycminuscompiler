package de.letsbuildacompiler.compiler.exceptions;

import org.antlr.v4.runtime.Token;

public class InvalidIndexException extends CompileException{
	private String varName;
	private int index;
	
	public InvalidIndexException(Token variableNameToken, int index) {
		super(variableNameToken);
		varName = variableNameToken.getText();
		this.index = index;
	}
	
	@Override
	public String getMessage() {
		return line + ":" + column + " Index <" + index + "> on vector <" + varName + "> is not greater than 0" ;
	}
}
