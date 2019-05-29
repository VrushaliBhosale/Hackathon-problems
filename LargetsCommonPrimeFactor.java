class LargestCommonPrimeFactor {

  public boolean isPrime(int num) {
    if (num == 1)
      return false;
    if (num == 2)
      return true;
    if ((num > 2) && (num % 2 == 0))
      return false;
    for (int k = 3; k <= Math.sqrt(num) && k % 2 != 0; k++) {
      if (num % k == 0) {
        return false;
      }
    }
    return true;

  }

  public static void main(String[] args) {
    int n1 = 18, n2 = 9, largest = 0;

    LargestCommonPrimeFactor obj = new LargestCommonPrimeFactor();
    for (int i = 1; i <= (n1 > n2 ? n2 : n1); i++) {
      if ((n1 % i == 0) && (n2 % i == 0)) {
        if (obj.isPrime(i)) {
          if (i > largest)
            largest = i;
        }
      }
    }
    if (largest != 0)
      System.out.print("Largets common prime factor between " + n1 + " and " + n2 + " is :" + largest);
    else
      System.out.print("No common priime factors");
  }
}