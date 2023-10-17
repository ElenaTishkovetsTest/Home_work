package home_work_3.calcs.api;

public interface ICalculator {

    /**
     * складывает два числа с плавающей точкой
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат сложения двух чисел а и b
     */
    double add(double a, double b);

    /**
     * нахоидит разницу между двумя числами с плавающей точкой
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат вычитания чисел b из числа a
     */
    double subtract(double a, double b);

    /**
     * умножает два числа с плавающей точкой
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат умножения двух чисел а и b
     */
    double multiply(double a, double b);

    /**
     * делит одно число с плавающей точкой на другое
     * @param a признак первое дробное число
     * @param b признак второе дробное число
     * @return результат деления числа а на число b
     */
    double divide(double a, double b);

    /**
     * Метод возведения в степень числа с плавающей точкоей
     * @param a     признак число с плавающей точкой
     * @param b признак степень
     * @return результат возведения числа с плавающей точкой встепень
     */
    double power(double a, int b);

    /**
     * Определяет модуль числа с плавающей точкой
     * @param a признак число с плавающей точкой
     * @return модуль числа с плавающей точкой
     */
    double absolute(double a);

    /**
     * извлекает квадратный корень из числа с плавающей точкой
     * @param a признак число с плавающей точкой
     * @return квадратный корень из числа с плавающей точкой
     */
    double squareRoot(double a);
}
