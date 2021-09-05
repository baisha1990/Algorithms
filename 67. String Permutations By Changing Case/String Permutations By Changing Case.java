/* Given a string, find all of its permutations preserving the character sequence but changing case. */

public static List<String> findLetterCaseStringPermutations(String str) {
    List<String> permutations = new ArrayList<>();
    permutations.add(str);
    for(int i = 0; i < str.length(); i++) {
        if(Character.isLetter(str.charAt(i))) {
            int n = permutations.size();
            for(int j = 0; j < n; j++) {
                char[] c = permutations.get(j).toCharArray();
                if(Character.isUpperCase(c[i]))
                    c[i] = Character.toLowerCase(c[i]);
                else
                    c[i] = Character.toUpperCase(c[i]);
                permutations.add(String.valueOf(c));
            }
        }
    }
    return permutations;
}