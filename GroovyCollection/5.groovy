List range=[6,2,7,9,8,10]
int size=range.size()-1
 List l=[]
for(i in 0..size)
{
  if(i%2==1)
   {
  
   l.add(range[i])
    
   }
}
println l
range.removeAll(l)
println range
