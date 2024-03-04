public class Log {
    Employee employee;
    public String date;
    protected double hours;
    protected double rate;
    protected double fixedCost;

    public Log(Employee employee, String date, double hours, double rate) {
        this.employee = employee;
        this.date = date;
        this.hours = hours;
        this.rate = rate;
        if (this.employee.inOut=='I'){
            this.fixedCost=0;
        }else{
            this.fixedCost=10;
        }
    }
    public double calculateDayCost(){
       return (this.hours*this.rate)+fixedCost;
    }

}
