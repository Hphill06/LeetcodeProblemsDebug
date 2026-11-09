import java.util.ArrayList;
import java.util.Arrays;
public static class mergeintervals {

    public int[][] merge(int[][] ins) {
        /*
            1) sort value
        */

        Arrays.sort(ins,(a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] previous = ins[0];

        for(int i = 1; i < ins.length;i++){
            //System.out.println(" i : " + i + " len : " + ins.length);


            //first lets check what the current starting index is compared to the last ending

            int start = ins[i][0];
            int lastEnding = previous[1];

            if(lastEnding >= start){

                //check if previous is already engulfing the current vector
                if(!(ins[i][1] < previous[1])){
                    previous = new int[]{previous[0],ins[i][1]};

                }
            }else{
                result.add(previous);
                previous = ins[i];
            }
        }
        result.add(previous);

        return result.toArray(new int[result.size()][]);
    }

}

public static void main(String[] args){

    int[][] invs = new int[4][2];

    invs[0][0] = 1;
    invs[0][1] = 3;

    invs[1][0] = 8;
    invs[1][1] = 10;

    invs[2][0] = 15;
    invs[2][1] = 18;

    invs[3][0] = 2;
    invs[3][1] = 6;

    //System.out.println(invs[1][1]);
    mergeintervals x = new mergeintervals();
    int[][] test1 = new int[][]{{1,4},{0,2},{3,5}};
    int[][] test2 = new int[][]{{1, 3},{8,10},{15,18},{2,6}};
    int[][] z = x.merge(test2);

    for(int i = 0; i < z.length;i++){
        System.out.println(z[i][0] + "," + z[i][1]);
    }
}
