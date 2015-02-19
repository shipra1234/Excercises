class Emp
 {
   String name
   int age
   def salary
   String deptName
   int EmpNumber
   Emp(String name,int age,def salary,String deptName,int EmpNumber)
   {
     this.name=name
     this.age=age
     this.salary=salary
     this.deptName=deptName
     this.EmpNumber=EmpNumber
   }
  public String toString()
  {
    return name
  }
   
   public static void main(String[]args)
   {
    List l=[new Emp("manu",18,5000,"developing",101),new Emp("shaily",23,5000,"developing",102),new Emp("jitin",40,30000,"Engineering",103)]
    println(l.groupBy({emp->emp.deptName}))
    println(l.countBy({emp->emp.deptName}))
    println(l.findAll({emp->emp.age>18 && emp.age<35}))
    println(l.sort({emp->emp.name}))
    println(l.groupBy({emp-> return emp.salary}))
   
   }
 }