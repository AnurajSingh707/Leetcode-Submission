class Solution {
    int start = 0;
    int end = 0;
    int max;
    public boolean pallin(String s, int i, int j){
        while( i < j){
            char s1 = s.charAt(i);
            char s2 = s.charAt(j);

            if(s1 != s2){
                return false;
            }
            i++;
            j--;
        }
            return true;
        
    }
    public String longestPalindrome(String s) {
        int n = s.length();

        for(int  i =0; i<n; i++){
            for(int j =i; j<n;j++){
                if(pallin(s,i,j) == true){
                    if(j -i+1 > max){
                        max = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}