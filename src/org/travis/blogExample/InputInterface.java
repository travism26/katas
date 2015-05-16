package org.travis.blogExample;

import java.util.Map;

public interface InputInterface {
	public Map<String, String> getAll();
	
	public Object get(String value);
	
}
