public class YZSwapper {
  public static void main(String[] args) {
    printSwappedYZ("yootaxz");
    printSwappedYZ("yanthoxzl");
  }

  public static void printSwappedYZ(String string) {
    String swappedStr = "";

    for (char s : string.toCharArray()) {
      if (s == 'y') {
        swappedStr += 'z';
      } else if (s == 'z') {
        swappedStr += 'y';
      } else {
        swappedStr += s;
      }
    }

    System.err.println(swappedStr);
  }
}
