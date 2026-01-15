package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();
    builder.append(asaSaysHello());
    builder.append(blakeSaysHello());
    builder.append(cameronSaysHello());
    builder.append(elijahSaysHello());
    builder.append(evieSaysHello());
    builder.append(gabeSaysHello());
    builder.append(harleySaysHello());
    builder.append(kkSaysHello());
    builder.append(katelynSaysHello());
    builder.append(maxSaysHello());
    builder.append(nicSaysHello());
    builder.append(phoebeSaysHello());
    builder.append(pierceSaysHello());
    builder.append(pounceSaysHello());
    builder.append(thatcherSaysHello());
    builder.append(tylerSaysHello());

    return builder.toString();
  }

  private Object pounceSaysHello() {
    return "Pounce says 'Go Cougars!'\n";
  }

  private String blakeSaysHello() {
    return "Blake says 'Hello!'\n";
  }

  private String elijahSaysHello() {
    return "Elijah says 'Hello People!'\n";
  }

  private String gabeSaysHello() {
    return "Gabe says 'Hi Classmates!'\n";
  }

  private String phoebeSaysHello() {
    return "Phoebe says 'Woof-woof!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private String evieSaysHello() {
    return "Evie says 'Hey!'\n";
  }

  private String asaSaysHello() {
    return "Asa says 'Hi!'\n";
  }

  private String harleySaysHello() {
    return "Harley says 'Hey!'\n";
  }

  private String cameronSaysHello() {
    return "Cameron says 'Hello!'\n";
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

  private String maxSaysHello() {
    return "Max says 'Hi there!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }
}
