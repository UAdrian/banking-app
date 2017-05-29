package classes;

public class Account {
  private static String type;
  private static String number;
  private static Double balance;

  public Account(String type2, String number2, Double balance2) {
    super();
    type = type2;
    number = number2;
    balance = balance2;
  }

  public static String getType() {
    return type;
  }

  public static String getNumber() {
    return number;
  }

  public static Double getBalance() {
    return balance;
  }
}
