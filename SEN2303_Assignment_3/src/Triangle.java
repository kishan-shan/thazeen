public class Triangle implements Shape{


    @Override
    public void draw() {
        int height=5;
        for (int i = 1; i <=height ; i++) {
            for (int j = height; j >i ; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k <=i; k++) {
                System.out.print("* ");

            }
            System.out.println();


        }

    }
}
