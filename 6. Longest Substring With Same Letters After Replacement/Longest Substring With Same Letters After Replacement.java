/*Given a string with lowercase letters only, if you are allowed to replace no more than ‘k’ letters 
with any letter, find the length of the longest substring having the same letters after replacement.*/

class CharacterReplacement {
	public static int findLength(String str, int k) {
		int wS = 0, res = 0, max = 0;
		int[] carr = new int[26];
		for(int wE = 0; wE < str.length(); wE++) {
			carr[str.charAt(wE)-'a']++;
			max = Math.max(max, carr[str.charAt(wE) - 'a']);
			while(wE - wS + 1 - max > k) {
				carr[str.charAt(wS) - 'a']--;
				wS++;
			}
			res = Math.max(res, wE - wS + 1);
		}
		return res;
	}
}
