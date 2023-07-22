package Problem;

public class Lion implements Animal{

    @Override
    public void fly(){
        try {
            throw new Exception("Lion can not fly");
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

    @Override
    public void eat() {
        System.out.println("Animal can eat");
    }
}
