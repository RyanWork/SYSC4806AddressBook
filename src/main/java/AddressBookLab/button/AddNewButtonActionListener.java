package AddressBookLab.button;

import AddressBookLab.Model.BuddyInfo;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddNewButtonActionListener extends ListTableActionListener {
    public void actionPerformed(ActionEvent e) {
        String name = JOptionPane.showInputDialog(null, "What is the name?", null);
        String phone = JOptionPane.showInputDialog(null, "What is the phone number?", null);
        list.add(new BuddyInfo(name, phone));

        table.revalidate();
    }
}