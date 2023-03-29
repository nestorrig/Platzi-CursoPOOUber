class Driver extends Account {
    String userType = "Driver";

    public Driver(Integer id, String name, String document, String email, String password){
        super(id, name, document, email, password);
    }
    void printDataAccountDriver() {
        System.out.println("User type: "+ userType + "| Id: "+ id + "| Name: " + name + "| Document: " + document + "| Email: " + email + "| Password: " + password);
    }
}