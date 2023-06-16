package in.tnsif.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import in.tnsif.entities.Student;

public interface StudentRepo {
	
	Statement makingStatement();
	PreparedStatement createPrepareStatement(String query);
	public int addQuery(String query,Student student);
	public int updateQuery(String query,Student student);
	public int deleteQuery(String query);
	public ResultSet retriveQuery(String query);

}
