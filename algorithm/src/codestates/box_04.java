package codestates;

import java.util.*;

public class box_04 {
    public int paveBox(Integer[] boxes){
        ArrayList<Integer> answer = new ArrayList<>();
        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(boxes));
        //해당 문제에서는 주로 볼 것은 subList를 통해서 각 사람을 기준으로 몇 명이 기다릴지를 찾는 것이다.
        //for문을 통해서 0번째 사람을 몇 명이 기다릴 것인지 확인하고
        //subList를 통해서 0번째 사람을 제외하여 새롭게 리스트를 만들고 for문을 돈다
        while( arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) > arrayList.get(0)) {
                    answer.add(i);
                    arrayList = arrayList.subList(i, arrayList.size());
                    break;
                }
                if (i == arrayList.size() - 1) {
                    answer.add(arrayList.size());
                    arrayList.clear();
                }
            }
        }

        return answer.stream().max(Integer::compare).orElse(-1);
    }

}
