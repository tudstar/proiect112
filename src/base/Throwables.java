package base;

public class Throwables {
    public static void main (String[] args) {
        //functionThatThrows();
        //  functionThatThrowsUncheckedExcepion();
        functionThatThrowsUncheckedError();
    }

    private static void functionThatThrows() throws Throwable {
        throw new Throwable();
    }

    private static void functionThatThrowsUncheckedExcepion() throws Exception {
        throw new Exception();
    }

    private static void functionThatThrowsUncheckedError(){
        throw new Error();
    }
}




