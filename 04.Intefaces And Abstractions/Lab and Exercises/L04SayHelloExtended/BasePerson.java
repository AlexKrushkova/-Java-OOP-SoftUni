package L04SayHelloExtended;

public abstract class BasePerson implements Person{

    private String name;

    protected BasePerson(String name){
        this.setName(name);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = this.name;
    }
}
