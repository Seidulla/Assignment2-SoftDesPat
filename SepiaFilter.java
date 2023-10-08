public class SepiaFilter implements Operation {
    @Override
    public void applyFilter(String image) {
        System.out.println("It is Sepia filter: " + image);
    }

    @Override
    public String getName() {
        return "Sepia";
    }
}
