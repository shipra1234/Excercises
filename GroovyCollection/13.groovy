String s="intelligrape"
int count=0
println(s.length())
for(i in 0..s.length()-1)
 {
    if(s[i]=='i')
     {
       count=count+1
      
      }
       
  }
 println("occurence of i is ${count}" )