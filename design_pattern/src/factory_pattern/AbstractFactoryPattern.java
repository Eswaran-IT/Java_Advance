package factory_pattern;
// Define Abstract Product Interfaces
interface CPU {
    void process();
}

interface RAM {
    void load();
}

// Create Concrete Product Implementations
class IntelCPU implements CPU {
    @Override
    public void process() {
        System.out.println("Intel CPU is processing data.");
    }
}

class AMDCPU implements CPU {
    @Override
    public void process() {
        System.out.println("AMD CPU is processing data.");
    }
}

class KingstonRAM implements RAM {
    @Override
    public void load() {
        System.out.println("Kingston RAM is loading data.");
    }
}

class CorsairRAM implements RAM {
    @Override
    public void load() {
        System.out.println("Corsair RAM is loading data.");
    }
}

// Create Abstract Factory Interfaces
interface ComputerFactory {
    CPU createCPU();
    RAM createRAM();
}

// Implement Concrete Factory Implementations
class HighPerformanceComputerFactory implements ComputerFactory {
    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public RAM createRAM() {
        return new KingstonRAM();
    }
}

class BudgetComputerFactory implements ComputerFactory {
    @Override
    public CPU createCPU() {
        return new AMDCPU();
    }

    @Override
    public RAM createRAM() {
        return new CorsairRAM();
    }
}

// Client Code
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        // Creating a high-performance computer
        ComputerFactory highPerformanceFactory = new HighPerformanceComputerFactory();
        CPU highPerformanceCPU = highPerformanceFactory.createCPU();
        RAM highPerformanceRAM = highPerformanceFactory.createRAM();

        highPerformanceCPU.process();
        highPerformanceRAM.load();

        // Creating a budget computer
        ComputerFactory budgetFactory = new BudgetComputerFactory();
        CPU budgetCPU = budgetFactory.createCPU();
        RAM budgetRAM = budgetFactory.createRAM();

        budgetCPU.process();
        budgetRAM.load();
    }
}
