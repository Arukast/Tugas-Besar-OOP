/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aplikasiperpustakaan;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Tubagus Alta
 */
public interface DataManajemen {
    public int createData() throws SQLException;
    public List<Object[]> readData() throws SQLException;
    public boolean updateData() throws SQLException;
    public boolean deleteData() throws SQLException;
}
