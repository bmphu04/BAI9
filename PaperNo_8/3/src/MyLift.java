
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC MSI
 */
public class MyLift implements ILift {

    @Override
    public int f1(List<Lift> t) {
        int maxLoad = -1;
        for (Lift i : t) {
            if (isPrime(i.getLabel().length())) {
                maxLoad = Math.max(maxLoad, i.getLoad());
            }
        }
        return maxLoad;
    }
    
    private boolean isPrime(int n){
        if (n < 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public void f2(List<Lift> t) {
        int n = Math.min(5, t.size());
        for (int i = 0; i < n / 2; i++) {
            Collections.swap(t, i, n - 1 - i);
        }
    }

    @Override
    public void f3(List<Lift> t) {
        if (t.size() > 1 && t.get(2).getLoad() < 20) {
            t.remove(2);
        }
    }

    
}
