class User extends Account {
    String userType = "User";

    public User(Integer id, String name, String document, String email, String password){
        super(id, name, document, email, password);
    }
    void printDataAccountUser() {
        System.out.println("User type: "+ userType + "| Id: "+ id + "| Name: " + name + "| Document: " + document + "| Email: " + email + "| Password: " + password);
    }
}