package dangokc.com;

public class Swimmer implements RaceParticipant {
    private int _racerId;
    
    public Swimmer() {
        //do nothing;
    }

    public Swimmer(int _racerId) {
        this._racerId = _racerId;
    }
    
    public void setRacerId(int racerId){
        _racerId = racerId;
    }
    
    public int getRacerId() {
        return _racerId;        
    }
    
    public String performRaceActivity() {
        return "Swimming...";
    }
    
    public String toString() {
        return String.format("%s\tRacerID: %d\tActivity: %s\n"
                                , getClass()
                                , getRacerId()
                                , performRaceActivity()
                            );
    }
}
