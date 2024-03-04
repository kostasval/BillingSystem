public class Main {
    public static void main(String[] args) {
      InHouseEmp emp1=new InHouseEmp("A17");
        InHouseEmp emp2=new InHouseEmp("B13");


        Log log1=new Log(emp1,"01/03/2024",7.5,22);
        Log log2=new Log(emp2,"02/03/2024",7.6,21);
        Log log11=new Log(emp1,"03/03/2024",7.9,21);
        Log log21=new Log(emp2,"04/03/2024",8,22);

        OutSourcedEmp out1=new OutSourcedEmp("A239");
        OutSourcedEmp out2=new OutSourcedEmp("B26");

        Log logout1=new Log(out1,"01/03/2024",8.5,19);
        Log logout2=new Log(out2,"02/03/2024",8.4,18);
        Log logout11=new Log(out1,"03/03/2024",8.2,20);
        Log logout21=new Log(out2,"01/03/2024",8.4,18);

        BillingSystem billingSystem=new BillingSystem();

        billingSystem.addToList(log1);
        billingSystem.addToList(log2);
        billingSystem.addToList(log11);
        billingSystem.addToList(log21);

        billingSystem.addToList(logout1);
        billingSystem.addToList(logout2);
        billingSystem.addToList(logout11);
        billingSystem.addToList(logout21);


        billingSystem.dayReport("01/03/2024");
      System.out.println("-".repeat(20));


      billingSystem.dayReport("02/03/2024");
      System.out.println("-".repeat(20));

      billingSystem.dayReport("03/03/2024");


        billingSystem.CostInsTotal("A17");
        billingSystem.CostInsTotal("B13");
        billingSystem.CostOutsTotal("A239");
        billingSystem.CostOutsTotal("B26");

        System.out.println("-".repeat(20));
       billingSystem.rankingReportIns();

        System.out.println("-".repeat(20));
        billingSystem.rankingReportOuts();















    }
}