package com.equifax.bootsfaces.portlet.bean;

public class DataTableColumn {
    private String header;
    private String property;
    public DataTableColumn(String header, String property) {
        this.header = header;
        this.property = property;
    }
    public String getHeader() {
        return header;
    }
    public String getProperty() {
        return property;
    } 
}
