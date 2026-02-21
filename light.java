// create a enum light with values red, yellow, green attach time duration to each light and write a function to the duration of green light and show light
public class light {
    public static void main(String[] args) {
    enum Signal {
        RED(60),
        YELLOW(30),
        GREEN(90);
        int time;
        Signal(int t) {
            this.time = t;
        }
        void showLight() {
            System.out.println(time);
        }
    }
        Signal l1 = Signal.GREEN;
        l1.showLight();
    }
}
