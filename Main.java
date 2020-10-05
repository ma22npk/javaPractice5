class Main {
  public static void main(String[] args) {
    Car car = new Car();
    // carに対してsetNameメソッドを呼び出し、引数に「フェラーリ」を渡してください
    car.setName("フェラーリ");
    // carに対してsetColorメソッドを呼び出し、引数に「赤」を渡してください
    car.setColor("赤");

    Bicycle bicycle = new Bicycle();
    // bicycleに対してsetNameメソッドを呼び出し、引数に「ビアンキ」を渡してください
    bicycle.setName("ビアンキ");

    // bicycleに対してsetColorメソッドを呼び出し、引数に「緑」を渡してください
    bicycle.setColor("緑");

    System.out.println("【車の情報】");
    car.printData();

    System.out.println("-----------------");
    System.out.println("【自転車の情報】");
    bicycle.printData();
  }
}
