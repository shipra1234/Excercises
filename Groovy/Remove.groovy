class Remove
 {
   
    void remove(def f)
     {
        String s= f.replaceAll("\\s+","")
        new File("/home/shipra/write/shi.txt").append(s)
     }
     public static void main(String[]args)
      {
         String con=new File("/home/shipra/write/sh.txt").getText()
         Remove r=new Remove()
                r.remove(con)
       }
       }
  