class Solution 
{
    public void reverseString(char[] s) 
    {
    int m = 0, r = s.length - 1;
    while (m<r) {
        char temp = s[m];
        s[m] = s[r];
        s[r] = temp;
        m++;
        r--;
    }
    }
}