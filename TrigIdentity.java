class TrigIdentity {
    public static void main(String[] args) {
      double theta = Double.parseDouble(args[0]);
      System.out.println(Math.round((Math.pow(Math.sin(theta),2)) + (Math.pow(Math.cos(theta),2))));
    }
  }