package Test;
import java.sql.*;
public  class InsertProductDAO {
public int k = 0;
public int insert (Productbean pb) {
	try {
		Connection con = DBConnection.getCon();
	PreparedStatement p1 = con.prepareStatement("insert into product50 values(?,?,?,?)")	;
	p1.setString(1, pb.getPcode());
	p1.setString(2, pb.getName());
	p1.setFloat(3, pb.getPrice());
	p1.setInt(4, pb.getQty());
	k= p1.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return k;
}
}
