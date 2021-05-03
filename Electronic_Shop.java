import java.util.*;
public class Electronic_Shop
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Welcome to Mumbai Electronic Shop");
            System.out.println("Enter The Name Of Item 1:");
            String Name_1 = sc.nextLine();
            System.out.println("Enter Quantity:");
            int QTY1 = sc.nextInt();
            System.out.println("Enter The Cost Of Item 1:");
            double Price_1 = sc.nextDouble();
            System.out.println("Enter The Name Of Item 2:");
            String Name_2 = sc.nextLine();
            System.out.println("Enter Quantity of Item 2:");
            int QTY2 = sc.nextInt();
            System.out.println("Enter The Cost of Item 2:");
            double Price_2 = sc.nextDouble();
            double Cost1 = QTY1 * Price_1;
            double Cost2 = QTY2 * Price_2;
            System.out.println("The Cost of Item 1 = "+ Cost1);
            System.out.println("The Cost of Item 2 = "+ Cost2);
            double Bill = Cost1 + Cost2;
            System.out.println("The Bill WITHOUT DISCOUNT is = "+ Bill);
        {
        double Dis = 0.0;
        double Total_Bill = 0.0;
        double GST = 0.0;
        double Net_amount = 0.0;
        
        if(Bill <= 100000 && Bill >= 80000)
        Dis = Bill * 40/100;
        else if(Bill <= 80000 && Bill >= 50000)
        Dis = Bill * 25/100;
        else if(Bill <= 50000 && Bill >= 30000)
        Dis = Bill * 20/100;
        else if(Bill <= 30000 && Bill >= 10000)
        Dis = Bill * 10/100;
        else
        Dis = Bill * 5/100;
        Net_amount = Bill - Dis;
        GST = Net_amount * 18/100;
        Total_Bill = Net_amount + GST;
        System.out.println("The Discount amount is = "+ Dis);
        System.out.println("The Net Amount is = "+ Net_amount);
        System.out.println("The GST  is = "+ GST);
        System.out.println("The Total Bill is = "+ Total_Bill);
        System.out.println("Thank You For Visiting Us");
    }
}
}
}
            
            
