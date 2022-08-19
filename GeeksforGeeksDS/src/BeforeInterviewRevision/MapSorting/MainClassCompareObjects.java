package BeforeInterviewRevision.MapSorting;

import java.util.*;
import java.util.stream.Collectors;

public class MainClassCompareObjects {


    public static void main(String[] args) {

        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee("Mickey", 10, 25, 10000);
        empArr[1] = new Employee("Arun", 20, 29, 20000);
        empArr[2] = new Employee("Lisa", 5, 35, 5000);
        empArr[3] = new Employee("Pankaj", 1, 32, 50000);


        int nums[] = {1,1,1,2,2,3};
        int nums2[] = {4,1,-1,2,-1,2,3} ;
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<nums2.length;i++){

            mp.put(nums2[i],mp.getOrDefault(nums2[i],0)+1) ;

        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey() + " "+entry.getValue());
        }

        System.out.println("Before");
        Map<Integer, Integer> result = mp.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        for(Map.Entry<Integer,Integer> entry : result.entrySet()){
            System.out.println(entry.getKey() + " "+entry.getValue());
        }


        Arrays.sort(empArr);
        System.out.println("\n"+ Arrays.toString(empArr));

    // Using Comparator
        Arrays.sort(empArr,Employee.ageComparator);
        System.out.println("\n"+ Arrays.toString(empArr));

//https://stackoverflow.com/questions/369512/how-to-compare-objects-by-multiple-fields
        // when using multiple objects to compare
        Comparator.comparing((Employee e)->e.getEmployeeId())
                  .thenComparing((e->e.getAge()))
                .thenComparing(e->e.getName()) ;
        System.out.println(Arrays.toString(empArr));
    }
}
