class DoubleOps {
    public static void main(String[] args) {
      int absolute = Math.abs(Integer.parseInt(args[0]));
      System.out.println("int abs: " + absolute);
  
      double doublePow = Math.pow(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
      System.out.println("double pow: " + doublePow);
  
      double doubleSqrt = Math.sqrt(Double.parseDouble(args[0]));
      System.out.println("double sqrt: " + doubleSqrt);
  
      double random = Math.random();
      System.out.println("double random: " + random);
    }
  }