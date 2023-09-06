
class GetteSetter {
    public static void main(String[] args) {

        GetSet obj = new GetSet();
        // Setting the name by calling setter method
        obj.setName("Nitish Kumar");
        // Getting the name by calling getter method
        System.out.println(obj.getName());
    }
}

class GetSet {

    // Member variable of this class
    private String name;

    // Method 1 - Getter
    public String getName() {
        return name;
    }

    // Method 2 - Setter
    public void setName(String N) {
        this.name = N;
    }
}