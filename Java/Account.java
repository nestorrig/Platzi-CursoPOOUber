class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(Integer id, String name, String document, String email, String password){
        this.id = id;
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;
    }
    void printDataAccount() {
        System.out.println("Id: "+ id + "| Name: " + name + "| Document: " + document + "| Email: " + email + "| Password: " + password);
    }
}