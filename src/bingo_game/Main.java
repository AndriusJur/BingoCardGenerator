package bingo_game;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BingoCard result = Main.getBingoCard();
        result.printCard();


    }

        static BingoCard getBingoCard(){

            int []b=generateColumn(1,15);
            int []i=generateColumn(16,30);
            int []n=generateColumn(31,45);
            int []g=generateColumn(46,60);
            int []o=generateColumn(61,75);


            BingoCard bingoCard=new BingoCard(b, i, n, g, o);



            return bingoCard;

        }

        private static int[] generateColumn(int min, int max){

            Random random = new Random();
            int count = 0;
            int entries = 5;
            int [] arrayOfNumbers= new int [entries];
            while (count < entries) {
                int number = random.nextInt(max-min+1)+min;
                elementExists(arrayOfNumbers,number);
                if (true) {
                    arrayOfNumbers[count]=number;
                        count++;
                }
            }

            return arrayOfNumbers;
        }

        // Do not edit this method
        private static boolean elementExists(int[] array, int element){
            for(int i=0; i<array.length; i++){
                if(array[i] == element){
                    return true;
                }
            }
            return false;
        }
    }




