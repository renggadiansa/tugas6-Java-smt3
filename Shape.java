public class Shape {
    private int length;
    private int width;
    private int height;
    private int volume;

    public Shape(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = calculateVolume();
    }

    public int calculateVolume() {
        return length * width * height;
    }

    public int compareTo(Shape shape) {
        return this.volume - shape.volume;
    }

    public void cetak() {
        System.out.println("PanjangxLebarxTinggi = " + length
                + "x" + width
                + "x" + height
                + "\n" + "Volume " + volume);
    }
}
