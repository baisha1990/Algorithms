/*Given a string, find the length of the longest substring in it with no more than K distinct characters.*/

class LongestSubstringKDistinct {
	public static int findLength(String str, int k) {
		int wS = 0, res = Integer.MIN_VALUE;
		Map<Character, Integer> map = new HashMap<>();
		for(int wE = 0; wE < str.length(); wE++) {
			res = Math.max(res, wE - wS);
			map.put(str.charAt(wE), map.getOrDefault(str.charAt(wE), 0) + 1);
			while(map.size() > k) {
				map.put(str.charAt(wS), map.get(str.charAt(wS)) - 1);
				if(map.get(str.charAt(wS)) == 0)
					map.remove(str.charAt(wS));
				wS++;
			}
		}
		return res;
	}
}
