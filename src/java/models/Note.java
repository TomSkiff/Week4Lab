
package models;

import java.io.Serializable;

/**
 *
 * @author Thomas Skiffington
 */
public class Note implements Serializable{
    
    private String title;
    private String content;
    
    public Note(){
        title = "This is the title";
        content = "Contents go here";
        
    }
    public Note(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
