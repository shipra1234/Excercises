class Employee
 {
   String name
   int age
   int salary
   
   public String toString()
    {
        return name
     }
  }
  List l=[new Employee(name:"shipra",age:20,salary:20000),new Employee(name:"komal",age:25,salary:40000),new Employee(name:"kanchan",age:27,salary:10000),new Employee(name:"manu",age:26,salary:50000)]
    println l.groupBy{emp->if(emp.age>=20 && emp.age<=25){
    "[20-25]"
    }
    else if(emp.age>=26 && emp.age<=30)
     {
       "[25-30]"
     }
    } 