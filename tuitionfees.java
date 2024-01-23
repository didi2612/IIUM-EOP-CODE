public class tuitionfees {
    public static void main(String[] args) {
        double initialTuition = 10000;
        double increaserate = 0.07;
        double doubledtuition = initialTuition * 2; 
      

        int years = 0; 

        
        while (initialTuition < doubledtuition) {
            initialTuition *= (1 + increaserate); 
            years++;
        }

        System.out.println("It will take " + years + " years for the tuition to double.");
    }
}
