class Star_14{
public static void main(String args[]){
for(char i=1;i<=5;i++)
{
 for(int j=5-i;j>=1;j--)
 {
  System.out.print(" "); 
 }
 for(char k=1;k<=i;k++)
 {
  System.out.print("*"+" ");
  }
  System.out.println( );
  
}
for(int i=2;i<=5;i++)
{
 for(int j=1;j<i;j++)
 {
  System.out.print(" "); 
 }
 for(char k=5;k>=i;k--)
 {
  System.out.print("*"+" ");
  }
  System.out.println( );
  
}

	
}
}