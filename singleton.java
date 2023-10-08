public class singleton {
    private static singleton single;

    private singleton() {}

    public static singleton getInstance() {
        if (single == null) {
            single = new singleton();
        }
        return single;
    }

    private Operation filterStrategy;

    public void setFilterStrategy(Operation filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void processImage(String image) {
        System.out.println("Selected filter: " + filterStrategy.getName());
        filterStrategy.applyFilter(image);
    }
}
