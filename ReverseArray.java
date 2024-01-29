public class ReverseArray {
    public static void main(String[] args) 
    {
        char[] a = {'1', '2', '3','4'};
        char temp = ' ';
        for (int i = 0; i < a.length / 2; i++) 
        {
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    System.out.println(a);
    }                                     
}
