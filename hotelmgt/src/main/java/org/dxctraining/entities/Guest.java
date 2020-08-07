package org.dxctraining.entities;
public class Guest {
    private String name;
    private String id;
    public Guest(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public Guest()
    {
        this("","1");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int hashCode() {  //checking hash for the string id;
        int idHash = id.hashCode();
        return idHash;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest that = (Guest) o;
        boolean idequals=this.equals(that.id);
        return idequals;
    }
}
