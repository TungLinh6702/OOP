package org.example;
// 1. Java, Javac, JVM, JDK, JRE, Maven
// - Java: Ngôn ngữ lập trình
// - Javac: Trình biên dịch Java chuyển mã nguồn thành mã bytecode.
// - JVM (Java Virtual Machine): Máy ảo Java chạy bytecode trên các hệ điều hành khác nhau.
// - JDK (Java Development Kit): Bộ công cụ phát triển Java, bao gồm Javac, JVM và các công cụ khác.
// - JRE (Java Runtime Environment): Môi trường chạy Java chỉ chứa JVM và thư viện cần thiết để chạy ứng dụng Java.
// - Maven: Công cụ quản lý dự án, tự động hóa quy trình xây dựng và quản lý thư viện.
// Java ứng dụng có thể chạy không phụ thuộc vào hệ điều hành do có JVM làm trung gian giữa ứng dụng và hệ điều hành.
// Bytecode được sinh ra bởi Javac có thể chạy trên bất kỳ JVM nào, đảm bảo tính di động và tương thích.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// 2. Cú pháp cơ bản của Java
public class Main {
    public static void main(String[] args) {
        // Biến và kiểu dữ liệu
        int number = 10;
        double pi = 3.14;
        String text = "Hello, Java!";

        // Vòng lặp
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Câu lệnh điều kiện
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Non-positive number");
        }

        // Mảng
        int[] numbersArray = {1, 2, 3, 4, 5};

        // Chuỗi
        String greeting = "Hello";
        String name = "John";
        String message = greeting + ", " + name + "!";

        // Hàm
        int sum = add(3, 4);
        System.out.println("Sum: " + sum);

        // Lớp và đối tượng
        Car myCar = new Car("Toyota", "Camry");
        myCar.start();
    }

    // Hàm
    public static int add(int a, int b) {
        return a + b;
    }
}

// 3. OOP trong Java
class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Tính đóng gói
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    // Tính trừu tượng
    public void start() {
        System.out.println("The vehicle is starting.");
    }
}

class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    // Đa hình (override)
    @Override
    public void start() {
        System.out.println("The car is starting with a key.");
    }
}

// 4. Exception và Debugging
class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Mã có thể gây ra ngoại lệ
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            // Xử lý ngoại lệ
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

// 5. Java Collection Framework


class CollectionFramework {
    public static void main(String[] args) {
        // List
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        // Set (không được minh họa)

        // Map
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
    }
}

// 6. Generic trong Java
class GenericExample<T> {
    private T value;

    public GenericExample(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericExample<String> stringExample = new GenericExample<>("Hello, Generics!");
        System.out.println("Generic Value: " + stringExample.getValue());
    }
}
