/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC MSI
 */

    
public class MyString implements IString {

    @Override
    public int f1(String string) {
        String[] i = string.split(" ");
        int count = 0;

        for (String j : i) {
            if (j.length() >= 3 && isPalindrome(j) && countDigits(j) >= 3) {
                count++;
            }
        }
        return count;
    }

    private boolean isPalindrome(String string) {
        int a = string.length();
        for (int i = 0; i < a / 2; i++) {
            if (string.charAt(i) != string.charAt(a - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private int countDigits(String string) {
        int count = 0;
        for (char ch : string.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String string) {
        StringBuilder result = new StringBuilder();
        boolean odd = false;

        for (char ch : string.toCharArray()) {
            if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
                if (num % 2 == 0) {
                    result.append(ch);
                } else {
                    if (!odd) {
                        result.append(ch);
                        odd = true;
                    }
                }
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}

