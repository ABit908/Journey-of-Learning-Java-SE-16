
package OOPs;
public class InheritenceBox extends Box {
    double weight;
    public InheritenceBox()
    {

        this.weight=-1;

    }

    public InheritenceBox(double weight) {
        this.weight = weight;
    }

    public InheritenceBox(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public InheritenceBox(double l, double h, double w, double weight) {
        super(l, h, w);// call the parent class constructor
                      // used to initialise values present in parent class

        this.weight = weight;
    }

    public InheritenceBox(Box old, double weight) {
        super(old);
        this.weight = weight;
    }
}






