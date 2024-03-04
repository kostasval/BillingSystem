

abstract class Employee {
     String id;
     char inOut;





    public Employee(String id, char inOut) {
        this.id = id;
        this.inOut = inOut;
    }


}
class InHouseEmp extends Employee{
    public InHouseEmp(String id) {
        super(id, 'I');
    }


}
class OutSourcedEmp extends Employee{

    public OutSourcedEmp(String id) {
        super(id, 'O');
    }
}




