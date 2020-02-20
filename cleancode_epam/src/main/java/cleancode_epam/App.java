package cleancode_epam;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
						
						    	HouseConstructionCost cost = new HouseConstructionCost();
						    	
						        Scanner sc=new Scanner(System.in);
						        String automation = "no";
						        System.out.println("Enter Material Standard ");
						        String materialStandard = sc.nextLine();
						        
						        System.out.println("Enter Total Area of the house(in sq.feet)  ");
						        int totalArea = sc.nextInt();
						        
						        sc.nextLine();
						        if(materialStandard.equals("high standard"))
						        {
						        	System.out.println("Do you want fully automated home????");
						        	automation = sc.nextLine();
						        }
						          
						        System.out.println("Total house construction cost = Rs "+cost.constructionCost(materialStandard,totalArea,automation));
						        
						       
						        
						        SimpleandCompound interest = new SimpleandCompound();
						        
						        System.out.println("Enter principle amount,rate and time : ");
						        
						        int principle = sc.nextInt();
						        double rate = sc.nextDouble();
						        int time = sc.nextInt();
						        int n = sc.nextInt();
						        
						        System.out.println("simple interest is : " +interest.calculateSimpleInterest(principle, rate, time));
						        System.out.println("compound interest is : " +interest.calculateCompoundInterest(principle, rate, time,n));
						        
						        sc.close(); 
						    }
						}