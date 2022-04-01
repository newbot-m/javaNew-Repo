
package wassceaggregate_calculator;

import java.util.Scanner;

/**
 *
 * @author Kofik Technology Ghana
 * AAMUSTED Information Technology Education Kumasi
 * 0245513607 Accra
 */
public class WassceAggregate_Calculator {

    /**
     * @param args the command line arguments
     *
     */
    
  
     //function to calculate all six best grades
    private static void sum(int s1, int s2, int s3, int s4, int s5, int s6){
    
        int totalAggr;
        totalAggr = s1 + s2 + s3 + s4 + s5 + s6;
        System.out.println("Your Total Aggregate is " + totalAggr);
        
        if((s1 >=7)|| (s2 >=7) || (s3 >=7)){
                System.out.println("But you do not qualify for any Public university in Ghana");
                System.out.println("NOTE!! A1-C6 in the core subjects(Maths, English, Science/Social)");
            }
            else if ((s1 <7) && (s2 <7) && (s3 <7) && (totalAggr <=25)){
                System.out.println("Congratulations! You Qualify For Any Public University in Ghana\n");
            }
           else if ((s1 <7) && (s2 <7) && (s3 <7) && (totalAggr >25)){
                System.out.println("But you do not qualify for any Public university in Ghana\n");
            }
          //return;
     }
     
    public static void main(String[] args) {
            System.out.println("*****************KOFIK TECHNOLOGY GHANA********************");
            System.out.println("*****************WASSCE AGGREGATE CALCULATOR V1.0********************");
            System.out.println("*****************kofiktechgh@gmail.com********************\n");
            System.out.println("TAKE NOTE!!");
            System.out.println("General University Entry Requirements");
            System.out.println("A1-C6 in the core subjects(Maths, English, Science/Social) and best three elective subjects\n");
            
              
            int coreMaths, coreEng, coreSci, elect1, elect2, elect3;
            int total;
            boolean check = true;
            
            while(check == true){
            
            //Get users best six grades 
            System.out.println("---------Enter Core Subjects-----------");
            Scanner coreSub = new Scanner(System.in);
            
            System.out.println("Core Mathematics");
            coreMaths = coreSub.nextInt();
            
            System.out.println("English Language");
            coreEng = coreSub.nextInt();
            
            System.out.println("Integrated Science / Social Studies");
            coreSci = coreSub.nextInt();
 
            System.out.println("---------Enter 3 Elective Subjects-----------");
        
            System.out.println("Elective 1");
            elect1 = coreSub.nextInt();
            
            System.out.println("Elective 2");
            elect2 = coreSub.nextInt();
            
            System.out.println("Elective 3");
            elect3 = coreSub.nextInt();
            
            //calling the function sum() to give the final output 
            sum(coreMaths, coreEng, coreSci, elect1, elect2, elect3);
            
        }
    }
}
