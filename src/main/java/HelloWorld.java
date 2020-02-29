import java.net.Inet4Address;
import java.util.Scanner;

import java.util.*;
public class HelloWorld {
    public static void main(String args[]) {
        System.out.print("Can I get your name please");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Greeting g = new Greeting();
        g.askName(name);
        System.out.println(g.sayHello());

        System.out.print("Enter the upper and lower limits between which you want to know prime numbers : ");
        int ll = sc.nextInt();
        int ul = sc.nextInt();
        System.out.println(givePrimeNumbersBetween(ll, ul));

        System.out.println("The following number of prime numbers can be written as the sum of two consecutive prime numbers+1");
        System.out.println(listSumCombos(ll,ul)+".");

        System.out.println("The following are twin prime numbers : ");
        int total = twinPrimeNumbers(ll,ul);
        System.out.println("Total is "+ total);







    }

    public static List<Integer> givePrimeNumbersTill(int upperLimit) {
        List<Integer> allNums = new ArrayList<Integer>();
        for (int i = 2; i <= upperLimit; i++) {
            //starting from 2
            allNums.add(i);
        }
        //selecting only prime numbers
        for (int i = 0; i < allNums.size(); i++) {
            for (int j = 0; j < allNums.size(); j++) {
                if (allNums.get(j) % allNums.get(i) == 0 && allNums.get(j) != allNums.get(i)) {
                    allNums.remove(j);
                }
            }
        }
        return allNums;
    }

    public static List<Integer> givePrimeNumbersBetween(int lowerLimit, int upperLimit) {
        List<Integer> primeNumbers = givePrimeNumbersTill(upperLimit);
        for (int i = 0; i < primeNumbers.size(); i++) {
            if (primeNumbers.get(i) < lowerLimit) {
              primeNumbers.remove(i);
               i--;

            } else {
                return primeNumbers;
            }
        }
        return primeNumbers;
    }

    public static int listSumCombos(int ll,int ul){
        List <Integer> pNumTill = givePrimeNumbersTill(ul);
        List <Integer> pNumBetween = givePrimeNumbersBetween(ll,ul);
        int countsOfSums = 0;
        for(int i =0;i<pNumTill.size();i++){
            if(pNumBetween.size()==0){
                return countsOfSums;
            }
            else if(pNumTill.get(i)+pNumTill.get(i+1)+1<pNumBetween.get(0)){}

            else if(pNumTill.get(i)+pNumTill.get(i+1)+1 > pNumBetween.get(0)){
                pNumBetween.remove(0);
                i--;

            }
            else if(pNumTill.get(i)+pNumTill.get(i+1)+1 == pNumBetween.get(0)){
                System.out.println("==>"+pNumTill.get(i)+"+ "+pNumTill.get(i+1)+" + 1 = "+pNumBetween.get(0));
                pNumBetween.remove(0);
                countsOfSums++;
                i--;

            }

        }
        return countsOfSums;
    }

    public static int  twinPrimeNumbers(int ll,int ul){
        int count = 0;
        List <Integer> pNumBetween = givePrimeNumbersBetween(ll,ul);
        for(int i =0;i<pNumBetween.size();i++){
            if(pNumBetween.size()>i+1 && pNumBetween.get(i+1)-pNumBetween.get(i)==2){
                count++;
                System.out.println("Pair "+count+" : { "+pNumBetween.get(i)+","+pNumBetween.get(i+1)+" }");
            }
        }
        return count;
    }
}





