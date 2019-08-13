package io.xconn.connector.sqlserver.mgr;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import io.xconn.connector.constant.DBType;
import io.xconn.connector.param.ConnectionParam;

class ConnectionMgr 
{
	private static Map<String, HikariDataSource> dsCache = new HashMap<>();
	
	public Connection getConnection(DBType dbType, ConnectionParam connectionParam) throws SQLException
	{
		registerDsCache(dbType, connectionParam);
		return dsCache.get(connectionParam.toString()).getConnection();
	}
	
	private void registerDsCache(DBType dbType, ConnectionParam connectionParam)
	{
		String key = connectionParam.toString();
		if (!dsCache.containsKey(key))
		{
			HikariDataSource ds = createHikariDataSource(dbType, connectionParam);
			
			synchronized(ConnectionMgr.class)
			{
				if (!dsCache.containsKey(key))
				{
					dsCache.put(key, ds);
				}
			}
		}
	}
	
	private HikariDataSource createHikariDataSource(DBType dbType, ConnectionParam connectionParam)
	{
		HikariConfig config = new HikariConfig();
		config.setDataSourceClassName(dbType.getDataSourceClass());
		config.setJdbcUrl(connectionParam.getDbUrl());
		if (!StringUtils.isEmpty(connectionParam.getUserName()))
		{
			config.setUsername(connectionParam.getUserName());
			config.setPassword(connectionParam.getPassWord());
		}
	    HikariDataSource ds = new HikariDataSource(config);
	    
	    return ds;
	}
}
