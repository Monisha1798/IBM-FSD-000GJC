package hello_1908;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Set;

import java.util.HashMap;

public class MapDemo {
	private Map<String, String> map;
	
	public MapDemo()
	{
		super();
		map=new TreeMap();
		//map=new HashMap<String, String>();
	}

	public void createMap()
	{
		map.put("name", "Rahul");
	}
	public Set<String> getMapkeys()
	{
		return map.keySet();
	}
	public Collection<String> getMapValues()
	{
		return map.values();
	}
}
