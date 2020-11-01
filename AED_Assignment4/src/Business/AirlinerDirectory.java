/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Charmi Dalal
 */
public class AirlinerDirectory {

    private ArrayList<Airliner> airlinerDir;

    public AirlinerDirectory() {
        airlinerDir = new ArrayList();
        fetchAirlinerList();
    }

    public ArrayList<Airliner> getAirlinerDir() {
        return airlinerDir;
    }

    public void addAirliner(Airliner a) {
        airlinerDir.add(a);
    }

    public void removeAirliner(Airliner a) {
        airlinerDir.remove(a);
    }

    public void setAirlinerDir(ArrayList<Airliner> airlinerDir) {
        this.airlinerDir = airlinerDir;
    }

    public void fetchAirlinerList() {
        String[][] airlinerList = {{"Air India", "AI563", "20", "India"},
        {"Luftanza Airways", "LA321", "90", "China"},
        {"Jet Airways", "JA566", "30", "India"},
        {"Qatar Airways", "QA3454", "50", "India"},
        {"Eitihad Airways", "EA445", "89", "China"},
        {"Jet Airways", "JA234", "36", "USA"},
        {"AirHaid Airways", "JA264", "39", "USA"},
        {"Delta Airways", "DT65", "78", "Japan"}
        };

        for (int i = 0; i < airlinerList.length; i++) {
            Airliner airliner = new Airliner();
            airliner.setAirlineName(airlinerList[i][0]);
            airliner.setAirlineCode(airlinerList[i][1]);
            airliner.setAirlineCount((int) Double.parseDouble(airlinerList[i][2]));
            airliner.setFromCountry(airlinerList[i][3]);
            airlinerDir.add(airliner);
        }
    }
}
