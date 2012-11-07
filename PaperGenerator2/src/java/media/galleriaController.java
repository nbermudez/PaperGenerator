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
        img = new image(folder+"sps1.jpg", null);
        images.add(img);
        img = new image(folder+"sps2.jpg", null);
        images.add(img);
        img = new image(folder+"teg1.jpg", null);
        images.add(img);
        img = new image(folder+"lcb.jpg", null);
        images.add(img);
        img = new image(folder+"spsc.jpg", null);
        images.add(img);
        img = new image(folder+"ceutecpra.jpg", null);
        images.add(img);
        img = new image(folder+"ceutecpro.jpg", null);
        images.add(img);
        
        img = new image(folder+"01.jpg", null);
        images.add(img);
        img = new image(folder+"02.jpg", null);
        images.add(img);
        img = new image(folder+"03.jpg", null);
        images.add(img);
        img = new image(folder+"04.jpg", null);
        images.add(img);
        img = new image(folder+"11.jpg", null);
        images.add(img);        
    }
}
