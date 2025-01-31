package modifiers;

public abstract class Q2Abstract {
    String name;
    public abstract void print(int id);
    public abstract void printId();

    public void printName(String name) {
        this.name= name;
    }
}



class ex extends Q2Abstract {

    @Override
    public void print(int id) {

    }

    @Override
    public void printId() {

    }
}