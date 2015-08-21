package dangokc.com;

public abstract class Athlete implements RaceParticipant, Person {
    private int _racerId;
    private String _name;
    private int _age;
    
    public Athlete() {
        //do nothing;
    }

    public Athlete(int racerId, String name, int age) {
        this._racerId = racerId;
        this._name = name;
        this._age = age;
    }
    
    //From RaceParticipant interface
    public void setRacerId(int racerId){
        _racerId = racerId;
    }
    
    public int getRacerId() {
        return _racerId;        
    }
    
    //From Person interface
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public int getAge() {
        return _age;
    }

    public void setAge(int age) {
        this._age = age;
    }
    
    /*
    abstract keyword will enforce subclass implements this method
    since this method is not common among classes
    */
    public abstract String performRaceActivity();
    
    public String toString() {
        return String.format("%s\tRacerID: %d - %s - %d\n"
                                , getClass()
                                , getRacerId()
                                , getName()
                                , getAge()
                            );
    }
}
