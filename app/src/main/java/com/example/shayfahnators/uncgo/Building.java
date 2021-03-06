package com.example.shayfahnators.uncgo;

/**
 * Created by Adam on 6/3/2015.
 */
public class Building {
    /** the geographic center of the building; used to determine which entrance the user is closest to*/
    private latLong geoCenter;
    public String buildingName;
    public String preCode;

    /**the main north entrance*/
    private latLong northEntrance;
    /**the main east entrance*/
    private latLong eastEntrance;
    /**the main west entrance*/
    private latLong westEntrance;
    /**the main south entrance*/
    private latLong southEntrance;

    /**basic constructor. Note that something must be passed to all entrance locations. If a building does not have one or more of these entrances, null should be passed instead.
     *
     * @param Center the geographical center of the building. Used in conjunction with the user's current location to determine the closest entrance.
     * @param north the coordinates of the most heavily trafficked entrance on the north face of the building
     * @param east
     * @param west
     * @param south
     */
    public Building(String fullName, String buildingAbbreviation, latLong Center, latLong north, latLong east, latLong west, latLong south)
    {
        geoCenter=Center;
        northEntrance=north;
        eastEntrance=east;
        westEntrance=west;
        southEntrance=south;
    }

    public latLong bestEntrance(latLong currentLocation)
    {
        boolean toTheNorth=false;
        if(geoCenter.getLat()<currentLocation.getLat())
        {
            toTheNorth=true;
        }
        boolean toTheEast=false;
        if(geoCenter.getLon()<currentLocation.getLon())
        {
            toTheEast=true;
        }
        latLong bestFit;
        boolean closerByLongitude;
        double longdiff=(currentLocation.getLon()-geoCenter.getLon())/2;
        double latdiff=currentLocation.getLat()-geoCenter.getLat();
        boolean entranceValid=false;
        latLong ToReturn=null;
        if(longdiff>latdiff)
        {
            if(toTheEast){
                if(eastEntrance!=null)
                {
                    ToReturn= eastEntrance;
                    entranceValid=true;
                }
            }else{
                if(westEntrance!=null)
                {
                    ToReturn = westEntrance;
                    entranceValid = true;
                }
            }
            if (!entranceValid)
            {
                if(this.geoCenter.getLon()-currentLocation.getLon()>0 && southEntrance!=null){
                    ToReturn =southEntrance;
                }else{
                    ToReturn =northEntrance;
                }
            }
        }else{
            if(toTheNorth){
                if(northEntrance!=null) {
                    ToReturn= northEntrance;
                    entranceValid = true;
                }
            }else{
                if(southEntrance!=null) {
                    ToReturn=southEntrance;
                    entranceValid = true;
                }
            }
            if(!entranceValid)
            {
                if(this.geoCenter.getLat()-currentLocation.getLat()>0&&eastEntrance!=null)
                {
                    return eastEntrance;
                }else{
                    return westEntrance;
                }
            }
        }
        return ToReturn;
    }
}
