package Assignment5;

public class ComplexNumber2022503567 {

}
class ComplexNumber {
    double real;
    double imaginary;
    ComplexNumber(double real, double imaginary){
        this.real = real ;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return this.real;
    }
    public double getimaginary(){
        return this.real;
    }
    public ComplexNumber add(ComplexNumber other){
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;

        return new ComplexNumber(newReal,newImaginary);
    }
    public ComplexNumber sub(ComplexNumber other){
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;

        return new ComplexNumber(newReal,newImaginary);
    }
    public ComplexNumber mul(ComplexNumber other){
        double newReal = (this.real*other.real)-(this.imaginary*other.imaginary);
        double newImaginary = (this.real * other.imaginary)+(this.imaginary * other.real);

        return new ComplexNumber(newReal,newImaginary);
    }
    public ComplexNumber div(ComplexNumber other){
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        ComplexNumber other = (ComplexNumber) obj;
        return (Double.compare(other.real, real) == 0 && Double.compare(other.imaginary, imaginary) == 0);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(1, -2);
        System.out.println("Harikrishnan K S 2022503567");
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        ComplexNumber sum = c1.add(c2);
        ComplexNumber difference = c1.sub(c2);
        ComplexNumber product = c1.mul(c2);
        ComplexNumber quotient = c1.div(c2);
        boolean isEqual = c1.equals(c2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("c1 equals c2: " + isEqual);
    }
}
