public class TestArrays {
    public static void main(String[] args) {
        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        String[] islands=new String[4];
        islands[0]="岛1";
        islands[1]="岛2";
        islands[2]="岛3";
        islands[3]="岛4";
        for(int i:index){
            System.out.println(i);
        }
//        int y=0;
//        int ref;
//      while(y<4){
//            ref=index[y];
//            System.out.print("island=");
//            System.out.println(islands[ref]);
//            y=y+1;

    }
}