package dangokc.com;

public class Swimmer extends Athlete {
    
    private boolean _asian;
    
    public Swimmer() {
        //do nothing;
    }

    public Swimmer(int racerId, String name, int age, boolean asian) {
        super(racerId, name, age);
        _asian = asian;
    }

    public boolean isAsian() {
        return _asian;
    }

    public void setAsian(boolean _asian) {
        this._asian = _asian;
    }
       
    public String performRaceActivity() {
        return "Swimming...";
    }
    
    public String toString() {
        return String.format("%s Is Asian: %b - Activity: %s\n"
                                , super.toString()
                                , isAsian()
                                , performRaceActivity()
                            );
    }
}
