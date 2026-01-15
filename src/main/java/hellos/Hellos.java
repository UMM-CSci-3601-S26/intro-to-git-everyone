package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();
    builder.append(blakeSaysHello());
    builder.append(kkSaysHello());
    builder.append(maxSaysHello());
    builder.append(nicSaysHello());

    return builder.toString();
  }

  private String blakeSaysHello() {
    return "Blake say 'Hello'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private String maxSaysHello() {
    return "Max says 'Hi there!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }
}
