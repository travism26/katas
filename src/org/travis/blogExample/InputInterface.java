package org.travis.blogExample;

import java.util.Map;

public interface InputInterface {
	public Map<Object, Object> getAll();
	
	public Object get(String value);
	
	public void put(String key, Object value);
	
	public void putAll(Map<String, Object> value);
	
	
}
