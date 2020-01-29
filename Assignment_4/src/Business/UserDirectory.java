/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class UserDirectory {
    private List<TravelOffice> officeList;
//    private MasterTravelSchedule mts;
    public UserDirectory() {
        officeList = new ArrayList<TravelOffice>();
        TravelOffice to = new TravelOffice("151", "12qwQW#");
        to.setLocation("Boston");
        officeList.add(to);
//        this.mts = mts;
    }

    public List<TravelOffice> getTravelOfficeList() {
        return officeList;
    }

    public void setTravelOfficeList(List<TravelOffice> userDirectory) {
        this.officeList = userDirectory;
    }

    public boolean addTravelOffice(TravelOffice travelOffice) {
        for (TravelOffice to: officeList) {
            if (to.compareTo(travelOffice) == 0)
                return false;
        }
        officeList.add(travelOffice);
//        travelOffice.setMts(mts);
        return true;
    }
}
