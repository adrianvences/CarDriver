public class Main {
  public static void main(String[] args) {
    Driver d = new Driver();
    // System.out.println(d.getGas());
    d.drive();

    d.boost();
    System.out.println(d.getGas());

    d.refuel();
    System.out.println(d.getGas());
  }


}
