public class StaticNew {
    public static void main(String[] args) {
        class Ball {
            int count;

            {
                count = 0;
            }

            String color = "none";

            public void boll(String color) {
                this.color = color;
                count++;
            }
        }
    }
}