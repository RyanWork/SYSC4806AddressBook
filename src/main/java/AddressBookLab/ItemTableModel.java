package AddressBookLab;

import AddressBookLab.Model.BuddyInfo;

import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ItemTableModel extends AbstractTableModel {
    List itemList;
    int columnCount;

    public ItemTableModel(int columnCount){
        this.columnCount = columnCount;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public String getColumnName(int column) {
        return column == 0 ? "Name" : "Phone Number";
    }

    public void setItemList(List itemList) {
        this.itemList = itemList;
    }

    public int getRowCount() {
        return itemList.size();
    }

    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        BuddyInfo b = (BuddyInfo)itemList.get(rowIndex);
        if(columnIndex == 0)
            b.setName(value.toString());
        else
            b.setPhoneNumber(value.toString());
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        // Get the buddy info
        BuddyInfo b = (BuddyInfo)this.itemList.get(rowIndex);
        return columnIndex == 0 ? b.getName() : b.getPhoneNumber();
    }
}