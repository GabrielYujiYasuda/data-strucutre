package heashtables;

public class SimpleHashtable {
    private EmployeeHash[] hashtable;

    public SimpleHashtable() {
        hashtable = new EmployeeHash[10];
    }

    public void put(String key, EmployeeHash employee) {
        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null) {
            System.out.println("Sorry, there's an employee at position " + hashedKey);
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    public EmployeeHash get(String key) {
        int hashedKey = hashKey(key);

        return hashtable[hashedKey];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashtable() {
        for (EmployeeHash print: hashtable)
            System.out.println(print);
    }
}
