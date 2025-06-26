public class Application {
    
    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println("Round peg fits: " + hole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
        // System.out.println("Round peg fits: " + hole.fits(smallSquarePeg));

        SquarePegAdapter smallSquarePegApapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegApapter = new SquarePegAdapter(largeSquarePeg);
        System.out.println("Square peg fits: " + hole.fits(smallSquarePegApapter));
        System.out.println("Square peg fits: " + hole.fits(largeSquarePegApapter));

    }
}
