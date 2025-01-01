package src.Array.Medium;

public class LeetCode134 {
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};

        System.out.println(canCompleteCircuit(gas,cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        //outer loop
        for (int i = 0; i < gas.length; ) {
            if (gas[i] >= cost[i]) {
                int loopInd = i;
                int loopCnt = 0;
                int total;

                if (i == gas.length - 1) {
                    //last index
                    loopInd = 0;
                    total = gas[i] - cost[i] + gas[0];
                } else {
                    total = gas[i] - cost[i] + gas[i + 1];
                }

                while (loopCnt < gas.length - 1) {
                    int k=loopInd+1;
                    if(k+1>= gas.length){
                        k=0;
                    }else{
                        k++;
                    }

                    if (total >= cost[k]) {
                        total = total - cost[k] + gas[k];
                        if (loopCnt == gas.length - 1) {
                            return loopInd;
                        }
                    } else {
                        break;
                    }
                    loopCnt++;
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}
