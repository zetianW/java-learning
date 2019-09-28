package enumtest;

import java.util.Scanner;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/09/27
 **/
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入尺码类型(例如：S,M,L,XL)：");
        String inputValue = in.next().toUpperCase();

        SizeEnum sizeEnum = SizeEnum.getByCode(inputValue);
        System.out.println("code=" + sizeEnum.getCode());
        System.out.println("description="+sizeEnum.getDescription());
        System.out.println("name="+sizeEnum.getName());

        if (sizeEnum == SizeEnum.EXTRA_LARGE) {
            System.out.println("你选中了特大码！");
        }
    }
}

