public class targetarray {

       public static void main(String[] args)
       {
                int target=9;
                int[] a={2,11,15,7};
                for(int i=0;i<a.length;i++)
                {
                   for (int j=i+1;j<a.length;j++) 
                   {
                         if(a[i]+a[j]==target)
                         {
                                System.out.println(i+" "+j);
                         }
                   }
                }
       }         
}
