package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(kkSaysHello());
    builder.append(katelynSaysHello());
    builder.append(nicSaysHello());
    builder.append(pierceSaysHello());
    builder.append(thatcherSaysHello());
    builder.append(tylerSaysHello());

    return builder.toString();
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private String tylerSaysHello() {
    return "Tyler says 'Howdy!'\n";
  }

  private String thatcherSaysHello() {
    return "Thatcher says 'Hey!'\n";
  }
  private String pierceSaysHello() {
    return "Pierce says 'Salutations!'\n";// This is a comment!
  }

  private String katelynSaysHello() {
    return "Katelyn says 'Hi!'\n";
  }

}
