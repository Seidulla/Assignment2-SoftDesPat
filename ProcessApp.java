public class ProcessApp {
    public static void main(String[] args) {
        singleton processor = singleton.getInstance();

        processor.setFilterStrategy(new GrayscaleFilter());
        processor.processImage("grayscaleIMG.jpg");

        processor.setFilterStrategy(new SepiaFilter());
        processor.processImage("sepiaIMG.jpg");
    }
}
