public class Point {
    private String label;
    private int x;
    private int y;
    public Point(String label, int x, int y){
        this.label=label;
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return "Point "+ label+" is at x="+x+" y="+y;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Point)){
            return false;
        }
        Point temp=(Point)obj;
        return(this.x==temp.x)&&(this.y==temp.y);
    }

}
