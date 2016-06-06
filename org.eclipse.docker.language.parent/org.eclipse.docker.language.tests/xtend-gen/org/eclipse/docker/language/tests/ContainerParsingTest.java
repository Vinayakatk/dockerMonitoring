/**
 * generated by Xtext 2.9.1
 */
package org.eclipse.docker.language.tests;

import com.google.inject.Inject;
import org.eclipse.docker.language.container.Docker;
import org.eclipse.docker.language.tests.ContainerInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ContainerInjectorProvider.class)
@SuppressWarnings("all")
public class ContainerParsingTest {
  @Inject
  private ParseHelper<Docker> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final Docker result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}