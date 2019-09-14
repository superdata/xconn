package io.xconn.connector.param;

import java.sql.Types;

import io.xconn.connector.constant.ParamDirection;
import lombok.Data;

@Data
public class StoredProcedureParam<T> 
{
	private String name;
	private Types type;
	private T value;
	private ParamDirection direction;
}
