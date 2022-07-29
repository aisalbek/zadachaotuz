import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          /*      Scanner scanner = new Scanner(System.in);
             Random random = new Random();
        int[]masiv = new int[20];
        int sk = scanner.nextInt();
        for (int i = 0; i <masiv.length ; i++) {
            masiv[i]= random.nextInt(1,99);
        if (masiv[0]%sk==0){
            System.out.println("masivtin birichi sanyna bolunot>"+masiv[i]);
        }else {
            System.out.println("bul san bolunboit>"+sk);

          } System.out.println(Arrays.toString(masiv));
    }*/
        //  2 . Напишите класс, который генерирует 20 рандомных целых чисел
        //   из диапазона -50 до +50, и определяет наименьшее число и
        //   наибольшее число.
        //   -Нельзя использовать массив

    /*    Random random = new Random();
        int min =0; int max =0;
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(-50, 50);
            System.out.print(i+".("+r+") ");
            if (min>r){
                min=r;
   }
            if (max<r){
                max=r;

  }
  }
                System.out.println();
                System.out.println("min sifra : "+min);
                System.out.println("max sifra : "+max);*/


        //  3. Напишите класс, который принимает с консоли для переменной X
        //  целое положительное число, а затем дополнительно будет
        //  спрашивать ещё числа, эти числа будут должны вычитаться из
        //  переменной x, вы будете вводить числа до тех пор пока X не будет
        //  отрицательным или равен 0.
        //           -используйте while loop

       /*   Scanner scanner = new Scanner(System.in);
            System.out.print("x sady jazynyz : ");
        int x = scanner.nextInt();
        int counter = 0;
        while( x>0 ){
            System.out.print("x-san: ");
        int k = scanner.nextInt();
            x-=k;
            System.out.println("Азыр x = " +x);
            counter++;
        }
            System.out.println("kancha san jazdynaz?= "+ counter);
*/

        // 4. Напишите класс, который принимает с клавиатуры две
        //  переменный это два числа, пока не будет введено две одинаковых
        //  чисел.
        // Класс должен выводить на экран сумму всех первых чисел и сумму
        //  всех вторых чисел (не считая чисел, введенных одинаковыми)

      /*  Scanner scanner = new Scanner(System.in);
        int a = 0, b = 1, sum1 = 0, sum2 = 0;
        for( ; a!=b ; ){
            System.out.print("birinchi sandy jazynyz: ");
            a = scanner.nextInt();
            System.out.print("ekinchi sandy jazynyz: ");
            b = scanner.nextInt();
            sum1+=a;
            sum2+=b;
        }
        System.out.println("suma birinch top = "+ sum1 );
        System.out.println("suma ekinchi top = "+ sum2 )*/
        ;


     /*   5. Напишите класс, который принимает с клавиатуры целое число
        любой длины и выводит на экран:
● в первой строке - все четные цифры этого числа, через пробел
● во второй строке - все нечетные цифры этого числа, через
        пробел
        Например, для числа 765873 в первой строке будет выведены числа
        6 8, а во второй строке 7 5 7 3
                -Нельзя использовать массив*/
     /*    int a, b, v, g, d, e, j, z, k, l;
        Scanner scanner = new Scanner(System.in);
        int sk = scanner.nextInt();

        d = sk % 10000;//3san
        a = sk % 100000;//2 chi san
        b = sk % 10;// 6
        v = sk % 100;//5san
        g = sk % 1000;//4san
        e = (sk - a) / 100000;//1
        z = (a - d) / 10000;//2
        j = (d - g) / 1000;//3
        k = (g - v) / 100;//4
        l = (v - b) / 10;//5
        int[] masiv = {e, z, j, k, l, b};
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] % 2 == 0) {
                System.out.print(masiv[i] + "  ");
            }
        }
            for (int i = 0; i < masiv.length; i++) {
                if (masiv[i] % 2 == 1) {
                    System.out.print("  ");
                    System.out.print(masiv[i] + "  ");

            }
        }*/


            /*    if (e%2==0) {
                System.out.print("jup > " + e);//1
              } else if (e % 2 == 1)
                System.out.print("tak : " + e);//1
                if (z % 2 == 0) {
                    System.out.print("jup > " + z);//2
                }  else if (z % 2 == 1)
                    System.out.print("tak : " + z);//2
                if (j % 2 == 0) {
                    System.out.print("jup > " + j);//3
                }  else if (j % 2 == 1)
                    System.out.print("tak : " + j);//3
                if (k % 2 == 0) {
                    System.out.print("jup > " + k);//4
                }    else if (k % 2 == 1)
                    System.out.print("tak :  " + k);//4
                if (l % 2 == 0) {
                    System.out.print(" jup >" + l);//5
                } else if (l % 2 == 1)
                    System.out.print("tak : " + l);//5
                if (b % 2 == 0) {
                    System.out.print("jup : " + b);//6
                }  else if (b % 2 == 1)
                    System.out.println("tak: "+b);
*/

   /*
        6. Напишите класс, который принимает с клавиатуры целое
        положительное число любой длины, а затем выводит его первую
        цифру.
                Например, для числа 7659 на экран будет выведено 7.*/
      /*  Scanner scanner = new Scanner(System.in);
        int sk = scanner.nextInt();
        while (sk>10) {
        sk = sk/10;
       } System.out.println(sk);*/



      /*  7. Напишите класс, который принимает с клавиатуры целое число
        любой длины и строит из него число с обратным порядком цифр.
                Новое значение следует вывести в консоль.*/



    /*    8. На спектакль в кассу театра было выделено определенное
        количество билетов, и продажа осуществлялась до тех пор, пока не
        были проданы все билеты.
        Напишите класс, который сначала принимает с клавиатуры
        количество билетов, переданных в кассу. Затем класс принимает с
        клавиатуры серию чисел, каждое из которых указывает на число
        билетов, которое желает приобрести покупатель.
                Если нет возможности продать очередному покупателю требуемое
        им число билетов, принимается заказ от следующего покупателя.*/

     /*9. Напишите класс, который заполняет случайными
        четырехзначными числами массив, размер которого вводится с
        клавиатуры.
                После заполнения класс должен вывести на экран значения
        массива в одной строке, начиная с конца массива ( с последнего
                индекса)*/
      /*      Scanner scanneer = new Scanner(System .in);
            Random random =new Random();
        int sk = scanneer.nextInt();
        int[] masiv =new int[sk];
        for (int i = 0; i <masiv.length ; i++) {
            masiv[i]=random.nextInt(10000); }
            System.out.println(Arrays.toString(masiv));
        for (int j = 0; j <sk ;) {
             sk--;
             System.out.print(masiv[sk]+", ");


        }*/
      /*  Scanner scanneer = new Scanner(System.in);
        Random random = new Random();
        int sk = scanneer.nextInt();
        int[] masiv = new int[sk];
        int palavina = sk / 2;
        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(masiv));
        for (int j = 0; palavina < sk; ) {
            sk--;
            System.out.print(masiv[sk] + ", ");
        }
        System.out.println(" ");
        for (int i = 0; i < palavina; ) {
            palavina--;
            System.out.print(masiv[palavina]+", ");
        }
        */
  /*      Scanner scanner =new Scanner(System.in);
        Random random =new Random();
        int sk = scanner.nextInt();
        int[]masiv=new int[sk];
        for (int i = 0; i <masiv.length ; i++) {
            masiv[i]= random.nextInt(100);
        } System.out.println(Arrays.toString(masiv));
        System.out.println(" ");
        System.out.print("jup san:");
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i]%2==0){
                System.out.print(" "+masiv[i]+" ");
            }
        }
        System.out.println(" ");
        System.out.print("tak san:");
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i]%2==1);
            System.out.print(" "+masiv[i]+" ");
        }
*/

    /*    metot(2, 231, 31, 31, 3, 1, 1, 23, 31);
    }
    public static void metot(int... varars) {
        int sum =0;
        for (int i = 0; i < varars.length; i++) {
            sum +=varars[i];
        }
        System.out.println(Arrays.toString(varars));
        System.out.print("jalpy suma:"+sum);
        */

        metot("aisal", "neim1", "neim2");
    }

    public static void metot(String... varargs) {
        for (String a : varargs) {
            System.out.println("i love you>"+a+".");
        }
    }
}

