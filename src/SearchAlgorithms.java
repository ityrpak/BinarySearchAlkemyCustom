public class SearchAlgorithms {

    public Integer BinarySearch(Integer[] sortedArray, Integer target){

        int arrayLength = sortedArray.length;
        int arrayFirst = 0;
        int arrayLast = arrayLength-1;
        int readPosition = (arrayLast + arrayFirst)/2;

        while (target != sortedArray[readPosition] && arrayLength > 0){
            if (target < sortedArray[readPosition]){
                arrayLast = readPosition;
                readPosition = (arrayLast + arrayFirst)/2;
                arrayLength /= 2;
            } else {
                arrayFirst = readPosition + 1;
                readPosition = (arrayLast + arrayFirst)/2;
                arrayLength /= 2;
            }
        }

        if (sortedArray[readPosition] != target){
            readPosition = -1;
        }

        return readPosition;
    }

}
