package classes;

public class Book {
    public String display;
    public String author;
    public String title;
    public String sub;
    public String volume;
    public String edition;
    public String genre;
    public String lang;
    public String type;
    public String located;
    public String obs;
    
    public Book(){
    }
    
    public Book(String display, String author, String title, String sub, String volume, String edition, String genre, String lang, String type, String located, String obs){
        this.display = display;
        this.author = author;
        this.title = title;
        this.sub = sub;
        this.volume = volume;
        this.edition = edition;
        this.genre = genre;
        this.lang = lang;
        this.type = type;
        this.located = located;
        this.obs = obs;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocated() {
        return located;
    }

    public void setLocated(String located) {
        this.located = located;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
}
