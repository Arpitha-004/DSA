class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int id : arr) {
            int count = frequencyMap.containsKey(id) ? frequencyMap.get(id) + 1 : 1;
            frequencyMap.put(id, count);
        }

        // Get the list of frequencies
        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());

        // Sort frequencies in ascending order
        Collections.sort(frequencies);

        // Remove items starting from the smallest frequency
        int removedItems = 0;
        int uniqueIds = frequencies.size();

        for (int freq : frequencies) {
            if (removedItems + freq <= k) {
                removedItems += freq;
                uniqueIds--;
            } else {
                break;
            }
        }

        return uniqueIds;

    }
}