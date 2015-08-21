package dangokc.com;

public class Biker implements RaceParticipant {
    private int _racerId;
    
    public Biker() {
        //do nothing;
    }

    public Biker(int _racerId) {
        this._racerId = _racerId;
    }
    
    public void setRacerId(int racerId){
        _racerId = racerId;
    }
    
    public int getRacerId() {
        return _racerId;        
    }
    
    public String performRaceActivity() {
        return "Biking...";
    }
    
    public String toString() {
        return String.format("%s\tRacerID: %d\tActivity: %s\n"
                                , getClass()
                                , getRacerId()
                                , performRaceActivity()
                            );
    }
}
