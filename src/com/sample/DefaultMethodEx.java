package com.sample;

public class DefaultMethodEx {

public static void main(String [] args){
    IOperation iop = new OperationSumOne();
    iop.sum(10,15);

    iop = new OperationSumTwo();
    iop.sum(10,15);

    iop = new OperationSumThree();
    iop.sum(10,15);

}
}

class OperationSumOne implements IOperation {


}

class OperationSumTwo implements IOperation {

    @Override
    public int sum(int a, int b) {
        System.out.println("In IOperationsSUM2");
        return a+b;
    }
}

class OperationSumThree implements IOperation {

    @Override
    public int sum(int a, int b) {
        System.out.println("adding in OperationSumThree");
        return a+b;
    }
}
interface IOperation {

    default public int sum (int a, int b){
        System.out.println("adding in IOperations");
        return a+b;
    }
}