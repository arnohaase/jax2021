package com.ajjpj.javaworkshop.memleaks;

public class Main {
    public static void main(String[] args) {
        var m = new MemLeakMaps();

        System.out.println(Runtime.getRuntime().freeMemory() + " / " + Runtime.getRuntime().totalMemory());

        for (int i=0; i<1_000_000; i++) {
            m.veryImportantApi(new Person("namasd ökja sdfdöljkas jfklöda jflköda jfködsa jfakds jfklödasj fkdasj flködas jfkdasj fklsdöaj fklödaj flksadjfklasdjfkldsa fklösad jlkjö4iojaliorjfgaorj lafjs lfja rj lddjasflkösdj gflkdasjf asdjf asdljf askdlfj asdköj klöasjfa öjljlköasdffkj asjdkfjkl öasdjk jkl a sköjflkj alökj daflkj asdköjjldksa fjkfasd fjasd kfjasd kfasdj klfasjdföl asdjlkf asdjkle-" + i));
        }

        System.out.println(Runtime.getRuntime().freeMemory() + " / " + Runtime.getRuntime().totalMemory());
        System.out.println(MemLeakMaps.statistics.size());
    }
}
