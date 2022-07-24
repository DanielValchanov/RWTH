/**
 * Rechteck
 */
public class Rectangle {

    ///Objektattribute
    private int x,y,width,height;//width und height muessen immer positiv sein

    


    //Konstruktoren
    public  ( int xInput , int yInput , int widthInput , int heightInput ){
        this.x=xInput;
        this.y=yInput;
        this.width=widthInput;
        this.height=heightInput;
    }


    public  ( int xInput , int yInput , int sidelengthInput ){
        this.x=xInput;
        this.y=yInput;
        this.width=sidelengthInput;
        this.height=sidelengthInput;
    }

    public copy (Rectangle toCopy) {
        if ( toCopy != null) {
        height =  toCopy.height;
        width =  toCopy.width;
        x =  toCopy.x;
        y=toCopy.y;
        }
        else { // kein  toCopy vorhanden
        height = width = 1;
        x=2;
        y=4;

        }
    }

        //Selektoren
        public void setXKoordinat(int x){
                this.x=x;
        }


        public int getXKoordinat(){
            return this.x;
        }

        public void setYKoordinat(int y){
                    this.y=y;
            }


        public int getYKoordinat(){
                return this.y;
            }

        public void setHeight(int height){
                    this.height=height;
            }


        public int getHeight(){
                return this.height;
            }









   
}