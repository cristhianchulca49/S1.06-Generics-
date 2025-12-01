package Level1.E1;

public class NoGenericMethods {
    private Object object1;
    private Object object2;
    private Object object3;

    public NoGenericMethods (Object object1, Object object2, Object object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }
    // setters
    public void setObject1(Object object1) {
        this.object1 = object1;
    }

    public void setObject2(Object object2) {
        this.object2 = object2;
    }

    public void setObject3(Object object3) {
        this.object3 = object3;
    }

    // getters
    public Object getObj1() {
        return object1;
    }

    public Object getObj2() {
        return object2;
    }

    public Object getObj3() {
        return object3;
    }
}
