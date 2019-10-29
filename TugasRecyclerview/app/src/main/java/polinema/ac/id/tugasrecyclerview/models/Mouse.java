package polinema.ac.id.tugasrecyclerview.models;

public class Mouse {
    public String NamaMouse;
    public String DetailMouse;
    public int mouse;

    public Mouse(String namaMouse, String DetailMouse, int mouse){
        this.NamaMouse = NamaMouse;
        this.DetailMouse = DetailMouse;
        this.mouse = mouse;
    }

    public  String getNamaMouse(){
        return NamaMouse;
    }

    public void  setNamaMouse(String namaMouse){
        NamaMouse = namaMouse;
    }

    public String getDetailMouse(){
        return DetailMouse;
    }

    public void  setDetailMouse(String detailMouse){
        DetailMouse = detailMouse;
    }

    public int getMouse(){
        return mouse;
    }

    public void setMouse(int mouse){
        this.mouse = mouse;
    }
}
