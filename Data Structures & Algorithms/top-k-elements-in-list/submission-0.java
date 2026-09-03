class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num:nums){
            count.put(num, count.getOrDefault(num,0) + 1);
        }

        int [] result = new int[k];

        for (int i = 0; i < k; i++) {
            int bestNumber = 0;
            int bestCount = -1;

            for (int num : count.keySet()) {
                if (count.get(num) > bestCount) {
                    bestCount = count.get(num);
                    bestNumber = num;
                }
            }
            result[i] = bestNumber;
            count.remove(bestNumber);
        }

        return result;

    }
}
