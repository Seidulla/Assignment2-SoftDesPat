public class RedEye implements Operation {
    private Operation decoratedFilter;

    public RedEye(Operation decoratedFilter) {
        this.decoratedFilter = decoratedFilter;
    }

    @Override
    public void applyFilter(String image) {
        decoratedFilter.applyFilter(image);
        System.out.println("Adding RedEye to your image" + image);
    }

    @Override
    public String getName() {
        return decoratedFilter.getName() + " with this filter";
    }
}
