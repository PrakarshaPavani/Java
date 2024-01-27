public class Palindrome {

    public static void main(String[] args) {
       String s="aha";
       String s1="hello";
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
       System.out.println("Is \""+s1+"\" palindrome : "+s1.equals(new String(ch)));
    }
}