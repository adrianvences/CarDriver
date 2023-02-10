public class Driver extends Car {
  public static void main(String[] args) {
    
  }

  public void drive(){
    this.setGas(getGas()-1);
    System.out.println(getGas());
  }

  public void boost() {
    this.setGas(getGas()-3);
  }

    public void refuel(){
      this.setGas(getGas()+2);
    }
  

  // public void showGas() {
  //   System.out.println(this.getGas());
  // }
}
