class Pattern_13{
public static void main(String args[]){
	char count='A';
for(char i='E';i>='A';i--)
{
 for(int j='A';j<=i;j++)
 {
  System.out.print(" "); 
 }
 for(int k='A';k<=count;k++)
 {
  System.out.print(count+" ");
  }
  System.out.println( );
  count++;
  
  
}
}
}