import java.util.ArrayList;

public class BillingSystem {
    ArrayList<Log> ins=new ArrayList<>();
    ArrayList<Log> outs=new ArrayList<>();

//    lists with matching sums and ids
    ArrayList<String> insIds=new ArrayList<>();
    ArrayList<String> outsIds=new ArrayList<>();
    ArrayList<Double> insCosts=new ArrayList<>();
    ArrayList<Double> outsCosts=new ArrayList<>();


    public void addToList(Log log){
        if (log.employee.inOut=='I'){
            ins.add(log);
        }else {
            outs.add(log);
        }
    }
    public void dayReport(String date){
        double insSum=0;
        double outsSum=0;
        for (Log log:ins){
            if (log.date.equals(date)){
                insSum+= log.calculateDayCost();
            }
        }
        for (Log log:outs){
            if (log.date.equals(date)){
                outsSum+= log.calculateDayCost();
            }
        }
        System.out.println("The to total cost for "+date+" :");
        System.out.println("For in house employees :"+insSum+"$");
        System.out.println("For outsourced employees :"+outsSum+"$");

    }
    public void CostInsTotal(String id) {
        double inSum = 0;

        for (Log log : ins) {
            if (log.employee.id.equals(id)) {
                inSum += log.calculateDayCost();
            }
        }
        insIds.add(id);
        insCosts.add( inSum);

    }
//    methods to calculate total cost for employee
    public void CostOutsTotal(String id){
        double outSum=0;
        for (Log log:outs){
            if (log.employee.id.equals(id)){
                outSum+=log.calculateDayCost();
            }
        }
        outsIds.add(id);
        outsCosts.add(outSum);
    }
    private void sortIns() {
        for (int i = 0; i < insCosts.size() - 1; i++) {
            if (insCosts.get(i) > insCosts.get(i + 1)) {
                Double temp = insCosts.get(i);
                insCosts.set(i, insCosts.get(i + 1));
                insCosts.set(i + 1, temp);

                String tempId = insIds.get(i);
                insIds.set(i, insIds.get(i + 1));
                insIds.set(i + 1, tempId);
            }
            for (int j = i; j >= 1; j--) {
                if (insCosts.get(j) < insCosts.get(j - 1)) {
                    Double temp1 = insCosts.get(i);
                    insCosts.set(j, insCosts.get(j - 1));
                    insCosts.set(j - 1, temp1);

                    String tempId1 = insIds.get(i);
                    insIds.set(j, insIds.get(j - 1));
                    insIds.set(j - 1, tempId1);
                }
            }
        }
    }
//    rank employees
    public void sortOuts() {
        for (int i = 0; i < outsCosts.size() - 1; i++) {
            if (outsCosts.get(i) > outsCosts.get(i + 1)) {
                Double temp = outsCosts.get(i);
                outsCosts.set(i, outsCosts.get(i + 1));
                outsCosts.set(i + 1, temp);

                String tempId = outsIds.get(i);
                outsIds.set(i, outsIds.get(i + 1));
                outsIds.set(i + 1, tempId);
            }
            for (int j = i; j >= 1; j--) {
                if (outsCosts.get(j) < outsCosts.get(j - 1)) {
                    Double temp1 = outsCosts.get(i);
                    outsCosts.set(j, outsCosts.get(j - 1));
                    outsCosts.set(j - 1, temp1);

                    String tempId1 = outsIds.get(i);
                    outsIds.set(j, outsIds.get(j - 1));
                    outsIds.set(j - 1, tempId1);
                }
            }
        }
    }

    public void rankingReportIns(){
        sortIns();
        int count=1;
        System.out.println("Ranking report for in house employees");
        for(int i=insCosts.size()-1;i>=0;i--){
            System.out.println(count+". "+insIds.get(i)+" :"+insCosts.get(i)+"$");
            count++;
        }
    }
    public void rankingReportOuts(){
        sortOuts();
        int count=1;
        System.out.println("Ranking report for outsourced employees");
        for(int i=insCosts.size()-1;i>=0;i--){
            System.out.println(count+". "+outsIds.get(i)+" :"+outsCosts.get(i)+"$");
            count++;
        }
    }
    }


