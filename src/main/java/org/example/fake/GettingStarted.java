package org.example.fake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GettingStarted {


    public static void main(String[] args) {
        List<String> peaple = List.of("Mohamed", "Abdi","Afrika","Afrika","Afrika","Afrika","Afrika","Afrika","Afrika","Afrika","Afrika","Afrika","Afrika","Afrika","Afrika","Afrika","Afrika","Afrika");
        List<String> adPeaple = new ArrayList<>();
        int limit = 5;
        int count = 0;
        for (String dad: peaple) {

            if(dad.startsWith("A")){
                adPeaple.add(dad);
                count++;
                if(count == limit){
                    break;
                }
            }
        }
        System.out.println("limit = " + limit);

        long counted = peaple.stream().filter(p->p.startsWith("A")).limit(5).count();
        System.out.println("counted = " + counted);

    }




}
