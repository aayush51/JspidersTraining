class NamePattern
{
    public static void main(String[] args) 
    {
        int n = 6 ;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n*6+6; j++)
            {
                if ( (i==0&&j<=n-2) || (i<=n&&j==0) || (j==n-2) || (i==n/2 && j<=n/2) || (j==n&&j<=n) || () )
                {
                    System.out.print("*" + " ");    
                }
                else
                {
                    System.out.print(" " + " ");
                }
            }
            System.out.println(); 
        }
    }
}