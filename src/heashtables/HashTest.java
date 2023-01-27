package heashtables;

public class HashTest {
    public static void main(String[] args) {

        EmployeeHash gabriel = new EmployeeHash("Gabriel", "Yasuda", 345);
        EmployeeHash laura = new EmployeeHash("Laura", "Cardoso", 87);
        EmployeeHash roger = new EmployeeHash("Roger", "Gracie", 1);
        EmployeeHash jhon = new EmployeeHash("Jhon", "Smith", 12);
        EmployeeHash edgar = new EmployeeHash("Edgar", "Poe", 917);

        SimpleHashtable ht = new SimpleHashtable();

        ht.put("Yasuda", gabriel);
        ht.put("Cardoso", laura);
        ht.put("Gracie", roger);
        ht.put("Poe", edgar);

        ht.printHashtable();

        System.out.println("Retrive key Yasuda: " + ht.get("Yasuda"));
    }
}
