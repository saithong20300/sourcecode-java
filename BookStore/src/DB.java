import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB {
	void getData(String id) {

		String sql = "SELECT * FROM USER WHERE id = ?";

		try (Connection connection = DriverManager.getConnection("");
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			) {
				preparedStatement.setString(1, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
