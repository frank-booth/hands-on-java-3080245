public class Customer {
  private int id;
  private String name;
  private String username;
  private String passsword;
  private int accountId;

  public Customer (int id, String name, String username, String passsword, int accountId){
    setId(id);
    setName(name);
    setUsername(username);
    setPasssword(passsword);
    setAccountId(accountId);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPasssword() {
    return this.passsword;
  }

  public void setPasssword(String passsword) {
    this.passsword = passsword;
  }

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }
}
