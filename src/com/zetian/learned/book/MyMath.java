public class MyMath {
    public static int div(int x,int y) throws Exception {
        int result=0;
        System.out.println("1、除法计算开始");
        result=x/y;
        System.out.println("2、除法计算结束");
        return result;
    }
}
class Test {
    public static void main(String args[]) {
        try {
            System.out.println(MyMath.div(10, 2));
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}

