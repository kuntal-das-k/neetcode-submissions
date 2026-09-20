class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert the unique elements to a list
        List<Integer> uniqueElements = new ArrayList<>(frequencyMap.keySet());

        // Sort the list based on the frequency in descending order (Brute Force Sorting)
        Collections.sort(uniqueElements, (a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        // Step 3: Extract the top k frequent elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = uniqueElements.get(i);
        }

        return result;
    }
}
