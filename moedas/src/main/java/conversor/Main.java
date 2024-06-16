package conversor;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        MyClass myObject = new MyClass();
        String json = gson.toJson(myObject);
        
        System.out.println(json);

        System.out.println("Hello world!");
    }
}

class MyClass {
    
    private  String name = "Hello, There obiwan";
    private int value = 42;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "MyClass{name='" + name + "', value=" + value + "}";
    }

}