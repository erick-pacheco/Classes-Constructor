class Main {

  /* below is a no-arg constructor */
  public Main() {
  }

  /* methods, instance variables, and class variables would sit in here. */
  public static void main(String[] args) {
    log("Hello World!");
  }

  public static void log(Object message) {
    System.out.println(message);
  }
}