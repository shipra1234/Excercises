def list=[1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ]
println(list.size()) 
for(i in 0..list.size()-1)
 {
   println(list[i].class)
 }
 println(list.get(6).get(9))