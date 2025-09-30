import java.util.*;

class AnagramGrouper {
    /**
     * TO-DO: Group anagrams from the given array of strings.
     * \*
     *
     * @param strs An array of strings.
     * @return A List of Lists, where each inner list contains a group of anagrams.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String result : strs) {
            char[] charArray = result.toCharArray();
            Arrays.sort(charArray);
            String i = Arrays.toString(charArray);
            anagramMap.computeIfAbsent(i, k -> new ArrayList<>()).add(result);
        }
        return new ArrayList<>(anagramMap.values());
    }
}