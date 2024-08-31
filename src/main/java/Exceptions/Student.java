package Exceptions;

import java.sql.SQLException;

public class Student {
    public int findStudentByRollNo(int rollNo) throws ClassNotFoundException, OddNumberException {
        if(rollNo < 30){
            throw new ClassNotFoundException(); //Checked exceptions
            //throw new ArithmeticException()
        } else if(rollNo % 2 == 1){
            throw new OddNumberException();
        } else if (rollNo % 2 == 0){
            throw new EvenNumberException();
        }

        int a = 10, b = 5;
        if(b != 0) {
            int temp = a / b;
        }

        return 1;
        //return 1 / 0;

    }

    public void doSomething(int rollNo) throws SQLException{
        try {

            if (rollNo < 30) {
                throw new ClassNotFoundException(); //Checked exceptions
                //throw new ArithmeticException()
            } else if (rollNo % 2 == 1) {
                throw new OddNumberException();
            } else if (rollNo % 2 == 0) {
                throw new EvenNumberException();
            } else{
                throw new SQLException();
            }
        }
        catch(ClassNotFoundException ex1){


        }catch (OddNumberException ex2){

        }catch(EvenNumberException ex3) {

        } catch(Exception ex4){

        }
    }

    public void doShit(int x){
        doShit(x);
    }
}
