import java.util.List;

class PythagoreanTriplet {
    private int a;
    private int b;
    private int c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    static TripletListBuilder makeTripletsList() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    static class TripletListBuilder {

        TripletListBuilder thatSumTo(int sum) {
            throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        }

        List<PythagoreanTriplet> build() {
            throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        }

    }

}