package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();


    builder.append(cameronSaysHello());
    builder.append(evieSaysHello());
    builder.append(kkSaysHello());
    builder.append(nicSaysHello());


    return builder.toString();
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }
  
  private String evieSaysHello() {
    return "Evie says 'Hey!'\n";
  }

  private String cameronSaysHello() {
    return "Cameron says 'Hello!'\n";
  }
}
