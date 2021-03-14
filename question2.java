class AlphabetPattern
{
 public static void main(String abc[])
{
 int alphabet=65;                          //ASCII value of A
 for(int i=5;i>1;i---)
 {            
 for(int j=1;j<=i;j++)
 {
 System.out.print((char)alphabet);
 alphabet++;
 }
 System.out.println();
 }
}
}