package ba.unsa.etf.rpr.project;

public class Account {
    private String name, surname,email,password,username;



    public Account(String name, String surname, String email, String password, String username) throws IllegalAccount {
        if(name== null || surname==null || email==null || password==null || username==null)
           throw new IllegalAccount("All attributes must be known!");
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalAccount {
        if(name== null)
            throw new IllegalAccount("All attributes must be known!");

        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws IllegalAccount {
        if(surname==null)
            throw new IllegalAccount("All attributes must be known!");

        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalAccount {
        if(email==null)
            throw new IllegalAccount("All attributes must be known!");

        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws IllegalAccount {
        if(password==null)
            throw new IllegalAccount("All attributes must be known!");

        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
