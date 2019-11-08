import java.util.Scanner;

public class Main
{
    public static int truckCapacity;
    public static int containerCapacity;
    public static int boxCnt;
    public static int containerCnt;
    public static int truckCnt;
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 6843;
        System.out.println("Входное число " +   container.count);

        sumDigits(container.count);

        System.out.println("Минимум Byte " + Byte.MIN_VALUE);
        System.out.println("Максимум Byte " + Byte.MAX_VALUE);
        System.out.println("Минимум Short " + Short.MIN_VALUE);
        System.out.println("Максимум Short " + Short.MAX_VALUE);
        System.out.println("Минимум Long " + Long.MIN_VALUE);
        System.out.println("Максимум Long " + Long.MAX_VALUE);
        System.out.println("Минимум Float " + Float.MIN_VALUE);
        System.out.println("Максимум Float " + Float.MAX_VALUE);
        System.out.println("Минимум Double " + Double.MIN_VALUE);
        System.out.println("Максимум Double " + Double.MAX_VALUE);
        System.out.println("//////////////////////////////////////////////");
        System.out.println("Задайте вместимость грузовика: ");
        Scanner in1 = new Scanner(System.in);
        truckCapacity = in1.nextInt();
        System.out.println("Задайте вместимость контейнера: ");
        Scanner in2 = new Scanner(System.in);
        containerCapacity = in2.nextInt();
        System.out.println("Введите необходимое количество ящиков: ");
        Scanner in3 = new Scanner(System.in);
        boxCnt = in3.nextInt();

        System.out.println(getContCount(boxCnt));
        System.out.println(getTruckCount(getContCount(boxCnt)));
        int c = 1;  // containers
        int t = 1;  //trucks
        int i = 1; //boxes
        int b = 1; //box_counter
        for (t = 1; t <= getTruckCount(getContCount(boxCnt)) ; t++ )
        {
            System.out.println("Грузовик " + t);
               for (c = 1; c <= getContCount(boxCnt); c++)
               {
                   System.out.println("  Контейнер " + c);
                    for ( i = b; i <= boxCnt; i++)
                    {
                        System.out.println("        Ящик " + b);
                        b++;
                        if (i % containerCapacity == 0) break;
                    }
                   if (c % truckCapacity == 0) break;
               }
        }



    }

    public  static Integer sumDigits(Integer number)
    {

        Integer outNumber = 0;

        for (int i = 0; i < number.toString().length();i++)
        {
            Character y = number.toString().charAt(i);
            outNumber += Integer.parseInt(y.toString());
        }
        System.out.println("Сумма "+ outNumber);

        return outNumber;

    }

    public static int getContCount(int boxCnt)
    {
        if (boxCnt % containerCapacity > 0)
        { containerCnt = (boxCnt / containerCapacity) + 1; }
                   else {containerCnt = boxCnt / containerCapacity; }
        return containerCnt;
    }
    public static int getTruckCount(int containerCnt)
    {
        if (containerCnt % truckCapacity > 0)
        { truckCnt = (containerCnt / truckCapacity) + 1; }
                   else {truckCnt = (containerCnt / truckCapacity); }
        return truckCnt;
    }

    }

