package Module2;

public class FinancialForecast {
    
    public static double predictFutureValue(double presentValue, double growthRate, int years) {
        
        if (years <= 0) {
            return presentValue;
        }

        double nextYearValue = presentValue * (1 + growthRate);

        return predictFutureValue(nextYearValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0; 
        double annualGrowth = 0.05;        
        int forecastPeriod = 3;            

        System.out.println("Starting Financial Forecast...");
        System.out.println("Initial Value: $" + initialInvestment);
        System.out.println("Growth Rate: " + (annualGrowth * 100) + "%");
        System.out.println("Period: " + forecastPeriod + " years\n");

        double finalValue = predictFutureValue(initialInvestment, annualGrowth, forecastPeriod);
        
        System.out.printf("Predicted Future Value: $%.2f%n", finalValue);
    }
}