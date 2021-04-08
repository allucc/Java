package win.icpc.my.ch01;

/**
 * @author lucy
 * @date 2021/1/2 17:02
 */
public class Test {
    public static void main(String[] args) {
        boolean[][] test = {
                {true, false, true},
                {true, false, true},
                {true, false, true}
        };
        print2boolean(test);

    }

    public static void print2boolean(boolean[][] booleanArray) {
        if( booleanArray == null) {
            return;
        }
        for(int i = -1; i < booleanArray.length; ++i) {
            int length = booleanArray[0].length;
            for(int j = -1; j < length; ++j) {
                if(i < 0 || j < 0) {
                    if(i < 0 && j < 0) {
                        System.out.print(" \t");
                    }else if (i < 0){
                        System.out.print(j + "\t");
                    }else if(j < 0) {
                        System.out.print(i + "\t");
                    }
                } else {
                    System.out.print((booleanArray[i][j]? '*': ' ') + "\t");
                }
            }
            System.out.println();
        }
    }
}
