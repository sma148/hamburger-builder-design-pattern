import java.util.StringJoiner;

public class Hamburger {

    private String name; // mandatory
    private String size; //mandatory
    private boolean extraCheese; //optional
    private boolean addChips; //optional

    public Hamburger(String name, String size, boolean extraCheese, boolean addChips) {
        this.name = name;
        this.size = size;
        this.extraCheese = extraCheese;
        this.addChips = addChips;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Hamburger.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("size='" + size + "'")
                .add("extraCheese=" + extraCheese)
                .add("addChips=" + addChips)
                .toString();
    }

public static class Builder{

    private String name; // mandatory
    private String size; //mandatory
    private boolean extraCheese = false; //optional
    private boolean addChips = false; //optional


    public Builder(String name, String size){
      this.name = name;
      this.size = size;

    }

    public Builder AddExtracheese(){
      this.extraCheese = true;
      return this;
    }

    public Builder AddChips(){
      this.addChips = true;
      return this;
    }

    public Hamburger build(){
      return new Hamberger(this);
    }
}


}