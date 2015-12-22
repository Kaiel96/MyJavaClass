import java.util.Scanner;

public class hybrid {
    


    public static void main(String args[])
    {
    // We are going to start by initializing the variables to zero
    double resale= 0;
    double init_cost=0; 
    double mi_per_yr=0; 
    double mpg=0;
    double gas_price=0;
    double years=0;

        //now we are going to start a scanner
        Scanner in = new Scanner(System.in);

        //now we ask for the input, and add it to the variables

        System.out.println("Enter the cost of your car");
        init_cost = init_cost + in.nextDouble();
        System.out.println("Enter the resale price of your car");
        resale = resale + in.nextDouble();

        System.out.println("Enter the miles driven per year of your car");
        mi_per_yr = mi_per_yr+in.nextDouble();

        System.out.println("Enter the mpg of your car");
        mpg=mpg+in.nextDouble();

        System.out.println("Enter the price of gas");
        gas_price=gas_price+in.nextDouble();

        System.out.println("Enter the ammount of years of concern");
        years=years+in.nextDouble();


        double costPerYear = (mi_per_yr/mpg)*gas_price;
            //I am going to get the amount of gallons by doing this calculation, then 
            // multiply it by the gas price

        double costByYear = costPerYear*years - resale;
        

        System.out.println("The total cost over " + years + " years of owning this car is $" 
            + costByYear);

    }    
}



/* output

I used a 2010 prius with 49,000 miles on it priced at $16,000 and 51mpg for the used car
and a 2015 prius with 0 miles (from dealership) priced at $24,200 with 50 mpg)

new car 

Enter the cost of your car
24200
Enter the resale price of your car
16000
Enter the miles driven per year of your car
15000
Enter the mpg of your car
50
Enter the price of gas
2.97 
Enter the ammount of years of concern
5
The total cost over 5.0 years of owning this car is $-11545.0

used car 
Enter the cost of your car
16000
Enter the resale price of your car
16000
Enter the miles driven per year of your car
15000
Enter the mpg of your car
51
Enter the price of gas
2.97
Enter the ammount of years of concern
5
The total cost over 5.0 years of owning this car is $-11632.35294117647
*/

