package heashtables;

public class SimpleHashtable {
    private EmployeeHash[] hashtable;

    public SimpleHashtable() {
        hashtable = new EmployeeHash[10];
    }

    public void put(String key, EmployeeHash employee) {
        int hashedKey = hashKey(key);

        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;

            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (occupied(hashedKey)) {
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

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void printHashtable() {
        for (EmployeeHash print: hashtable)
            System.out.println(print);
    }
}
