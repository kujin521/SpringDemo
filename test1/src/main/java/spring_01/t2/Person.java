package spring_01.t2;

public class Person {
    public ICar mycar;

    public Person(ICar mycar) {
        this.mycar = mycar;
    }

    public Person(int i){
        if (i==1){
            mycar=new BMWCar();
        }else {
            mycar=new ToyoCar();
        }

    }

    public void drive(){
        mycar.getCar();
        mycar.oil();
        mycar.run();
    }
}
