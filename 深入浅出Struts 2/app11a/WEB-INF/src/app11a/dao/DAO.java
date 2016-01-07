package app11a.dao;

import java.sql.Connection;

public interface DAO {
	public Connection getConnection() throws DAOException;  
}
