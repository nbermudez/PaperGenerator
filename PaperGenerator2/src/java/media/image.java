/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

/**
 *
 * @author Alejandro
 */
public class image {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public image(String name, String description){
        this.name = name;
        this.description = description;
    }
}
