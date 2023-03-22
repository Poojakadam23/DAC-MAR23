class Pattern_10{
public static void main(String args[]){
for(int i='E';i>='A';i--)
{
  for(int j='A';j<=i;j++)
   {
   System.out.print(" "); 
    }
     for(int k=i;k<='E';k++)
     {
     System.out.print(k+" ");
     }
   System.out.println( );     
}
}
}