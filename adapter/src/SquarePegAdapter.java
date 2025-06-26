public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(peg.getWidth() * Math.sqrt(2) / 2);
        this.peg = peg;
    }

    public double getRadius(SquarePeg peg) {
        // Calculate the radius of the smallest circle that can fit the square peg
        return (double) (peg.getWidth() * Math.sqrt(2) / 2);
    }

}