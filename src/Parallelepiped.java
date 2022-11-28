public class Parallelepiped {
    private double length;
    private double width;
    private double height;


    public Parallelepiped(double length, double width, double height)throws Exception {
      checkInfo(length,width,height);
    }
    private void  checkInfo(double length,double width, double height) throws Exception{
        if (length<0||width<0||height<0||length>20||width>20||height>20){
            throw new Exception();
        }
        else {
            this.length = length;
            this.width = width;
            this.height = height;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void getSquare () {
            System.out.println(2 * ((height * height) + (length * width) + (height * width)));

        }
      public void getVolume(){
    System.out.println((length * width * height));
}


    @Override
    public String toString() {
        return "Parallelepiped{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}