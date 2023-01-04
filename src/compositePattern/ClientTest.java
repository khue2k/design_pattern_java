package compositePattern;

public class ClientTest {
    public static void main(String[] args) {
        Boss boss=new Boss("khue",36,10000);
        BusinessAnalyst businessAnalyst=new BusinessAnalyst("duong",27,3000);
        Leader leader=new Leader("xuan",45,5000);
        Developer developer1=new Developer("john",20,2000);
        Developer developer2=new Developer("sam",20,2000);
        Developer developer3=new Developer("jack",20,2000);
        leader.addEmployee(developer1);
        leader.addEmployee(developer2);
        leader.addEmployee(developer3);
        boss.addEmployee(leader);
        boss.addEmployee(businessAnalyst);
        leader.print();
    }
}
