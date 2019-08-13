package io.xconn.connector.param;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
@ToString(includeFieldNames=true)
public class ConnectionParam 
{
	private String dbUrl;
	private String userName;
	private String passWord;
}
