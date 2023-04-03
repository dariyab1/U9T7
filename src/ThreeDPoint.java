public class ThreeDPoint extends Point{
    private int z;
    public ThreeDPoint(String label, int x, int y, int z){
        super(label, x, y);
        this.z=z;
    }

    public String toString(){
        return super.toString()+"z="+z;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof ThreeDPoint)){
            return false;
        }
        ThreeDPoint temp=(ThreeDPoint)obj;
        return super.equals(obj)&&this.z==temp.z;
    }
}
