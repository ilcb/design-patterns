/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 08:32:47 GMT 2020
 */

package me.ilcb.adapter.object;

import org.junit.Test;
import static org.junit.Assert.*;
import me.ilcb.adapter.object.Adaptee;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Adaptee_ESTest extends Adaptee_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Adaptee adaptee0 = new Adaptee();
      adaptee0.specialRequest();
  }
}
