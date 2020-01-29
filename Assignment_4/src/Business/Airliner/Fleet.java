/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class Fleet {
    private List<Airplane> fleet;

    public Fleet() {
        fleet = new ArrayList<>();
    }

    public List<Airplane> getList() {
        return fleet;
    }

    public boolean addAirplane(Airplane airplane) {
        for (Airplane a: fleet) {
            if (airplane.compareTo(a) == 0)
                return false;
        }
        fleet.add(airplane);
        return true;
    }
    
    public void deleteAirplane(Airplane ap) {
        fleet.remove(ap);
    }

    public boolean updateAirplane(Airplane airplane, String iatacode) {
        for (Airplane a: fleet) {
            if (a.getAirplaneCode().equals(iatacode) && a != airplane)
                return false;
        }
        airplane.setAirplaneCode(iatacode);
        return true;
    }
    
}
