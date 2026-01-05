import java.sql.*;

public class demo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "password");

            String sql = "INSERT INTO student VALUES (1,'Anu',85)";
            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate(sql);

            if (result > 0)
                System.out.println("Record inserted successfully");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
