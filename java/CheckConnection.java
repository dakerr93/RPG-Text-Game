import rpg.game.*;
import java.sql.*;

public class CheckConnection {
	public static void main(String[] args) {
		try {
			RpgPlayerDAO r = new RpgPlayerDAO();
			RpgPlayer p = new RpgPlayer ("CaptainMuscles", "Gary", "Bryant", "Basketball",2 );
			r.createPlayer(p); 
			System.out.println ("Test Connection");
		} catch (SQLException myException) {
			myException.printStackTrace();

		}

	}
}
