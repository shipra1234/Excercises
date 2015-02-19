class Employee
 {
    String name
    int age
    long salary
    String dept_name
    int emp_no
    
    public String toString()
     {
       return name
     }
    
  }
  List l=[new Employee(name:"shipra",age:19,salary:6000,dept_name:"developer",emp_no:101),new Employee(name:"shaily",age:24,salary:30000,dept_name:"developer",emp_no:102),new Employee(name:"manu",age:23,salary:30000,dept_name:"marketing",emp_no:103)]
  println(l.countBy({emp->emp.dept_name}))
  println(l.each{emp->emp.age>18 && emp.age<35})
  println(l.sort({emp->emp.name}))
  println(l.groupBy({emp->
  if(emp.dept_name && emp.age>20){
 "adult"
  }else{
  "Under age"}
  }))
  println(l.groupBy({emp->
   if(emp.salary<5000){
   "[0-5000]"
   }
  else if(emp.salary>5000 && emp.salary<10000){
   "[5000-10000]"
   }
    else
    {
      "[10000-40000]"
    }
  }))
  