public class Palindrome {

    public static boolean palindrome(String s) {
       char[] ch=s.toCharArray();
       int left=0,right=ch.length-1;
       char temp; 
       while(left<right)
       {
        temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
        left++;
        right--;
       }
       System.out.println("Is \""+s+"\" palindrome : "+s.equals(new String(ch)));
       return s.equals(new String(ch));
    }

    public static void main(String[] args)
    {
        palindrome("aha");
    }
}
