package Test;


import org.springframework.beans.factory.DisposableBean;

import org.springframework.beans.factory.InitializingBean;

// we have Created a  class Employee which implements
// two interfaces by name InitializingBean and DisposableBean
// these interfaces has two methods as : afterPropertiesSet() and 
// destroy(). 
public class Employee implements InitializingBean, DisposableBean{

 private String name;
 private int age;

 public Employee() {

 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 // This method is called to provide some initialization to 
 public void afterPropertiesSet() throws Exception {  
  System.out.println("Initializing the Employee bean ...");  
 }

 // This method is called to destroy a bean by Spring Framework container
 public void destroy() throws Exception {
  System.out.println("Destroying the Employee bean ...");
 }

}
