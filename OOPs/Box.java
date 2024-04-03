package OOPs;

public class Box {
    double l;
    double h;
    double w;

    public Box() {
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    // cube Box
    Box(double side) {
        this.h = side;
        this.l=side;
        this.w=side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
   Box(Box old)
    {
        this.h=old.h;
        this.w=old.w;
        this.l=old.l;
    }
    public void information()
    {
        System.out.println("Running the box");
    }
}
