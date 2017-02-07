package com.dolog.om.wab.mData;

/**
 * Created by Banne-PC on 31/12/2016.
 */

public class SpaceCraft {

    String name,isiText,rinciTxt;
    int image;

    public SpaceCraft(){
    }

    public String getRinciTxt() { return rinciTxt; }

    public void setRinciTxt(String rinciTxt) { this.rinciTxt = rinciTxt; }

    public String getIsiText() {
        return isiText;
    }

    public void setIsiText(String isiText) {
        this.isiText = isiText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
