package Array;

public class TrappedRainWater {
    public static void trappedWater(int[] barHeight) {
        if (barHeight.length <= 2) {
            System.out.println("Trapped water is 0 because no. of bar are not more then 2");
        }
        else if (isAscending(barHeight)) {
            System.out.println("Trapped water is 0 because height arrange in ascending");
        } else if (isDescending(barHeight)) {
            System.out.println("Trapped water is 0 because height arrange in descending");
        }

        int n = barHeight.length;

        //for left max
        int[] leftMax = new int[n];
        leftMax[0] = barHeight[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(barHeight[i], leftMax[i - 1]);
        }

        //for right max
        int[] rightMax = new int[n];
        rightMax[n - 1] = barHeight[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(barHeight[i], rightMax[i + 1]);
        }

        //loop

        int trappedWater = 0;
        int width = 1;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater = trappedWater + (waterLevel - barHeight[i]) * width;
        }
        System.out.println("Total trapped water is " + trappedWater);
    }

    public static boolean isAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {  // if current > next, not ascending
                return false;
            }
        }
        return true;

    }

    public static boolean isDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {  // if current > next, not ascending
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] barHeight = {4, 2, 0, 6, 3, 2, 5};
        trappedWater(barHeight);

        int[] barHeight2 = {1, 2, 3, 4};
        trappedWater(barHeight2);

        int[] barHeight3 = {4, 3, 2, 1};
        trappedWater(barHeight3);


        int[] barHeight4 = {1, 2};
        trappedWater(barHeight4);
    }

}

