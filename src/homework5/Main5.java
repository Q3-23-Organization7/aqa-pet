package homework5;

public class Main5 {
    public static void main(String[] args) {
      String teNet1 = "te1n1et";
      char[] myPalindrome = teNet1.toCharArray();
      int index = myPalindrome.length;
      boolean yesitis = true;
      for (int i = 0; i < index/2; i++) {
          if (myPalindrome[i] != myPalindrome[index - i - 1]) {
              yesitis = false;
              break;
          }
      }
      if (yesitis){
              System.out.println("It is a Palindrome");
      }
      else {
              System.out.println("It is not a Palindrome");
      }
      int[] miniMaxi = {1,-5,2,9,6,4};
      int min5 = miniMaxi[0];
      int max5 = miniMaxi[0];
      for (int i = 0; i < miniMaxi.length; i++) {
          if (miniMaxi[i] < min5) {
              min5 = miniMaxi[i];
          }
          if (miniMaxi[i] > max5){
              max5 = miniMaxi[i];
          }
      }
      System.out.println("Min value: "+ min5);
      System.out.println("Max value: "+ max5);
      for (int i = 0; i < miniMaxi.length; i++) {
          if (miniMaxi[i] % 2 == 0){
              miniMaxi[i] = 0;
          }
          System.out.println(miniMaxi[i]);
      }
      System.out.println("Sin(x)");
      for (int i = 0, step5 = 0; i < 37; i++, step5+=10){
          double sinx = Math.sin(step5);
          System.out.println("sin " + step5 + " " + sinx);
      }
      int[][] hw5 = {{-2,4,5}, {3,7,3}, {-7,-8,3}};
      int count5 = 0;
      int sum5 = 0;
      int lenght5 = hw5.length;
      for (int i = 1; i < lenght5; i++){
          for (int j = 0; j < i; j++){
             if (hw5[i][j] < 0) {
                  count5++;
              }
          }
        }
        for (int i = 0; i < lenght5; i++){
            for (int j = i + 1; j < lenght5; j++){
                if (hw5[i][j] % 2 != 0) {
                    sum5+= hw5[i][j];
                }
            }
        }
        System.out.println("Count = " + count5);
        System.out.println("Sum = " + sum5);
    }
}