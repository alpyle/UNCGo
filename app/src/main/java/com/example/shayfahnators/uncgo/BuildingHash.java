package com.example.shayfahnators.uncgo;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by Sarah on 4/16/2015.
 */
public class BuildingHash {


    Map<String, latLong> map = new Hashtable<>();
    public BuildingHash(){


        map.put("Aycock Auditorium", new latLong(36.067061, -79.806030));
        map.put("Brown Building", new latLong(36.067812, -79.805881));
        map.put("Bryan School of Business & Economics", new latLong(36.066659, -79.811921));
        map.put("Carmichael Building", new latLong(36.067947, -79.806246));
        map.put("Curry Building", new latLong(36.06555692,-79.80855793));
        map.put("Dining Hall", new latLong(36.069483, -79.809300));
        map.put("Eberhart Building", new latLong(36.068560, -79.806530));
        map.put("Elliott University Center", new latLong(36.067487, -79.809804));
        map.put("Ferguson Building", new latLong(36.06564798,-79.80761915));
        map.put("Financial Aid Office", new latLong(36.064594, -79.812347));
        map.put("Forney Building", new latLong (36.067830, -79.808129));
        map.put("Foust Building", new latLong (36.06714399,-79.80791017));
        map.put("Gatewood Studio Arts Center", new latLong(36.06528807,-79.80683059));
        map.put("Gove Student Health Center", new latLong(36.071816, -79.809992));
        map.put("Graham Building", new latLong(36.06605125, -79.80671927));
        map.put("Jackson Library", new latLong(36.068321, -79.809438));
        map.put("Mary Channing Coleman Building", new latLong(36.069376, -79.813102));
        map.put("McIver Building", new latLong(36.067659, -79.807233));
        map.put("McIver St. Parking Deck", new latLong(36.071841, -79.807024));
        map.put("McNutt Building", new latLong(36.06496718,-79.80956107));
        map.put("Moore Building", new latLong(36.069504, -79.807152));
        map.put("Moore Humanities and Research Building", new latLong(36.06569134,-79.80948597));
        map.put("Mossman Building", new latLong(36.066634, -79.810725));
        map.put("Music Building", new latLong(36.072975, -79.807447));
        map.put("Oakland Ave. Parking Deck", new latLong(36.064905, -79.811063));
        map.put("Petty Science Building", new latLong(36.069290, -79.807710));
        map.put("School of Education", new latLong(36.066015, -79.812077));
        map.put("Sink Building", new latLong(36.06453788,-79.807823));
        map.put("Stone Building", new latLong(36.068542, -79.807630));
        map.put("Student Recreation Center", new latLong(36.069284, -79.814432));
        map.put("Sullivan Science Building", new latLong(36.069786, -79.806546));
        map.put("Taylor Theatre", new latLong(36.067401, -79.806165));
        map.put("Visitor Center", new latLong(36.065624, -79.813037));
        map.put("Walker Ave. Parking Deck", new latLong(36.067867, -79.812104));
        map.put("Weatherspoon Art Museum", new latLong(36.066260, -79.805854));
    }
    public latLong getBuildingCoords(String value)
    {
        return map.get(value);
    }
    public ArrayList<String> getKeys()
    {
        ArrayList<String> hi = new ArrayList<>();
        Set<String> temp;
        temp=map.keySet();
        for(int i=0;i<temp.size();i++)
        {
            hi.add(temp.toArray()[i].toString());
        }
        //hi=new ArrayList<String>(temp);


        return hi;
    }

}