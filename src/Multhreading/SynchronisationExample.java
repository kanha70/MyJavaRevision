package Multhreading;

class Salary {
    private double basic;
    private int status;

    public synchronized void Submit() {
        try {
            status = 1;
            basic = 50000;
            System.out.println("Salary Transfered");
            notify();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized double print() {
        try {
            if (status == 0) {
                System.out.println("Please Wait...");
                wait();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return basic;
    }
}

class Employee extends Thread {
    private Salary salary;

    public Employee(Salary salary) {
        this.salary = salary;
    }

    public void run() {
        System.out.println("Amount " + salary.print());
    }
}

class Company extends Thread {
    public Salary salary;

    public Company(Salary salary) {
        this.salary = salary;
    }

    public void run() {
        salary.Submit();
    }
}

class SynchronisationExample {
    public static void main(String[] args) {
        Salary obj = new Salary();
        Employee t1 = new Employee(obj);
        Company t2 = new Company(obj);
        t1.start();
        t2.start();

    }
}