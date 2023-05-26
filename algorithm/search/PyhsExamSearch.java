package algorithm.search;

import java.util.Arrays;

public class PyhsExamSearch {

    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        @Override
        public String toString() {
            return "physcData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        public static class HeightOrderComparator implements Comparator<PhyscData>{

            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return o1.height - o2.height;
            }
        }

        public static void main(String[] args) {
            PhyscData[] arr = {
                    new PhyscData("kim", 159, 0.8),
                    new PhyscData("lee", 171, 1.5),
                    new PhyscData("park", 173, 0.7),
                    new PhyscData("choi", 152, 0.6),
                    new PhyscData("han", 186, 1.2),
                    new PhyscData("hwi", 165, 0.2),
                    new PhyscData("cha", 149, 1.7)
            };
            int height = 152;
            int idx = Arrays.binarySearch(
                    arr,
                    new PhyscData("", height, 0.0),
                    PhyscData.HEIGHT_ORDER
            );

        }
    }

}
