/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

import java.sql.SQLException;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author Tubagus Alta
 */
public class App {
    
    public String getSelectedButtonText(ButtonGroup buttonGroup){
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();){
            AbstractButton button = buttons.nextElement();
            
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
    
    public static void main(String[] args) throws SQLException {
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
    }
}
