package Test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycleAnnotation {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		//System.out.println("Inside setter");
		this.value = value;
	}

	public BeanLifeCycleAnnotation() {
		super();
	}

	@Override
	public String toString() {
		return "BeanLifeCycleAnnotation [value=" + value + "]";
	}
	
	@PostConstruct
	public void Start() {
		System.out.println("\nBean Constructed");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("\nBean is About to destroy...");
	}
	
	
}