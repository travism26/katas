package org.travis.blogExample;

import java.util.HashMap;
import java.util.Map;

public class input implements InputInterface {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.travis.blogExample.InputInterface#getAll() NOTES on how i would
	 * like my input to be handle this is just a visual view of how i would like
	 * the methods to be called. I will be using an associative array like
	 * implementation.
	 * 
	 * EXAMPLES
	 * 
	 * Input input = new Input();
	 * 
	 * String someValue = input.get("someValue"); HashMap<String, Object>
	 * allInput = input.getAll();
	 */

	HashMap<Object, Object> input;

	public input()
	{
		input = new HashMap();
	}

	@Override
	public Map<Object, Object> getAll()
	{
		return input;
	}

	/*
	 * Only downside to code to the object class is we will need to cast all out
	 * return call data to the correct type set :( not really that big of an
	 * issue IMO keeps the code flexible.
	 */
	@Override
	public Object get(String value)
	{
		return input.get(value);
	}

	@Override
	public void put(String key, Object value)
	{
		if (!key.isEmpty() || !value.equals(null))
		{
			//return the original input no change.
			return;
		}
		input.put(key, value);
	}

	@Override
	public void putAll(Map<String, Object> value)
	{
		if(value.isEmpty()){
			return;
		}
		input.putAll(value);
	}

}
