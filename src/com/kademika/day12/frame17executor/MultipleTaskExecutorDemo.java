package com.kademika.day12.frame17executor;

import com.kademika.day11.frame02byte.byteToSout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Ricky on 24.09.14.
 */
public class MultipleTaskExecutorDemo {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<Integer>> futures = new ArrayList<>();

        List<Integer> results = new ArrayList<>();
        try {

            for (int i = 0; i < 10; i++) {
                futures.add(executor.submit(new Task()));
            }

            while (!futures.isEmpty()) {

//                for (Future<Integer> future : futures) {
//                    if (future.isDone()) {
//                        System.out.println(future.get());
//                        futures.remove(future);
//                    }
//                }

//                results.add(future.get());
            }
        } finally {
            executor.shutdown();
        }

//        for (Integer i : results) {
//            System.out.println(i);
//        }
    }
}
