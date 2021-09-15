/* Given a string, sort it based on the decreasing frequency of its characters. */

public static String sortCharacterByFrequency(String str) {
    Map<Character, Integer> map = new HashMap<>();
    for(char c : str.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
    for(Map.Entry<Character, Integer> entry : map.entrySet()) {
        maxHeap.add(entry);
    }
    StringBuilder sb = new StringBuilder();
    int v = 0;
    while(!maxHeap.isEmpty()) {
        Map.Entry<Character, Integer> entry = maxHeap.poll();
        for(int i = 0; i < entry.getValue(); i++) {
            sb.append(entry.getKey());
        }
    }
    return sb.toString();
}