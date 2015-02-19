File f=new File("/home/shipra/intelli.txt")
  f.eachLine{line,line_no=1->
  if(line_no%2==1)
   {
     new File("/home/shipra/oddlines.txt").append(line+"\n")
     
     line_no++
   }
  }
 