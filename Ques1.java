
class prog1{
    static int Age;
    static String FirstName;
    static String LastName = "Pandey";
    static {
    System.out.println("This is Static Block to print values");
    Age=24;
    FirstName="Alok";
    LastName="Kumar";
    System.out.println(FirstName +" " +LastName + " " +Age );

    }
    static void change(){
        FirstName="Shubham";
        LastName="Pandey";
    }
    void disp() {
    System.out.println("FirstName is: " +FirstName);
    System.out.println("LastName is: " +LastName);
    System.out.println("Age: " +Age);
    }
    public static void main(String[] args)
    {
        prog1.change();
        System.out.println(FirstName +" " +LastName + " " +Age );

    prog1 p=new prog1();
    p.disp();
    }
    }
    