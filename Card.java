
package bprm;

/**
 *
 * @author kaveh
 */
public class Card {
    private String front;
    private String back;
    private String imagef;
    private String imageb;
    public int ID;
    //-----------------------------
    public Card(String q,String a,String imq,String ima)
    {
        this.front=q;
        this.back=a;
        this.imagef=imq;
        this.imageb=ima;
    }

    Card(Card get) {
        this.front=get.getFront();
        this.back=get.getBack();
        this.imagef=get.getImagef();
        this.imageb=get.getImageb();
    }
    public String getImagef()
    {
        return imagef;
    }
     public String getImageb()
    {
        return imageb;
    }
    public String getFront()
    {
        return front;
    }
    public String getBack()
    {
        return back;
    }
    //------------------------------
    public void setImagef(String str)
    {
        imagef=str;
    }
    public void setImageb(String str)
    {
        imageb=str;
    }
    public void setFront(String str)
    {
        front=str;
    }
    public void setBack(String str)
    {
        back=str;
    }
    //-----------------------------
}
