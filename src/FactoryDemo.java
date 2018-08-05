public class FactoryDemo {


    public static void main(String[] args) {
       System.out.println(Factory.getFruit("apple").get());

    }


}

class Factory {
    public static IFruit getFruit(String name){
        if(name.equals("apple")){
            return new Apple();
        }else if(name.equals("orange")){
            return new Orange();
        }else{
            return new IFruit() {
                @Override
                public String get() {
                    return "";
                }
            };
        }
    }
}


interface IFruit{
    public String get();
}

class Apple implements IFruit{

    @Override
    public String get() {
        return " get Apple! ";
    }
}

class Orange implements IFruit{

    @Override
    public String get() {
        return " get Orange! ";
    }
}