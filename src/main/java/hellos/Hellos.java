package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();

    builder.append(kkSaysHello());
    builder.append(nicSaysHello());
    builder.append(phoebeSaysHello());

    return builder.toString();
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String phoebeSaysHello() {
    return "Phoebe says 'Woof-woof!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

}
