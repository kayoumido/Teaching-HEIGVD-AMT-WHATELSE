package ch.heigvd.amt.whatelse;

import ch.heigvd.amt.whatelse.api.ICoffee;
import ch.heigvd.amt.whatelse.impl.Yverdoto;

import java.lang.reflect.InvocationTargetException;

public class George {

  /*
   !!!! WARNING !!!!
   The following keywords are STRICTLY FORBIDDEN in this class:
   - if
   - switch
   - case
   - what
   - else

   !!!! WARNING !!!!
   You must write all the code in THIS class to make the tests get green.
   */

  public ICoffee pleasePrepareMeANice(String coffeeName) {
    String prefix = "ch.heigvd.amt.whatelse.impl.";
    String className = prefix + coffeeName;
    try {
      return (ICoffee) Class.forName(className).getConstructor().newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    return null;
  }

}
