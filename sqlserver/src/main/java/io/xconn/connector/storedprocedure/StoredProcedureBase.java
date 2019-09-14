package io.xconn.connector.storedprocedure;

import java.util.Collection;

import io.xconn.connector.param.ConnectionParam;
import io.xconn.connector.param.StoredProcedureParam;

public abstract class StoredProcedureBase 
{
	
	public abstract Collection<StoredProcedureParam> getStoredProcedureParams();

	public abstract String getStoredProcedureName();
	
	public void exec(String dbConnUrl, String userName, String password)
	{
		ConnectionParam connParam = new ConnectionParam(dbConnUrl, userName, password);
		//ConnectionMgr.
		
	}

}
