import java.util.Random;

class Exercise4 {
    public static void main(String[] args) {   
     
           int[] numbers = {20, 30, 25, 35, -16, 60, -100};
            
           Random rand = new Random();            

           
           int SpecificValue = numbers[rand.nextInt(numbers.length)];
           
           
           System.out.println(SpecificValue);
           
           for (int i = 0;i<numbers.length;i++){
             if (numbers[i] == SpecificValue){
               System.out.println("Found Specific Value");
             }
           }
       }
    }
