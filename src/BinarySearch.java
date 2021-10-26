public class BinarySearch {

    public static void main(String[] args) {

        Integer[] array1= {1,6,9,12,14};

        System.out.println(SearchAlgorithms.BinarySearch(array1,0).equals(-1));
        System.out.println(SearchAlgorithms.BinarySearch(array1,1).equals(0));
        System.out.println(SearchAlgorithms.BinarySearch(array1,12).equals(3));
        System.out.println(SearchAlgorithms.BinarySearch(array1,14).equals(4));
        System.out.println(SearchAlgorithms.BinarySearch(array1,17).equals(-1));

        Integer[] array2= {3,7,11,12,20,22};

        System.out.println(SearchAlgorithms.BinarySearch(array2,0).equals(-1));
        System.out.println(SearchAlgorithms.BinarySearch(array2,3).equals(0));
        System.out.println(SearchAlgorithms.BinarySearch(array2,11).equals(2));
        System.out.println(SearchAlgorithms.BinarySearch(array2,22).equals(5));
        System.out.println(SearchAlgorithms.BinarySearch(array2,30).equals(-1));
    }
}
