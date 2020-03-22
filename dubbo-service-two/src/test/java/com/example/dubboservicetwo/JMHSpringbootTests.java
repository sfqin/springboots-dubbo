package com.example.dubboservicetwo;

import com.example.dubboservicetwo.service.UserService;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

@State(Scope.Thread)
public class JMHSpringbootTests {

    private ConfigurableApplicationContext context;

    private UserService userService;

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder().include(JMHSpringbootTests.class.getName() + ".*")
                .warmupIterations(2).measurementIterations(2)
                .forks(1).build();
        new Runner(options).run();
    }

    /**
     * setup初始化容器的时候只执行一次
     */
    @Setup(Level.Trial)
    public void init(){
        String arg = "";
        context = SpringApplication.run(DubboServiceTwoApplication.class,arg);
        userService = context.getBean(UserService.class);
    }


    @Benchmark
    public void test_rpc(){
        System.out.println(userService.sayHello("小小"));
    }


    @Benchmark
    public void test_local(){
        System.out.println(userService.sayHelloV2("小小"));
    }

}
