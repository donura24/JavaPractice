package JavaPractice.OOP.Abstraction;

class MethodBenchmark extends BenchMark{
    void benchmark(){
    }

    public static void main(String[] args) {
        int count = 2;
        long time = new MethodBenchmark().repeat(count);
        System.out.println(count + " methods in " + time + " nanoseconds");
    }
}
