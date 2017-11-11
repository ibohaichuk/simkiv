package lesson7;

public class Plants {
    private int size;
    private Color color;
    private Type type;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Plants(int size, String color, String type) throws TypeException, ColorException{
        Color c = compareInputColorWithColorEnum(color);
        Type t = compareInputTypeWithTypeEnum(type);
        this.size = size;
        this.color = c;
        this.type = t;
    }

    public Plants() {
    }

    @Override
    public String toString() {
        return "Size: " + size + "; Color: " + color.toString() + "; Type: " + type.toString();
    }

    Color compareInputColorWithColorEnum(String color) throws ColorException{
        switch (color.toLowerCase()){
            case "purple": {
                return Color.PURPLE;
            }case "red": {
                return Color.RED;
            }case "white":{
                return Color.WHITE;
            }default:{
                throw new ColorException("Input only purple, red or white color");
            }
        }
    }

    Type compareInputTypeWithTypeEnum(String type) throws TypeException{
        switch (type.toLowerCase()){
            case "rose": {
                return Type.ROSE;
            }case "orchid": {
                return Type.ORCHID;
            }case "tulip":{
                return Type.TULIP;
            }default:{
                throw new TypeException("Input only type rose, orchid or tulip");
            }
        }
    }


}
