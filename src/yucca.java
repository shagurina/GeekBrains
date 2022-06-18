public class yucca {

    public static void main(String[] args) {

        hundred();

    }


    public static void hundred() {
        float[] arrayFloat = new float[100];
        System.out.print("Числа, которые делятся на 7 с остатком 2: ");
        int result = 0;

        for (int i = 0; i < arrayFloat.length; i++) {
            arrayFloat[i] = (i + 1) / 7f;
            // arrayFloat[i] = (int) (((i + 1)/7f % 1)*10);
            //  System.out.print(arrayFloat[i] + " | ");
            // if ((int) (((i + 1)/7f % 1)*10) == 2)
            if ((int) (((i + 1) / 7f % 1) * 10) == 2)

            { result = result+1;


             System.out.print((i + 1) + ":" + arrayFloat[i] + " | ");
            }

        }



        int[] array4 = new int[result];

        for (int j = 0; j < array4.length; j++) {
            arrayFloat[j] = (j + 1) / 7f;
            // arrayFloat[i] = (int) (((i + 1)/7f % 1)*10);
            //  System.out.print(arrayFloat[i] + " | ");
            // if ((int) (((i + 1)/7f % 1)*10) == 2)
            if ((int) (((j + 1) / 7f % 1) * 10) == 2)

            {
                System.out.print((j + 1) + ":" + arrayFloat[j] + " | ");
            }

        }



        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Количество чисел, которые делятся на 7 с остатком 2: " + result);




    }
}


          //  System.out.print(arrayFloat[i] + " | ");
//            for (int j = 0; j < arrayFloat.length; j++) {
//                int[] arrayInt = new int[];
//                arrayInt[j] = int(arrayFloat[i]);
//            }
//            String [] arrStr = new String[100];
//            for (int j = 0; j < arrayFloat.length; j++) {
//                arrStr[j] = Float.toString(arrayFloat[i]);
//







