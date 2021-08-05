public class OOPPart1 {
    public static void main(String[] args) {

        //Bankaccount
        /*
        Bank account
        BankAccount person1 = new BankAccount(
                1234,
                5000,
                "Joe Smith",
                "joeSmith@emil.com",
                2121111111
                );

        System.out.println(person1);
        System.out.println(person1.withdraw(6000));
        System.out.println(person1.withdraw(600));
        System.out.println(person1.deposit(1200));
        System.out.println(person1.toString());

        VipCustomer person2 = new VipCustomer();
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Bob", 25000.00);
        System.out.println(person3.getName());

        VipCustomer person4 = new VipCustomer("Tim", 1000.00
                , "tim@email.com");
        System.out.println(person4.getName() + " " + person4.getCreditLimit());
        */

        //ComplexNumbers
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println("one.real " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
