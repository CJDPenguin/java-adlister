import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database.", e);
        }
    }

    @Override
    public List<Ad> all() {
        try {
            Statement stmnt = connection.createStatement();
            ResultSet resultSet = stmnt.executeQuery("SELECT * FROM ads");
            List<Ad> ads = new ArrayList<>();
            while (resultSet.next()) {
                ads.add(new Ad(
                        resultSet.getLong("id"),
                        resultSet.getLong("user_id"),
                        resultSet.getString("title"),
                        resultSet.getString("description")
                ));
            }
            return ads;
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database.", e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmnt = connection.createStatement();
            String insert = "INSERT INTO ads (user_id, title, description) VALUES (" + ad.getUserId() + ", '" + ad.getTitle() + "', '" + ad.getDescription() + "');";
            stmnt.executeUpdate(insert, stmnt.RETURN_GENERATED_KEYS);
            ResultSet rs = stmnt.getGeneratedKeys();
            if( rs.next()) {
                return rs.getLong(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database.", e);
        }
        return null;
    }
}
