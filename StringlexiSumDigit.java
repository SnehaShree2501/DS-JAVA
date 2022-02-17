class StringlexiSumDigit
{
    public String arrangeString(String s)
        {
            //code here.
            int n=s.length();String newStr=null;
            for(int i = 0; i < n-1; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    if(Character.isLetter(s.charAt(i))){
                        if (s.charAt(i)>(s.charAt(j))) {
                            newStr=newStr.strncat()(s.charAt(j));
                         }
                    }
                   
                }
             }
        }
}