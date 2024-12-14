/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aplikasiperpustakaan;

import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Tubagus Alta
 */
public interface DataManajemen {
    public boolean createData() throws SQLException;
    public void readData(String table) throws SQLException;
    public boolean updateData() throws SQLException;
    public boolean deleteData() throws SQLException;
}
