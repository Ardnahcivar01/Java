
class person{
    String name;
    int age;
    double salary;
    person(){
        age = 0;
        salary = 0;
        name = "";
    }
    person(String name){
        this.name = name;
        age = 0;
        salary = 0;
    }
    // constructor with age and name
    person(String name,int age){
        this.name = name;
        this.age = age;
        salary = 0;
    }
    // Constructor with all arguments
    person(String name,int age,double salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    // Getter and setter method
    public String getName() {
        return name;
    }
    
    // public void setName(String name) {
    //     this.name = name;
    // }
    
    public int getAge() {
        return age;
    }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    
    public double getSalary() {
        return salary;
    }
    
    // public void setSalary(float salary) {
    //     this.salary = salary;
    // }
    
    public static void main(String s[]){
        person p1 = new person();
        person p2 = new person("Ravi");
        person p3 = new person("Ravi",18);
        person p4 = new person("Ravi",18,10000.00);

        System.out.println(p4.getName() + " "+ p4.getAge()+" "+p4.getSalary());
        System.out.println(p3.getName()+" "+p3.getAge()+" "+p3.getSalary());
    }

}

