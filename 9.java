class Solution {
    public boolean isPalindrome(int x) {
       
     
        String str="";
        int i;
        String s=String.valueOf(x);
        int l=s.length();
        for(i=l-1;i>=0;i--)
        {
            str=str.concat(String.valueOf(s.charAt(i)));
        } 
        if(s.equals(str))
            return true;
        else
            return false;
     
    }
}
