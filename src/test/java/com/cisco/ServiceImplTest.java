package com.cisco;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.cicso.api.Service;
import com.cicso.impl.ServiceImpl;

public class ServiceImplTest {
  @Test
  public void f() {
  }
  
  @Test
  public void testMethod1(){
	  Service service = new ServiceImpl();
	  int result = service.method1(1, 2);
      Assert.assertEquals(result, 3);
  }
  
  @Test
  public void testMethod2(){
	  Service service = new ServiceImpl();
	  int result = service.method2(1, 2);
      Assert.assertEquals(result, 3);
  }
  
}
