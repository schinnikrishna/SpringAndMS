package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource({"com/nt/comman/info2.properties","com/nt/comman/info.properties"})
public class PersonInfo {
	
	// from Properties file
	@Value("${per.id}")
	private int pid;
	
	@Value("${per.name}")
	private String name;
	
	@Value("${per.addrs}")
	private String addrs;
	
	// hard coded value
	@Value("10000.00")
	private double sal;
	
	// from System Properties
	@Value("${os.name}")
	private String osName;
	
	@Value("${os.version}")
	private String osVersion;
	
	// from Environment variables
	@Value("${JAVA_HOME}")
	private String javaHome;

	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", name=" + name + ", addrs=" + addrs + ", sal=" + sal + ", osName=" + osName
				+ ", osVersion=" + osVersion + ", javaHome=" + javaHome + "]";
	}

	
	
	

}
