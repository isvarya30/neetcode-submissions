class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Sort by frequency
        List<Integer> numbers = new ArrayList<>(map.keySet());

        Collections.sort(numbers, (a, b) -> map.get(b) - map.get(a));

        // Answer
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = numbers.get(i);
        }

        return ans;
    }
}