public class reversearray {
                public static void main(String[] args)
                {
                   int a[]={3,7,2,9,5} ;
                   for(int i=0;i<a.length;i++)
                   {
                                System.out.print(a[i]+" ");
                   }
                   System.out.println();
                   System.out.println("REversed array");
                   for(int i=a.length-1;i>=0;i--)  
                   {
                                System.out.print(a[i]+" ");
                   }          
                }
}
