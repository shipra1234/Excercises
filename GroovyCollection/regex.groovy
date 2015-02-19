String s="http://www.google.com?name=johny&age=20&hobby=cricket"
 
def d=s.split("\\?")
  List l=d[1].split("&")
    
   println(l)
   Map m=[:]
   l.each{key->
    List value=key.split("=")
     m[value[0]]=value[1]
   }
   println(m)