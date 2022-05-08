package hashMap;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 04-May-22
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Theory {
    public static void main(String[] args) {
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("Raj", 7764904152L);
        hashMap.put("Gagan", 9065653463L);
        hashMap.put("Suraj", 8271839070L);
        hashMap.put("Kajal", 7764904152L);
        hashMap.put("Rani", 7250360154L);
        System.out.println(hashMap.values());
        Set<Map.Entry<String, Long>> set = hashMap.entrySet();
        System.out.println("Name" + " : " + "Mobile Number");
        for (Map.Entry<String, Long> e : set) {
            System.out.println(e.getKey() + " : " + e.getValue());

        }


    }
}
