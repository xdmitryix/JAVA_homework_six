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

    @Override
    public String toString() {
        String res = String.format("OZU:%dgb HardDisk:%dgb OS:%s Color:%s", ozu, hardDisk, OS, color);
        return res;
    }
    




    // 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
}
