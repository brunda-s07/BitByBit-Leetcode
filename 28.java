class Solution {
    public int strStr(String haystack, String needle) {
    int n=haystack.length();
    int m=needle.length();
    int i,j=-1;
    String s;
    for(i=0;i<=(n-m);i++)  
    {
        s=haystack.substring(i,i+m);
        if(s.equals(needle)==true)
        {
            j=i;
            break;
        }
    }
    return j;  
    }
}
