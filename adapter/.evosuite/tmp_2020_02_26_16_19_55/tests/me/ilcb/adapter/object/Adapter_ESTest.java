/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 08:32:30 GMT 2020
 */

package me.ilcb.adapter.object;

import org.junit.Test;
import static org.junit.Assert.*;
import me.ilcb.adapter.object.Adapter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Adapter_ESTest extends Adapter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Adapter adapter0 = new Adapter();
      adapter0.request();
  }
}
