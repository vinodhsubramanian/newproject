package com.cisco;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.cicso.api.Service;
import com.cicso.impl.ServiceImpl;

public class ServiceImplTest {
    
  @Test(groups = { "add1" })
  public void testMethod1(){
	  Service service = new ServiceImpl();
	  int result = service.method1(1, 2);
      Assert.assertEquals(result, 3);
  }
  
  @Test(groups = { "add1" })
  public void testMethod2(){
	  Service service = new ServiceImpl();
	  int result = service.method2(1, 2);
      Assert.assertEquals(result, 3);
  }
  @Test(groups = { "multiple" })
  public void testMethod3(){
	  Service service = new ServiceImpl();
	  int result = service.method3(1, 2, 1);
      Assert.assertEquals(result, 2);
  }
  @Test(groups = { "multiple" })
  public void testMethod4(){
	  Service service = new ServiceImpl();
	  int result = service.method4(1, 2, 1);
      Assert.assertEquals(result, 2);
  }
  @Test(groups = { "custom" })
  public void testMethod5(){
	  Service service = new ServiceImpl();
	  int result = service.method5(1, 2, 1);
      Assert.assertTrue(true);
  }
  @Test(groups = { "custom" })
  public void testMethod6(){
	  Service service = new ServiceImpl();
	  int result = service.method6(1, 2, 1);
	  Assert.assertTrue(true);
  }
  
}
