package beans;

import java.io.Serializable;

public class Artist implements Serializable {
    private long id;
    private String name;
    private boolean isBand;
    private String language;

    public Artist() {
    }

    public Artist(long id, String name, boolean isBand, String language) {
        this.id = id;
        this.name = name;
        this.isBand = isBand;
        this.language = language;
    }

    public Artist(String name, boolean isBand, String language) {
        this.name = name;
        this.isBand = isBand;
        this.language = language;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBand() {
        return isBand;
    }

    public void setBand(boolean band) {
        isBand = band;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
