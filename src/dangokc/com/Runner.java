
package dangokc.com;

public class Runner implements RaceParticipant {
    
    private int _racerId;
    
    public Runner() {
        //do nothing;
    }

    public Runner(int _racerId) {
        this._racerId = _racerId;
    }
    
    public void setRacerId(int racerId){
        _racerId = racerId;
    }
    
    public int getRacerId() {
        return _racerId;        
    }
    
    public String performRaceActivity() {
        return "Running...";
    }
    
    public String toString() {
        return String.format("%s\tRacerID: %d\tActivity: %s\n"
                                , getClass()
                                , getRacerId()
                                , performRaceActivity()
                            );
    }
    
}
