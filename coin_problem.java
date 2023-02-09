/*Akash got a new coin game. In the coin game, Akash will only win the game if the total count is 56. Each coin will have value inscribed. Write a programming solution, to help Akash in counting total value of coins at the end of the game. Coin Game is played N times

Note: Player will have exactly K coins at the end of the game.

Input Format

1st line contain N(integers) 2nd line contain space separated values from K coins

Constraints

N>0 & N<=5
K=7
Output Format

One integer – 1 in case of win, 0 in case of loss*/
//-----------------------------------------------main code below------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class CoinGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] coins = new int[7];
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                coins[j] = sc.nextInt();
                sum += coins[j];
            }
            if (sum == 56) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}
