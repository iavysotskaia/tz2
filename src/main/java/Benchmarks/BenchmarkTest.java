package Benchmarks;

import org.example.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Random;



public class BenchmarkTest {
    @Benchmark
    public void test_sum_b1(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<10; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._sum(a);

    }
    @Benchmark
    public void test_sum_b2(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<20; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._sum(a);

    }
    @Benchmark
    public void test_sum_b3(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<30; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._sum(a);

    }
    @Benchmark
    public void test_sum_b4(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<40; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._sum(a);

    }
    @Benchmark
    public void test_sum_b5(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<50; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._sum(a);
    }
    @Benchmark
    public void test_sum_b6(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<60; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._sum(a);
    }
    @Benchmark
    public void test_mult_b1(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<10; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._mult(a);
    }
    @Benchmark
    public void test_mult_b2(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<20; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._mult(a);
    }
    @Benchmark
    public void test_mult_b3(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<30; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._mult(a);
    }
    @Benchmark
    public void test_mult_b4(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<40; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._mult(a);
    }
    @Benchmark
    public void test_mult_b5(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<50; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._mult(a);
    }
    @Benchmark
    public void test_mult_b6(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<60; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._mult(a);
    }
    @Benchmark
    public void test_min_b1(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<10; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._min(a);
    }
    @Benchmark
    public void test_min_b2(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<20; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._min(a);
    }
    @Benchmark
    public void test_min_b3(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<30; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._min(a);
    }
    @Benchmark
    public void test_min_b4(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<40; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._min(a);
    }
    @Benchmark
    public void test_min_b5(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<50; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._min(a);
    }
    @Benchmark
    public void test_min_b6(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<60; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._min(a);
    }
    @Benchmark
    public void test_max_b1(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<10; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._max(a);
    }
    @Benchmark
    public void test_max_b2(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<20; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._max(a);
    }
    @Benchmark
    public void test_max_b3(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<30; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._max(a);
    }
    @Benchmark
    public void test_max_b4(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<40; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._max(a);
    }
    @Benchmark
    public void test_max_b5(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<50; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._max(a);
    }
    @Benchmark
    public void test_max_b6(){
        ArrayList<Long> a = new ArrayList<Long>();
        Random rand = new Random();
        for (int i = 0; i<60; i++){
            long randomLong;
            randomLong = rand.nextLong(100);
            a.add(randomLong);

        }
        Main._max(a);
    }
    public static void main(String[] args) {
        Options opt = new OptionsBuilder()
                .include(BenchmarkTest.class.getSimpleName())
                .warmupTime(TimeValue.seconds(1))
                .measurementTime(TimeValue.seconds(1))
                .forks(1)
                .build();

        try {
            Runner runner = new Runner(opt);
            Collection<RunResult> result =  runner.run();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
