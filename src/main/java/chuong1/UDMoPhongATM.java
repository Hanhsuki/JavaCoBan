package chuong1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UDMoPhongATM {
        public static void main(String[] args) {
            bai1();

        }

        public static void bai1 () {
            int money = 0;
            DecimalFormat formater = new DecimalFormat("#.###");

            final int FIVE_HUNDRED_THOUSAND = 500000;
            final int TWO_HUNDRED_THOUSAND  = 200000;
            final int ONE_HUNDRED_THOUSAND  = 100000;
            final int FIFTY_THOUSAND        = 50000;
            final int TWENTY_THOUSAND       = 20000;
            final int TEN_THOUSAND          = 10000;
            int numberFiveHundredthousand = 0;
            int numberTwoHundredthousand  = 0;
            int numberOneHundredthousand  = 0;
            int numberFiftythousand       = 0;
            int numberTwentythousand      = 0;
            int numberTenthousand         = 0;

            Scanner sc = new Scanner(System.in);

            do {
                System.out.println("Your's money ");
                money = sc.nextInt();
            } while (money % 10000 != 0);
            sc.close();

            System.out.println(".............................................");
            if(money >= FIVE_HUNDRED_THOUSAND){
                numberFiveHundredthousand = money/FIVE_HUNDRED_THOUSAND;
                money = money % FIVE_HUNDRED_THOUSAND;
                System.out.printf("Mệnh giá %s : %d %n",formater.format(FIVE_HUNDRED_THOUSAND),numberFiveHundredthousand);
            }
            if(money >= TWO_HUNDRED_THOUSAND){
                numberTwoHundredthousand = money/TWO_HUNDRED_THOUSAND;
                money = money % TWO_HUNDRED_THOUSAND;
                System.out.printf("Mệnh giá %s : %d %n",formater.format(TWO_HUNDRED_THOUSAND),numberTwoHundredthousand);
            }
            if(money >= ONE_HUNDRED_THOUSAND){
                numberOneHundredthousand = money/ONE_HUNDRED_THOUSAND;
                money = money % ONE_HUNDRED_THOUSAND;
                System.out.printf("Mệnh giá %s : %d %n",formater.format(ONE_HUNDRED_THOUSAND),numberOneHundredthousand);
            }
            if(money >= FIFTY_THOUSAND){
                numberFiftythousand = money/FIFTY_THOUSAND;
                money = money % FIFTY_THOUSAND;
                System.out.printf("Mệnh giá %d : %d %n",formater.format(FIFTY_THOUSAND),numberFiftythousand);
            }
            if(money >= TWENTY_THOUSAND){
                numberTwentythousand = money/TWENTY_THOUSAND;
                money = money % TWENTY_THOUSAND;
                System.out.printf("Mệnh giá %d : %d %n",formater.format(TWENTY_THOUSAND),numberTwentythousand);
            }
            if(money >= TEN_THOUSAND){
                numberTenthousand = money/TEN_THOUSAND;
                money = money % TEN_THOUSAND;
                System.out.printf("Mệnh giá %d : %d %n",formater.format(TEN_THOUSAND),numberTenthousand);
            }
        }
    }

