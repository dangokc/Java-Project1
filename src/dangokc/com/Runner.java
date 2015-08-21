
package dangokc.com;

public class Runner extends Athlete {
    
    private String _shoeBrand;
    
    public Runner() {
        //do nothing;
    }

    public Runner(int racerId, String name, int age, String brand) {
        super(racerId, name, age);
        _shoeBrand = brand;
    }

    public String getShoeBrand() {
        return _shoeBrand;
    }

    public void setShoeBrand(String brand) {
        this._shoeBrand = brand;
    }
    
    public String performRaceActivity() {
        return "Running...";
    }
    
    public String toString() {
        return String.format("%s Shoe brand: %s - Activity: %s\n"
                                , super.toString()
                                , getShoeBrand()
                                , performRaceActivity()
                            );
    }
    
}
