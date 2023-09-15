/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Objects;

public class ComplexNumber {

    private double re;
    private double im;

    /**
     * Constructor of the ComplexNumber
     *
     * @param a real part
     * @param b imaginary part
     */
    ComplexNumber(double a, double b) {

    }

    /**
     * @return the real part of the ComplexNumber
     */
    public double realPart() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the imaginary part of the ComplexNumber
     */
    public double imaginaryPart() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Adds c to the ComplexNumber
     *
     * @param d number to add
     * @return this + c
     */
    public ComplexNumber add(ComplexNumber c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the result of subtracting c from the ComplexNumber
     *
     * @param c subtracting
     * @return this - c
     */
    public ComplexNumber subtract(ComplexNumber c) {
        return new ComplexNumber(re-c.re, im-c.im);
    }

    /**
     * Returns multiplication of c and the ComplexNumber
     *
     * @param c multiplying
     * @return this * c2
     */
    public ComplexNumber multiply(ComplexNumber c) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    /**
     * Returns the division of the ComplexNumber by c
     *
     * @param c divider
     * @return this / c
     */
    public ComplexNumber division(ComplexNumber c) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    /**
     * Returns the conjugate of the ComplexNumber
     *
     * @return a - ib
     */
    public ComplexNumber conjugate() {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    /**
     * Returns the module of the ComplexNumber
     *
     * @return sqrt (a² + b²)
     */
    public double module() {
        throw new UnsupportedOperationException("Not supported yet.");

    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null) return false;
        ComplexNumber c = (ComplexNumber) obj;
        return Double.compare(re , c.re)==0 && Double.compare(im, c.im)==0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }


    public static class ComplexNumberException extends Exception {

        public ComplexNumberException(String message) {
            super("Complex Number exception");
        }
    }
}
