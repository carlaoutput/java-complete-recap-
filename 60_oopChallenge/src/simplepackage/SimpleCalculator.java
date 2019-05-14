package simplepackage;

public class SimpleCalculator {

    public double firstNumber;
    public double secondNumber;

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }

    public double getAdditionResult(){ //it needs to return the result of adding the field values of firstNumber and secondNumber.

        return (this.firstNumber + this.secondNumber);
    }
    public double getSubtractionResult (){ //it needs to return the result of subtracting the field values of secondNumber from the firstNumber
        return (this.firstNumber - this.secondNumber);

    }
    public double getMultiplicationResult(){ //it needs to return the result of multiplying the field values of firstNumber and secondNumber
        return (this.firstNumber * this.secondNumber);
    }
    public double getDivisionResult(){
        if (this.secondNumber == 0){
            return 0;
        }
        else{
            return (this.firstNumber / this.secondNumber);
        }
    }

} // end class
