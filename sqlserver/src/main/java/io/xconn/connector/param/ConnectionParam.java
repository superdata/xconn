package io.xconn.connector.param;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(includeFieldNames=true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ConnectionParam 
{
	private String dbUrl;
	private String userName;
	private String passWord;
}
