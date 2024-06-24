package com.twk.restservice;

import java.util.HashMap;
import java.util.Map;

public class CRUD {
    private Map<String, String> dataStore = new HashMap<>();

    public void create(String key, String value) {
        dataStore.put(key, value);
    }

    public String read(String key) {
        return dataStore.get(key);
    }

    public void update(String key, String value) {
        dataStore.put(key, value);
    }

    public void delete(String key) {
        dataStore.remove(key);
    }
}
