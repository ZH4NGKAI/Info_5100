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
public class AirlinerDirectory {
    private List<Airliner> airlinerList;

    public AirlinerDirectory() {
        airlinerList = new ArrayList<>();
        
    }

    public List<Airliner> getList() {
        return airlinerList;
    }
    
    public boolean addAirliner(Airliner airliner) {
        for (Airliner a: airlinerList) {
            if (a.compareTo(airliner) == 0)
                return false;
        }
        airlinerList.add(airliner);
        return true;
    } 

    public boolean updateAirliner(Airliner airliner, String name) {
        for (Airliner a: airlinerList) {
            if (a.getName().equals(name) && a != airliner)
                return false;
        }
        airliner.setName(name);
        return true;
    }
    
    public void deleteAirliner(Airliner a) {
        airlinerList.remove(a);
    }
    
}
