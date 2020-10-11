/*
 * 23.08.2019 Original version
 */


package dk.via.jpe.intlang;


public enum TokenKind
{
	IDENTIFIER,
	NUMBERS,
	OPERATOR,
	PUNCTUATION,

	CHAR( "Char"),
	INT("Int"),
	ARRAY("Array"),
	WHILE( "&" ),
	IF( "if" ),
	QUOTE("`"),
	LEFTBRACKET("{"),
	RIGHTBRACKET("}"),
	LEFT_SQUARE_BRACKET( "[" ),
	RIGH_SQUARE_BRACKET( "]" ),
	LEFT_PARATHESIS("("),
	RIGHT_PARATHESIS(")"),
	SEMICOLON( ";" ),
	COMMA( "," ),

	EOT,
	
	ERROR;
	
	
	private String spelling = null;
	
	
	private TokenKind()
	{
	}
	
	
	private TokenKind( String spelling )
	{
		this.spelling = spelling;
	}
	
	
	public String getSpelling()
	{
		return spelling;
	}
}