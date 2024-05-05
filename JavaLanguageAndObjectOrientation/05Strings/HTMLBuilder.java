public class HTMLBuilder {
  static String htmlElement(String tag, String body) {
    String result = "";
    if (tag != null && !tag.isEmpty()) {
      result = String.format("<%s>%s</%s>", tag, body != null ? body : "", tag);
    }
    return result.toString();
  }

  static String strong(String str) {
    return formatTag("strong", str);
  }

  static String emphasized(String str) {
    return formatTag("em", str);
  }

  static String formatTag(String tagName, String content) {
    if (content != null && !content.isEmpty()) {
      return String.format("<%s>%s</%s>", tagName, content, tagName);
    }
    return String.format("<%s></%s>", tagName, tagName);
  }

  public static void main(String[] args) {
    System.out.println( htmlElement( "strong", "strong is bold" ) );
    System.out.println( strong( emphasized( "strong + emphasized" ) ) );
    System.out.println( htmlElement( "span", null ) );
    System.out.println( htmlElement( "", "no" ) );
    System.out.println( htmlElement( null, "not bold" ) );
    System.out.println( htmlElement( null, null ) );
  }
}
