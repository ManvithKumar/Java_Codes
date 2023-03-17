class java1{
    public static void main(String[] args) {
        String str = "Manvith";
        int a=0;
        String str1="";
        for(int i =0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c>=65 && c<=90){
                c =  (char) ((int) c + 32);
                str1 += c;
            }
            else{
                c =  (char) ((int) c - 32);
                str1 += c;
            }
            
        }
        System.out.println(str1);
    }
}