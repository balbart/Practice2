public class Ball {
    public int diameter;
    public String color;
    public String type;

    @Override
    public String toString() {
        return "Ball" +
                "\ndiameter= " + diameter +
                "\ncolor= " + color +
                "\ntype= " + type+ '\n';
    }
}
