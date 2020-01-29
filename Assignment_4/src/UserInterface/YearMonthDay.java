/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

/**
 *
 * @author mac
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

 
public class YearMonthDay implements ItemListener{
	private Calendar a;
        private int STARTYEAR;
	private int ENDYEAR;
	private JComboBox cboYear;
	private JComboBox cboMonth;
	private JComboBox cboDay;
        
        
	/**
	 * 
	 * @param cboYear
	 * @param cboMonth
	 * @param cboDay
	 */
	public YearMonthDay(JComboBox cboYear, JComboBox cboMonth, JComboBox cboDay) {
		this.cboYear = cboYear;
		this.cboMonth = cboMonth;
		this.cboDay = cboDay;
                a = Calendar.getInstance();
                STARTYEAR = a.get(Calendar.YEAR);
                ENDYEAR = STARTYEAR + 1;
	}
	/**
	 * 
	 */
	public void AddInfo() {
		 //year comboBox
                 cboYear.removeAllItems();
                 cboMonth.removeAllItems();
                 cboDay.removeAllItems();
		 for (int i = STARTYEAR; i <= ENDYEAR; i++) {
			 cboYear.addItem("" + i);
		 }
		 //month ComboBox
                 
		 for (int i = a.get(Calendar.MONTH); i < 12; i++) {
			 cboMonth.addItem("" + (i + 1));
		 }
		 //day combobox
		 for (int j = a.get(Calendar.DATE); j < 32; j++) {
			 cboDay.addItem("" + j);
		 }
                 
                 cboYear.setSelectedItem(String.valueOf(STARTYEAR));
                 cboMonth.setSelectedItem(String.valueOf(a.get(Calendar.MONTH)+1));
                 cboDay.setSelectedItem(String.valueOf(a.get(Calendar.DATE)));
	}
	/**
	 * month listener
	 * @author Vecrates
     * @param e
	 *
	 */
        
	@Override
	public void itemStateChanged(ItemEvent e) {
 
            Object obj = cboMonth.getSelectedItem();
		  
            if (obj != null) { 
                cboDay.removeAllItems();
		   
                int month = Integer.valueOf(obj.toString());
                int days = 31;
                int year = Integer.parseInt(cboYear.getSelectedItem().toString());
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    days = 30;
                } 
                else if (month == 2) {
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                        days = 29;
                    } 
                    else {	  
                        days = 28;
                    }
                }
                if (month == a.get(Calendar.MONTH)+1 && year == STARTYEAR) {
                    for (int j = a.get(Calendar.DATE); j <= days; j++)
                        cboDay.addItem("" + j);
                }
                  
                for (int j = 0; j < days; j++) {
                    cboDay.addItem("" + (j + 1));
                }
            }
	}
		
}

