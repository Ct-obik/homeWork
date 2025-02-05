package Tree.homeWork.src.HumanGroup.Comparators;

import Tree.homeWork.src.HumanGroup.Human;

import java.util.Comparator;

public class HumanComparatorByName implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
