package cw5_05_12_2021;

public class App {
  public static int[] revert(int[] arr) {
    int[] tab = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      tab[arr.length - i - 1] = arr[i];
    }
    return tab;
  }

  public static String arrayToString(int[] arr) {
    String napis = "";
    for (int i = 0; i < arr.length; i++) {
      napis += arr[i] + ",";
    }
    return napis;
  }

  public static int[] getEven(int[] arr) {
    int[] newArr = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        continue;
      }
      newArr[i] += arr[i];
    }

    return newArr;
    // do testowej funkcji w tym zadaniu dozłożyłem p
    // if (arr[i] == 0) {
    // continue;
    // }
    // zeby sie poprawnie wyswietlało

  }

  public static boolean arrayEquals(int[] arr1, int[] arr2) {
    boolean flaga = true;
    if (arr1.length != arr2.length) {
      flaga = false;
    } else {
      for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] != arr2[i]) {
          flaga = false;
        }
      }
    }
    return flaga;
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static boolean isInArray(double[] arr, double num) {
    int ar = 0;
    boolean flaga = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) {
        ar += 1;
      }
    }
    if (ar == 1) {
      flaga = true;
    }
    return flaga;
  }

  public static double getAlgebraicMean(double[] arr) {
    double sum = 0;
    double srednia = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    srednia = sum / arr.length;
    return srednia;
  }

  public static boolean isIncreasing(int[] arr) {
    boolean flaga = false;
    if (arr.length == 1) {
      flaga = false;
    } else {
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] < arr[i + 1]) {
          flaga = true;
        }
      }
    }
    return flaga;
  }
}
