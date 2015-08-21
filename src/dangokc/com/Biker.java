package dangokc.com;

public class Biker implements RaceParticipant {
    private int _racerId;
    private String _name;
    private int _age;
    
    public Biker() {
        //do nothing;
    }

    public Biker(int racerId, String name, int age) {
        this._racerId = racerId;
        this._name = name;
        this._age = age;
    }
    
    public void setRacerId(int racerId){
        _racerId = racerId;
    }
    
    public int getRacerId() {
        return _racerId;        
    }
    
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
    
    public String performRaceActivity() {
        return "Biking...";
    }
    
    public String toString() {
        return String.format("%s\tRacerID: %d - %s - %d - Activity: %s\n"
                                , getClass()
                                , getRacerId()
                                , getName()
                                , getAge()
                                , performRaceActivity()
                            );
    }
}
