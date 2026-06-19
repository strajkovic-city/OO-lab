public class Color {

    private String name;
    private int red;
    private int green;
    private int blue;

    // Constructor
    public Color(String name, int red, int blue, int green) {
        this.name = name;
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRed(int red) {
        if (red >= 0 && red <= 255) {
            this.red = red;
        }
    }

    public void setGreen(int green) {
        if (green >= 0 && green <= 255) {
            this.green = green;
        }
    }

    public void setBlue(int blue) {
        if (blue >= 0 && blue <= 255){
            this.blue = blue;
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    @Override
    public String toString() {
        return "Color [name=" + name + ", red =" + red + ", green =" + green + ", blue =" + blue + "]";
    }
}