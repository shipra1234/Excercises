class Number
 {
   int n
   public void cal()
    {
      for(i in 1..10)
       {
         print(n*i)
       } 
       println()
    }
   public static void main(String[]args)
    {
       Number n1=new Number(n:2)
       Number n2=new Number(n:12)
         n1.cal()
         n2.cal()
    }
  }