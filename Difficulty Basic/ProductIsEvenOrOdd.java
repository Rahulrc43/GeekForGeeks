class Sol {
    int EvenOdd(String n1, String n2) {
        int lastDigit1 = n1.charAt(n1.length() - 1) - '0';
        int lastDigit2 = n2.charAt(n2.length() - 1) - '0';
        if (lastDigit1 % 2 == 0 || lastDigit2 % 2 == 0) {
            return 1;
        }
        return 0;
    }
}
