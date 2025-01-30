package com.firatcanyanan.roles;

public enum ERoles {
    ADMIN(1,"admin"),WRITER(2,"writer"),USER(3,"user");
    //Key
    private final Integer key;
    //value
    private final String value;

    private ERoles(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
