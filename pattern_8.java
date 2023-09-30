/*
    *
  *   *
*       *
  *   *
    *
     
Logic ->> Calculate inner space and outer space based on that print outerspace -> * -> innerspace    
*/
public class pattern_8 {
  public static void main(String[] args) {
    
  int n=5;
  int is=-1;
  int os=n/2;

  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=os;j++)
    {
      System.out.print("  "); 
    }
    System.out.print("* ");
    
    for(int j=1;j<=is;j++)
    {
      System.out.print("  ");
    }
    if(i>1 && i<n){

      System.out.print("* ");

    }
    
    if(i<=n/2)
    {
       os--;
       is=is+2;
    }
    else{
      os++;
      is=is-2;

    }
    System.out.println();
  }

  }
    
}
