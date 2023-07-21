public class array_2 {
    public static void main(String[] args) {
        // F --> C
        float temp[] = { 220, 225, 226, 224, 226, 228, 229, 214, 218, 310, 210, 215, 216, 214, 216, 218, 219, 214, 228,
                310 };
        for (int i = 0; i < temp.length; i++) {
            // value of 5/9
            float f = 0.5556f;
            temp[i] = f * (temp[i] - 32);
            // temp[i]=0.5556*(220-32)
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i] + " C");
        }
    }
}
