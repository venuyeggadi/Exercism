import java.util.*;

class PythagoreanTriplet {
    List<Integer> triplet = null;
    private int N;

    public PythagoreanTriplet() {
    }

    public PythagoreanTriplet(int a, int b, int c) {
        triplet = Arrays.asList(a, b, c);
    }

    public static PythagoreanTriplet makeTripletsList() {
        return new PythagoreanTriplet();
    }

    public PythagoreanTriplet withFactorsLessThanOrEqualTo(int N) {
        this.N = N;
        return this;
    }

    public PythagoreanTriplet thatSumTo(int N) {
        return this;
    }

    public List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> list = new ArrayList<>();
        int numberOfTriplets = 0;
        for(int a = 1; a < N/2; a++) {
            for(int b = 1; b < N/2; b++) {
                int c = N - a - b;
                if(a*a + b*b == c*c && a < b && b < c) {
                    list.add(new PythagoreanTriplet(a, b, c));
                    numberOfTriplets++;
                }
            }
        }

        List<PythagoreanTriplet> listOfTriplets = new ArrayList<>();
        if(numberOfTriplets == 1)
            listOfTriplets = Collections.singletonList(list.get(0));
        else
            listOfTriplets = Arrays.asList(list.toArray(new PythagoreanTriplet[0]));

        return listOfTriplets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return triplet.equals(that.triplet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triplet);
    }

    @Override
    public String toString() {
        return String.valueOf(triplet);
    }

}