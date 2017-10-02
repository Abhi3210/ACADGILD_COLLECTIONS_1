import java.util.*;

class Employee{
	
	String empName;
	public Employee(String empName){
		
		this.empName=empName;
	}
}
public class Assignment_1 {
        public static void main(String args[]){
        	HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();
        	Employee e1=new Employee("Assensio");
        	Employee e2=new Employee("Mayoral");
        	Employee e3=new Employee("Isco");
        	Employee e4=new Employee("kroose");
        	
        	map.put(101, e1);
        	map.put(102, e2);
        	map.put(103, e3);
        	map.put(104, e4);
        	for(Map.Entry<Integer, Employee> entry:map.entrySet()){    
                int key=entry.getKey();  
                Employee e=entry.getValue();  
              //  System.out.println(key+" Employee Details:");  
                System.out.println(e.empName);   
            }    
        }
}
