class Q4
{
    void test()
    {
        System.out.println("sucess");
    }
    static class inner{

        void test1()
        {
            Q4 out = new Q4();//object of Q4 class created
            out.test();//calling test function from Q4 class
        }
    }

    public static void main(String[] args) {
        Q4.inner obj = new Q4.inner(); // inner class object created
        obj.test1(); // calling test1 of inner class 
    }

}