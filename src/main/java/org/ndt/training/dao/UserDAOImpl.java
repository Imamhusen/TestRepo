package org.ndt.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;
//import java.util.List;

import org.ndt.training.beans.User;
import org.ndt.training.db.DBConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDAOImpl implements UserDAO {
	
	   @Autowired
		private DBConnectionManager dBManager;
	public boolean insert(User u)
	{
		String sql="insert into spring(name)values(?)";
		 Connection conn=dBManager.getConnection();
		int rowcount=0;
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, u.getName());
			
			
			rowcount=ps.executeUpdate();
			conn.close();
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
         return rowcount>0;

}

	@Override
	public List<User> getUserList() {
		
		String sql1="select * from spring";
		Connection conn=dBManager.getConnection();
        List<User> list1=new ArrayList<User>();
        try {
			PreparedStatement ps=conn.prepareStatement(sql1);
			ResultSet rs=ps.executeQuery();
			while(rs!=null && rs.next())
			{
				User item = new User(rs.getString(1));
				list1.add(item);
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list1;
	
	}
		}

		


		
		
	

	

	
	

