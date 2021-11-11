package Test;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
private String Subject;

public String getSubject() {
	return Subject;
}

public void setSubject(String subject) {
	Subject = subject;
}

public Example() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Example [Subject=" + Subject + "]";
}
@PostConstruct // we have added the dependencies for @postcondstruct and @predestroy because its not availabe in above java 8  
//and aslo enable the annotation of the spring with the help of the <context:annotation-config/> pasting in xml file
public void start()
{
	System.out.println("Starting method of the example ");

}
@PreDestroy
public void end()
{
	System.out.println("Ending method of the example");
}
}