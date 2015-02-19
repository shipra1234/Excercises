class HourMinute
 {
    int hour
    int minute
    HourMinute(int hour,int minute)
    {
       this.hour=hour
       this.minute=minute
     }
    
    HourMinute plus(HourMinute h)
     {
       new HourMinute(this.hour + h.hour,this.minute+h.minute)
       
     }
     public String toString()
      {
         return hour+" Hour "+minute +" Minute"
      }
    public static void main(String[]args)
     {
        HourMinute hr=new HourMinute(10,40)
        HourMinute hr1=new HourMinute(20,60)
           HourMinute s=hr+hr1
                   println(s)
                  
      }
  }