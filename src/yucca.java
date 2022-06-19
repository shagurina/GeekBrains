public class yucca {

    public static void main(String[] args) {

        yucca7();

    }

    public static void yucca7() {
        float[] arrayFloat = new float[1000];
        System.out.print("Каждое второе число, которое делится на 7 с остатком 2: ");
        int result = 0;

        for (int i = 0; i < arrayFloat.length; i++) {
            arrayFloat[i] = (i + 1) / 7f;
           //if ((int) (((i + 1) / 7f % 1) * 10) == 2)  - вот тут я фильтрую числа, у которых после деления на 7 первая цифра после запятой 2 (внимательно читала задание, ага)
            if ((int) ((i + 1) / 7f )  == 2)
            { result = result+1;
                if  ( result % 2 == 0 ) {
                    System.out.print((i + 1) + ":" + arrayFloat[i] + " | ");
                }
            }
        }

        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Количество чисел, которые делятся на 7 с остатком 2: " + result);

    }
}









