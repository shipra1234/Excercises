package com.groovy
class Per
 {
   String name
   int age
   String gender
   String address
   public void setName(String name)
    {
       this.name=name
     }
     
     public String getName()
      {
         return name
      }
       public void setAge(int age)
    {
       this.age=age
     }
     
     public int getAge()
      {
         return age
      }
       public void setGender(String gender)
    {
       this.gender=gender
     }
     
     public String getGender()
      {
         return gender
      }
       public void setAddress(String address)
    {
       this.address=address
     }
     
     public String getAddress()
      {
         return address+"shipra"
      }
      public void cal()
       {
          println("${name}")
          println("${age}")
          println("${gender}")
     
         
        }
      public static void main(String[]args)
       {
          Per p=new Per()
             p.name="shipra"
              p.age=23
              p.gender="female"
              p.address="Delhi"
             
              p.cal()
               println(p.@address)
              
       
        }
  }