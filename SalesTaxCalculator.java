import java.text.NumberFormat;
import java.util.Locale;


public class SalesTaxCalculator {


    public static void main(String[] args)
    {
        /** Declare and initialize varibles */
        double foodsalesTaxPercentage = .03; /**food sales tax percentage */
        double nonFoodTaxPercentage = .0675; /**non-food sales tax percentage */
        double foodBill = 150.00; /**Food bill  */
        double nonFoodBill = 50.00; /** Non-food bill */

        double totalFoodTax = foodBill * foodsalesTaxPercentage; /** calculate total food related tax*/
        double totalNonFoodTax = nonFoodBill * nonFoodTaxPercentage; /** calculate total non-food related tax*/
        double totalSalesTax = totalFoodTax + totalNonFoodTax; /** find the total tax for food and non-food related groceries*/

        NumberFormat formatCurrency = NumberFormat.getCurrencyInstance(); /** format the total tax into currency*/         

        System.out.println("The total tax for your bill is: " + formatCurrency.format(totalSalesTax)); /** print the total tax for this purchase*/

    }
}
