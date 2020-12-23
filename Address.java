public
class Address {
    String street;
    String building;

    public
    Address () {
    }

    public
    Address (String building, String street ) {
        this.building = building;
        this.street = street;
         }

    public
    String getStreet () {
        return street;
    }

    public
    void setStreet ( String street ) {
        this.street = street;
    }

    public
    String getBuilding () {
        return building;
    }

    public
    void setBuilding ( String building ) {
        this.building = building;
    }

    public void show(){
        System.out.println ( "Address");
        System.out.println ( this.getBuilding ()+"-"+this.getStreet ());

    }
}
