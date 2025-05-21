public class Student{
	private int id;
	private String name;
	private int attendance;

public Student(int Id,String Name,int attendance){
  this.id=id;
  this.Name=Name;
  this.attendance=attendance;
}
public int getid(){
  return id;
}
public String getName(){
  return Name;
}
public int getattendance(){
  return attendance;
}
public void setid(int id){
  this.id=id;
}
public void setName(String name){
  this.Name=Name;
}
public void setattendance(int attendance){
  this.attendance=attendance;
}

public static void main (String[] args)
  {
    System.out.println("ID "+id+"Name "+Name+"attendance "+attendance);
  }
}
  
	
