package Core.OOPSTopic.InterfaceTopic.Basics;

interface Filtering {
    void doFilter();
}

// old approach for filtering
class ClassicFiltering implements Filtering {
    String filteringMethod = "Classic";

    @Override
    public void doFilter() {
        System.out.println("Basic filtered movies");
    }
}

// new approach for filtering:
class MLFiltering implements Filtering {
    String filteringMethod = "Advanced";

    @Override
    public void doFilter() {
        System.out.println("Advanced ML Filtering");
    }
}

class MovieRecommender {
    // this class is dependent on filtering class that does the actual work
    // bad way -> tightly coupled concrete classes
    // One class shouldn't directly depend on another class
    //ClassicFiltering ftr = new ClassicFiltering();

    // I need to make a change now to new ML based
    // problems: 1. code needs to be changed for future changes 2. directly associated with each other.
    // MLFiltering mlftr = new MLFiltering();

    // Instead of creating objects ourself lets try to use a interface to decouple dependency
    // lets call and work with Interface
    Filtering filtering;

    // take output from other through constructor and set it for usage
    // we use constructor based object injection.
    MovieRecommender(Filtering _filtering) {
        this.filtering = _filtering;
    }

}

public class Application {
    static void main() {
        // creating the object of MovieRecommender
        MovieRecommender mvr = new MovieRecommender(new ClassicFiltering());
        // the above is done by spring automatically. Our task is to just mention what object to create and what it is dependent upon.
        //String value = mvr.mlftr.filteringMethod;
        //mvr.mlftr.doFilter();
    }
}
