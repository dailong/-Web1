package service;

/**
 * Created by dailong on 2016/3/17.
 */
public   class Main {
    public static void main(String[] args) {
        A p = new A();
        p.aa();
    }
}

interface person {
   void aa();
}


class A implements person {
    @Override
    public void aa() {

    }
}

class B implements person {
    @Override
    public void aa() {

    }
}