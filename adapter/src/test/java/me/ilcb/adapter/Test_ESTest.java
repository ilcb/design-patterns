/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 08:32:06 GMT 2020
 */

package me.ilcb.adapter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Test_ESTest extends Test_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      me.ilcb.adapter.Test test0 = new me.ilcb.adapter.Test();
      int[] intArray0 = new int[19];
      intArray0[1] = 55;
      intArray0[2] = 55;
      test0.sort(intArray0, 1, 4);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      me.ilcb.adapter.Test test0 = new me.ilcb.adapter.Test();
      int[] intArray0 = new int[1];
      test0.sort(intArray0, 0, (-1));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      me.ilcb.adapter.Test test0 = new me.ilcb.adapter.Test();
      // Undeclared exception!
      try { 
        test0.sort((int[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("me.ilcb.adapter.Test", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      me.ilcb.adapter.Test test0 = new me.ilcb.adapter.Test();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        test0.sort(intArray0, 0, 7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("me.ilcb.adapter.Test", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      me.ilcb.adapter.Test test0 = new me.ilcb.adapter.Test();
      int[] intArray0 = new int[9];
      intArray0[0] = (-2079);
      intArray0[4] = (-3674);
      test0.sort(intArray0, 0, 7);
      assertArrayEquals(new int[] {(-3674), (-2079), 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[0];
      me.ilcb.adapter.Test.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }
}
