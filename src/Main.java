public class Main
{
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


    }

    public  static Integer sumDigits(Integer number)
    {
        Integer inNumber = number;
        Integer outNumber = 0;

        for (int i = 0; i < inNumber.toString().length();i++)
        {
            Character y = inNumber.toString().charAt(i);
            outNumber += Integer.parseInt(y.toString());
        }
        System.out.println("Сумма "+ outNumber);

        return 0;

    }

}
