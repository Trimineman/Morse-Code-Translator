import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char selected;
    System.out.println("Welcome to the Morse code translator by Trimineman. If you would like to translate TO Morse code, type TO. If you would like to translate FROM Morse code, type FROM.");
    String choice = sc.next();
    switch (choice) {
      case "TO":
      String theCode;
      System.out.println("Please enter what you would like to translate.");
      sc.nextLine();
      theCode = sc.nextLine();
      for (int i = 0; i < theCode.length(); i++) {
        selected = theCode.charAt(i);
        selected = Character.toLowerCase(selected);
        switch(selected) {
          case 'a':
            System.out.print(".-");
            break;
          case 'b':
            System.out.print("-...");
            break;
          case 'c':
            System.out.print("-.-.");
            break;
          case 'd':
            System.out.print("-..");
            break;
          case 'e':
            System.out.print(".");
            break;
          case 'f':
            System.out.print("..-.");
            break;
          case 'g':
            System.out.print("--.");
            break;
          case 'h':
            System.out.print("....");
            break;
          case 'i':
            System.out.print("..");
            break;
          case 'j':
            System.out.print(".---");
            break;
          case 'k':
            System.out.print("-.-");
            break;
          case 'l':
            System.out.print(".-..");
            break;
          case 'm':
            System.out.print("--");
            break;
          case 'n':
            System.out.print("-.");
            break;
          case 'o':
            System.out.print("---");
            break;
          case 'p':
            System.out.print(".--.");
            break;
          case 'q':
            System.out.print("--.-");
            break;
          case 'r':
            System.out.print(".-.");
            break;
          case 's':
            System.out.print("...");
            break;
          case 't':
            System.out.print("-");
            break;
          case 'u':
            System.out.print("..-");
            break;
          case 'v':
            System.out.print("...-");
            break;
          case 'w':
            System.out.print(".--");
            break;
          case 'x':
            System.out.print("-..-");
            break;
          case 'y':
            System.out.print("-.--");
            break;
          case 'z':
            System.out.print("--..");
            break;
          case '0':
            System.out.print("-----");
            break;
          case '1':
            System.out.print(".----");
            break;
          case '2':
            System.out.print("..---");
            break;
          case '3':
            System.out.print("...--");
            break;
          case '4':
            System.out.print("....-");
            break;
          case '5':
            System.out.print(".....");
            break;
          case '6':
            System.out.print("-....");
            break;
          case '7':
            System.out.print("--...");
            break;
          case '8':
            System.out.print("---..");
            break;
          case '9':
            System.out.print("----.");
            break;
          case '&':
            System.out.print(".-...");
            break;
          case '\'':
            System.out.print(".----.");
            break;
          case '@':
            System.out.print(".--.-.");
            break;
          case ')':
            System.out.print("-.--.-");
            break;
          case '(':
            System.out.print("-.--.");
            break;
          case ':':
            System.out.print("---...");
            break;
          case ',':
            System.out.print("--..--");
            break;
          case '=':
            System.out.print("-...-");
            break;
          case '!':
            System.out.print("-.-.--");
            break;
          case '.':
            System.out.print(".-.-.-");
            break;
          case '-':
            System.out.print("-....-");
            break;
          case '+':
            System.out.print(".-.-.");
            break;
          case '\"':
            System.out.print(".-..-.");
            break;
          case '?':
            System.out.print("..--..");
            break;
          case ' ':
            System.out.print("/");
            break;
          default:
            System.out.print("?");
            break;

        }
        System.out.print(" ");
      }
      break;
      case "FROM":
        System.out.println("Type the Morse code that you would like to translate back to English. Use spaces in between letters and slashes with spaces on each side for spaces.");
        sc.nextLine();
        theCode = sc.nextLine();
        String[] words = theCode.split(" ");
        for (int a = 0; a < words.length; a++) {
          switch (words[a]) {
            case "/":
              System.out.print(" ");
              break;
            case ".-":
              System.out.print("a");
              break;
            case "-...":
              System.out.print("b");
              break;
            case "-.-.":
              System.out.print("c");
              break;
            case "-..":
              System.out.print("d");
              break;
            case ".":
              System.out.print("e");
              break;
            case "..-.":
              System.out.print("f");
              break;
            case "--.":
              System.out.print("g");
              break;
            case "....":
              System.out.print("h");
              break;
            case "..":
              System.out.print("i");
              break;
            case ".---":
              System.out.print("j");
              break;
            case "-.-":
              System.out.print("k");
              break;
            case ".-..":
              System.out.print("l");
              break;
            case "--":
              System.out.print("m");
              break;
            case "-.":
              System.out.print("n");
              break;
            case "---":
              System.out.print("o");
              break;
            case ".--.":
              System.out.print("p");
              break;
            case "--.-":
              System.out.print("q");
              break;
            case ".-.":
              System.out.print("r");
              break;
            case "...":
              System.out.print("s");
              break;
            case "-":
              System.out.print("t");
              break;
            case "..-":
              System.out.print("u");
              break;
            case "...-":
              System.out.print("v");
              break;
            case ".--":
              System.out.print("w");
              break;
            case "-..-":
              System.out.print("x");
              break;
            case "-.--":
              System.out.print("y");
              break;
            case "--..":
              System.out.print("z");
              break;
            case "-----":
              System.out.print("0");
              break;
            case ".----":
              System.out.print("1");
              break;
            case "..---":
              System.out.print("2");
              break;
            case "...--":
              System.out.print("3");
              break;
            case "....-":
              System.out.print("4");
              break;
            case ".....":
              System.out.print("5");
              break;
            case "-....":
              System.out.print("6");
              break;
            case "--...":
              System.out.print("7");
              break;
            case "---..":
              System.out.print("8");
              break;
            case "----.":
              System.out.print("9");
              break;
            case ".-...":
              System.out.print("&");
              break;
            case ".----.":
              System.out.print('\'');
              break;
            case ".--.-.":
              System.out.print("@");
              break;
            case "-.--.-":
              System.out.print(")");
              break;
            case "-.--.":
              System.out.print("(");
              break;
            case "---...":
              System.out.print(":");
              break;
            case "--..--":
              System.out.print(", ");
              break;
            case "-...-":
              System.out.print("=");
              break;
            case "-.-.--":
              System.out.print("!");
              break;
            case ".-.-.-":
              System.out.print(". ");
              break;
            case "-....-":
              System.out.print("-");
              break;
            case ".-.-.":
              System.out.print("+");
              break;
            case ".-..-.":
              System.out.print('\"');
              break;
            case "..--..":
              System.out.print("?");
              break;
            default:
              System.out.print("?");
              break;
          }
        }
      break;
    default:
      System.out.println("Not an accepted input.");
      break;
    }
  }
}
