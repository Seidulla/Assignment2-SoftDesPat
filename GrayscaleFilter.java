public class GrayscaleFilter implements Operation {
    @Override
    public void applyFilter(String image) {
        System.out.println("It is Grayscale filter " + image);
    }

    @Override
    public String getName() {
        return "Grayscale";
    }
}
