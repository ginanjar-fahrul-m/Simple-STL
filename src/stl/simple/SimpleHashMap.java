package stl.simple;

import java.util.HashMap;

/**
 *
 * @author Ginanjar Fahrul M. <ginanjar.fahrul.m@gmail.com>
 * @version 1.0
 * @since   2013-11-20
 * 
 */
public class SimpleHashMap {

    private HashMap<String, Integer> myHashMap;

    /**
     * Initialize HashMap
     */
    public SimpleHashMap() {
        myHashMap = new HashMap<String, Integer>();
    }
    
    /**
     * Add new value(Integer) to map with key(String).
     * 
     * @param key 
     *      key representation 
     * @param value
     *      a value represented by key
     */
    public void addValue(String key, int value){
        myHashMap.put(key, value);
    }
    
    /**
     * Retrieve value(Integer) from map within key(String).
     * @param key
     *      key representation
     * @return 
     *      a value represented by key
     */
    public int getValue(String key){
        return myHashMap.get(key);
    }
}
