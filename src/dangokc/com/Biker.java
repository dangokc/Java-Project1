package dangokc.com;

public class Biker extends Athlete {
    
    private boolean _usesClips;
        
    public Biker() {
        //do nothing;
    }

    public Biker(int racerId, String name, int age, boolean usesClips) {
        super(racerId, name, age);
        _usesClips = usesClips;
    }    

    public boolean isUsesClips() {
        return _usesClips;
    }

    public void setUsesClips(boolean _usesClips) {
        this._usesClips = _usesClips;
    }
            
    public String performRaceActivity() {
        return "Biking...";
    }
    
    public String toString() {
        return String.format("%s Biking with Clips: %b - Activity: %s\n"
                                , super.toString()
                                , isUsesClips()
                                , performRaceActivity()
                            );
    }
}
