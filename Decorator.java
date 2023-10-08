public class Decorator {
    public static void main(String[] args) {
        singleton processor = singleton.getInstance();

        Operation base = new GrayscaleOperation();
        Operation redEye = new RedEye(base);
        Operation contrast = new Contrast(base);

        processor.setFilterStrategy(base);
        processor.processImage("grayscaleIMG.jpg");

        processor.setFilterStrategy(redEyeFilter);
        processor.processImage("redeyeIMG.jpg");

    }
}
