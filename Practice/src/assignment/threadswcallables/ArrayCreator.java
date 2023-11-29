package assignment.threadswcallables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {
    int n;

    public ArrayCreator(int n) {
        this.n = n;
    }


    @Override
    public List<Integer> call() throws Exception {
        List<Integer> arrayList = new ArrayList<>();

        for(int i = 1; i<=n; i++)
            arrayList.add(i);
        return arrayList;
    }
}
