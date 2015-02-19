def range=1..100
for(i in 1..range.size())
 {
   if(i%3==0)
    {
      println(i+" fizz ")
     }
     if(i%5==0)
      {
       println(i+" Buzz")
      }
      if(i%15==0)
       {
        println(i+ " FizzBuzz")
       }
 }