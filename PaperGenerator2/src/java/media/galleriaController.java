/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Alejandro
 */
@ManagedBean(name="galleria")
@SessionScoped
public class galleriaController {
    private ArrayList<image> images;

    public ArrayList<image> getImages() {
        return images;
    }

    public void setImages(ArrayList<image> images) {
        this.images = images;
    }
    
    public galleriaController(){
        images = new ArrayList<image>();
        image img;
        String folder = "";
        img = new image(folder+"unitec sps.png", null);
        images.add(img);
        img = new image(folder+"unitec tga.png", null);
        images.add(img);
        img = new image(folder+"ceutec sps.png", null);
        images.add(img);
        img = new image(folder+"ceutec tga.png", null);
        images.add(img);
        img = new image(folder+"ceutec tga2.png", null);
        images.add(img);
        img = new image(folder+"ceutec la ceiba.png", null);
        images.add(img);
        
        img = new image(folder+"render1.png", null);
        images.add(img);
        img = new image(folder+"render2.png", null);
        images.add(img);
    }
}
