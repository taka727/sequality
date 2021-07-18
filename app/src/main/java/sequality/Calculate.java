package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int tosum(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public int oddevensum(int x, int y,int z) {
    int sum = 0;
    if (z == 1) {
      for (int i = x; i <= y; i++) {
        if (i % 2 == 1) {
          sum += i;
        }
      }
    } else {
      for (int i = x; i <= y; i++) {
        if (i % 2 == 0) {
          sum += i;
        }
      }
    }
    return sum;
  }

  public double average(int x, int y) {
    double ave;
    ave = (double)x / y;
    return ave;
  }
}
