public class noteBook {
    
    private int ozu;
    private int hardDisk;
    private String OS;
    private String color;

    public noteBook(int ozu, int hardDisk, String OS, String color){
        this.ozu = ozu;
        this.hardDisk = hardDisk;
        this.OS = OS;
        this.color = color;
    }


    public int getOzu() {
        return ozu;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String res = String.format("OZU:%dgb HardDisk:%dgb OS:%s Color:%s", ozu, hardDisk, OS, color);
        return res;
    }
}
