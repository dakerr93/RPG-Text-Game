import java.sql.*;


import rpg.game.ConnectionUtility;
import rpg.game.RpgPlayer;

public class RpgPlayerDAO {
	public void createPlayer(RpgPlayer p) throws SQLException {
		Connection conn = ConnectionUtility.getConnection();
		System.out.println("Test Connection");
		
		
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO rpg_TEXTGAME.user_info (user_screenname, user_first, user_last, user_type, user_password) "
				+ "VALUES(?,?,?,?,?)");
		ps.setString(1, p.getUser_screenname());
		ps.setString(2, p.getUser_first());
		ps.setString(3, p.getUser_last());
		ps.setInt(4, 2);
		ps.setString(5, p.getUser_password());
		
		ps.executeUpdate();

		
		
	}

}
