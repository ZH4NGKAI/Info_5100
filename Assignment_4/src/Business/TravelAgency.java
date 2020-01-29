/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Airliner.AirlinerDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class TravelAgency {
    private UserDirectory travelOfficeDirectory;
    private AirlinerDirectory airlinerDirectory;
//    private MasterTravelSchedule mts;
    
    public TravelAgency() {
        airlinerDirectory = new AirlinerDirectory();
//        mts = new MasterTravelSchedule(airlinerDirectory);
        travelOfficeDirectory = new UserDirectory();
    }

    
    public UserDirectory getTravelOfficeDirectory() {
        return travelOfficeDirectory;
    }

    
    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }
    
}
