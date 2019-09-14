package io.xconn.connector.constant;

public enum ParamDirection 
{
	IN(1, "IN"),
	OUT(2, "OUT"),
	INTOUT(3, "INOUT"),
	RETURN(4, "RETURN");
	
	private final int id;
	private final String direction;
	
	ParamDirection(int id, String direction)
	{
		this.id = id;
		this.direction = direction;
	}
	
	public String getDirection()
	{
		return direction;
	}
}
