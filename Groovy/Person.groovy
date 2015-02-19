package com.groovy
class Person extends Per
  {
     int id
     long salary
     String company
     
     public void setId(int id )
     {
        this.id=id
      }
      public int getId()
      {
        return id
      }
       public void setSalary(long salary )
     {
        this.salary=salary
      }
      public long getSalary()
      {
        return salary
      }
       public void setCompany(String company )
     {
        this.company=company
      }
      public String getCompany()
      {
        return company+"ttn"
      }
      public void display()
       {
          println("${id}")
          println("${salary}")
      
        }
      
      public static void main(String[]args)
     {
       Person p=new Person()
              p.name="shipra"
              p.age=23
              p.gender="female"
              p.id=101
              p.salary=20000
              p.company="intelligrape"
            
              p.cal()
              p.display()
               println(p.@company)
     }
   }