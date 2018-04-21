package Task_23;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
    private Set<Integer> set;
    private Set<Integer> setCommon = new LinkedHashSet<>();
    private int counter1;


    public Sets() {
        this.set = new LinkedHashSet<>();
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void printSets(){
        System.out.println(set);
    }

    public void printCommonSet(){
        System.out.print("Common Set: ");
        System.out.println(setCommon);
    }

    public void addElementToSet(int number){
        findDuplicate(number);
        set.add(number);
        counter1++;
    }

    public void getCommonSet(Set set1){
        for (Object a: set1
             ) {
            if (!findDuplicate(((int) a))){
                setCommon.add(((int) a));
            }
        }

    }

    private boolean findDuplicate(int n){
        for (int number: set
             ) {
            if (number == n){
                return false;
            }
        }
        return true;
    }

    public void remove(int n){
        if (counter1 < 1){
            return;
        }
        else{
            set.remove(n);
        }
    }
}
