/* Given a string, find if its letters can be rearranged in such a way that no two same characters come next to each other. */

public static String Solution(String str) {
    Map<Character, Integer> map = new HashMap<>();
    for(char c : str.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
    maxHeap.addAll(map.entrySet());
    Map.Entry<Character, Integer> prevEntry = null;
    StringBuilder sb = new StringBuilder(str.length());
    while(!maxHeap.isEmpty()) {
        Map.Entry<Character, Integer> curEntry = maxHeap.poll();
        sb.append(curEntry.getKey());
        if(prevEntry != null && prevEntry.getValue() > 0)
            maxHeap.add(prevEntry);

        curEntry.setValue(curEntry.getValue() - 1);
        prevEntry = curEntry;
    }
    return sb.toString().length() == str.length() ? sb.toString() : "";
}