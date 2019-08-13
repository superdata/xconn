package io.xconn.connector.constant;

public enum DBType 
{
	MSSQLServer(1, "MSSQLServer", "com.microsoft.sqlserver.jdbc.SQLServerDataSource");
	
	private final int id;
	private final String name;
	private final String dataSourceClass;
	
	DBType(int id, String name, String dataSourceClass)
	{
		this.id = id;
		this.name = name;
		this.dataSourceClass = dataSourceClass;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDataSourceClass()
	{
		return dataSourceClass;
	}
}
