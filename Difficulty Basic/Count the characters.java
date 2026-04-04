class Sol {
    int getCount(String S, int N) {
        Map<Character, Integer> freq = new HashMap<>();
        char prev = '\0';
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c != prev) freq.put(c, freq.getOrDefault(c, 0) + 1);
            prev = c;
        }
        int count = 0;
        for (int val : freq.values()) if (val == N) count++;
        return count;
    }
}
