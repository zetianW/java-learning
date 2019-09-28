package videoLearning;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Description    执行大数值转换
 *
 * @author Zetian Wang
 * @date 2019/09/19
 **/
public class BigIntergerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw?");
        int n = in.nextInt();

        BigInteger  lotteryOdds = BigInteger.valueOf(1);
        for(int i =1;i<=k;i++){
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
            //ValueOf把基本类型转化为对象类型的方法；返回对象的值；获取布尔型对象的值（返回值为布尔型）
        }
        System.out.println("You odds are 1 in "+lotteryOdds+".Good luck!");
    }
}
