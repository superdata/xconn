package io.xconn.connector.sqlserver.storedprocedure;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;

import io.xconn.connector.constant.DBType;
import io.xconn.connector.param.ConnectionParam;
import io.xconn.connector.param.StoredProcedureParam;
import io.xconn.connector.sqlserver.mgr.ConnectionMgr;

public abstract class StoredProcedureBase 
{
	
	public abstract Collection<StoredProcedureParam<?>> getStoredProcedureParams();

	public abstract String getStoredProcedureName();
	
	public void exec(String dbConnUrl, String userName, String password) throws SQLException
	{
		ConnectionParam connParam = new ConnectionParam(dbConnUrl, userName, password);
		Connection conn = ConnectionMgr.getInstance().getConnection(DBType.MSSQLServer, connParam);
		
	}

}
