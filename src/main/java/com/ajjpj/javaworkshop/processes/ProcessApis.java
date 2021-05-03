package com.ajjpj.javaworkshop.processes;

import java.io.IOException;

public class ProcessApis {
    public static void main(String[] args) throws IOException, InterruptedException {
        var current = ProcessHandle.current();
        System.out.println(current.pid());
        System.out.println(current.info().commandLine());

        ProcessHandle ph = current;
        while(ph != null) {
            System.out.println(ph.pid());
            ph = ph.parent().orElse(null);
        }

        var process = new ProcessBuilder()
                .command("/bin/bash")
                .start();

        process.waitFor();
    }
}
