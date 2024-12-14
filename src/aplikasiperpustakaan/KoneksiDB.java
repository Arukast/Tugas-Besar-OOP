/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Tubagus Alta
 */
public class KoneksiDB{
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/-NamaDatabase-";
    private final String USER = "root";
    private final String PASS = "";
    private Connection conn = null;

    public void bukaKoneksi() {
        boolean flag = false;
        try {
            Class.forName(JDBC_DRIVER);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            flag = true;
        }
        if (!flag) {
            try {
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
}
