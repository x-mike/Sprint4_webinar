public class Triple<A, B, C> extends Pair<A, B> {

    public final C third;

    public Triple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

}


class CheckEncapsulationTriple {
    public static void main(String[] args) {
//        Triple<Integer, Long, String> triple = new Triple<>(42, 27L, "check");
//        triple.third = "check";
    }
}
