class InvalidInputException extends Exception{
    @Override
    public String getMessage() {
        return " InvalidInputException";

    }

    @Override
    public String toString() {
        return " InvalidInputException";
    }
}
class MaxInputException extends Exception{
    @Override
    public String getMessage() {
        return " MaximumInputException";

    }

    @Override
    public String toString() {
        return " MaximumInputException";
    }
}
class  MaxMultiplyInputException extends Exception{
    @Override
    public String getMessage() {
        return "Sorry the multiply input cannot be grater then 7000 ";

    }

    @Override
    public String toString() {
        return " Sorry the multiply input cannot be grater then 7000";
    }
}
class CanNotDivide extends Exception{
    @Override
    public String getMessage() {
        return "Sorry i cannot divide by zero  ";

    }

    @Override
    public String toString() {
        return " Sorry i cannot divide by zero ";
    }
}


class CustomCalculator {
    public double add(double a , double b) throws  InvalidInputException,MaxInputException{
       if (a=='&' || b=='&')
           throw new  InvalidInputException();
       else if (a>100000 || b>100000)
           throw new MaxInputException();
else
        return a+b;
    }


    public double subtract(double a , double b) throws InvalidInputException,MaxInputException{
        if (a=='&' || b=='&')
            throw new  InvalidInputException();
        else if (a>100000 || b>100000)
            throw new MaxInputException();
        
        return a-b;
    }

    public double multiply(double a , double b) throws InvalidInputException,MaxInputException, MaxMultiplyInputException{
        if (a=='&' || b=='&')
            throw new  InvalidInputException();
        else if (a>100000 || b>100000)
            throw new MaxInputException();
        else if (a>7000 || b>7000) {
            throw new MaxMultiplyInputException();
        }


        return a*b;
    }

    public double divide(int a , int  b)throws InvalidInputException,MaxInputException, CanNotDivide{
        if (a=='&' || b=='&')
            throw new  InvalidInputException();
        else if (a>100000 || b>100000)
            throw new MaxInputException();
        else if (b==0)
            throw new CanNotDivide();
        else
        return a/b;
    }
}





public class _103_exercise6_sol {
    public static void main(String[] args) throws InvalidInputException,MaxInputException, CanNotDivide , MaxMultiplyInputException {
       CustomCalculator c = new CustomCalculator();
      double a= c.add(6,5);
     double f=  c.subtract(5555,66);
     try {
         double b= c.divide(55,0);
         System.out.println(b);
     }catch (Exception e){
         System.out.println(e);
     }


      double v = c.multiply(55,5);
        System.out.println(a);
        System.out.println(f);

        System.out.println(v);
    }
}
