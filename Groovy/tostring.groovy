class Emp
 {
   int id
   String name
   int age
   String gender
   String city
   String company
   public String toString()
    {
      return "name is a ${gender} aged ${age} who lives at  ${city}. He works for ${company} with employee id  ${id}  and draws \$\$\$\$\$ lots of money !!!"
     }
   public static void main(String[]args)
    { 
       Emp e=new Emp()
        e.name="sachin"
        e.id=12
        e.age=20
        e.gender="man"
        e.city="Delhi"
        e.company="intelligrape"
        println(e)
     }
  }